/*
 * i2c.c
 *
 * Created: 12.11.2020
 * Author : Matthias Korte
 */

#define SDA 0b00010000
#define SCL 0b00100000

#include <avr/io.h>
#include "Display.h"

void warte(){
	for (int i = 0; i < 16; i++){}
}

void i2c_start()
{
	DDRC = DDRC | SDA | SCL;
	warte();
	PORTC = PORTC | SDA | SCL;
	warte();

	PORTC = PORTC & (~SDA);
	warte();
	PORTC = PORTC & (~SCL);
}

void i2c_stop()
{
	DDRC = DDRC | SDA;
	warte();
	PORTC = PORTC & (~SDA);
	warte();
	PORTC = PORTC | SCL;
	warte();
	PORTC = PORTC | SDA;
}

char i2c_write(char wert)
{
	char maske, ACK;

	DDRC = DDRC | SDA;	//SDA: Ausgang
	warte();
	for(maske = 0x80; maske > 0; maske = maske>>1)
	{
		if ((wert & maske) != 0)
		{
			PORTC = PORTC | SDA;
		}else{
			PORTC = PORTC & (~SDA);	//SDA = 0
		}
		warte();
		PORTC = PORTC | SCL;	//SCL = 1
		warte();
		PORTC = PORTC & (~SCL);	//SCL = 0
	}

	DDRC = DDRC & (~SDA);	//SDA: Eingang
	PORTC = PORTC | SCL;	//SCL = 1, 9. Taktimpuls

	warte();

	ACK = (PINC & SDA)>>4;
	PORTC = PORTC & (~SCL);	//SCL = 0

	return ACK;
}

char i2c_read()
{
	char wert = 0;

	DDRC = DDRC & (~SDA);

	for (char i = 0; i < 8; i++)
	{
		wert = wert << 1;
		wert = wert | ((PINC & SDA) >> 4);

		PORTC = PORTC | SCL;

		warte();

		PORTC = PORTC & (~SCL);
	}

	return wert;
}

void m_ack()
{
	DDRC = DDRC | SDA;

	PORTC = PORTC & (~SDA);
	PORTC = PORTC | SCL;
	PORTC = PORTC & (~SCL);
}

void m_n_ack()
{
	DDRC = DDRC | SDA;

	PORTC = PORTC | SDA;
	PORTC = PORTC | SCL;
	PORTC = PORTC & (~SCL);
}

int main(void)
{
	Disp_init();
	hex = 0;

    while (1)
    {
		i2c_start();
		zahl = i2c_write(0x90);		//Adresse: 0x90
		i2c_stop();
    }
}
