/* I2C-Bibliothek */

#include <avr/io.h>

#define SCL 0x20
#define SDA 0x10

void warte()
{
	uint8_t volatile k, m;
	for (k = 0; k < 5; k++)
	{
		m = k;
	}
}

void i2c_start()
{
	DDRC = DDRC | SDA | SCL;		//SDA und SCL Ausgaenge
	PORTC = PORTC | SDA | SCL;		//SDA = SCL = 1
	warte();
	PORTC = PORTC & ~SDA;			//SDA = 0
	warte();
	PORTC = PORTC & ~SCL;			//SCL = 0
	warte();
}

void i2c_stop()
{
	PORTC = PORTC & ~SDA;			//SDA = 0
	warte();
	PORTC = PORTC | SCL;			//SCL = 1
	warte();
	PORTC = PORTC | SDA;			//SDA = 1
	warte();
}

uint8_t i2c_write(uint8_t data)
{
	uint8_t maske;
	for(maske = 0x80; maske > 0; maske = maske >> 1)
	{
		if((data & maske) == 0)
			PORTC = PORTC & ~SDA;	//SDA = 0
		else
			PORTC = PORTC | SDA;	//SDA = 1
		warte();
		PORTC = PORTC | SCL;		//SCL = 1
		warte();
		PORTC = PORTC & ~SCL;		//SCL = 0
	}
	warte();
	DDRC = DDRC & ~SDA;				//SDA Eingang
	PORTC = PORTC | SCL;			//SCL = 1
	warte();
	if((PINC & SDA) == 0)			//ACK ?
		maske = 0;
	else
		maske = 1;					//NACK
	PORTC = PORTC & ~SCL;			//SCL = 0
	DDRC = DDRC | SDA;				//SDA Ausgang
	return(maske);
}

uint8_t i2c_read()
{
	uint8_t stelle, wert = 0;
	DDRC = DDRC & 0xEF;				//SDA Eingang
	warte();
	for(stelle = 0x80; stelle > 0; stelle = stelle >> 1)
	{
		PORTC = PORTC | 0x20;		//SCL = 1
		warte();
		if((PINC & 0x10) != 0)		//SDA == 1 ?
			wert = wert + stelle;
		PORTC = PORTC & 0xDF;		//SCL = 0
		warte();
	}
	DDRC = DDRC | 0x10;				//SDA Ausgang
	return(wert);
}

void i2c_m_ack()
{
	PORTC = PORTC & ~SDA;			//SDA = ACK = 0
	PORTC = PORTC | SCL;			//SCL = 1
	warte();
	PORTC = PORTC & ~SCL;			//SCL = 0
	warte();
}

void i2c_m_nack()
{
	PORTC = PORTC | SDA;			//SDA = NACK = 1
	PORTC = PORTC | SCL;			//SCL = 1
	warte();
	PORTC = PORTC & ~SCL;			//SCL = 0
	warte();
}
