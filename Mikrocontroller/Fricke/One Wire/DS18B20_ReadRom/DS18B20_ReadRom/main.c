/*
 * DS18B20_ReadRom.c
 *
 * Created: 04.02.2021 12:06:26
 * Author : Matthias Korte
 */ 

#define F_CPU 16000000UL

#define oneWire (1<<PB4)
#define t_conv 750

#define readRom 0x33

#include <avr/io.h>
#include <util/delay.h>
#include "Display.h"

uint8_t reset()
{
	uint8_t r = 0;

	cli();
	PORTB &= ~oneWire;				//oneWire: 0
	sei();

	_delay_us(480);

	cli();
	PORTB |= oneWire;				//oneWire: 1
	sei();

	DDRB &= ~oneWire;				//oneWire = Eingang

	_delay_us(70);

	r = (PINB & oneWire);			//oneWire: Lesen

	DDRB |= oneWire;				//oneWire = Ausgang

	_delay_us(410);

	return r;
}


void write(int data)
{
	for(int i = 0; i < 8; i++)
	{
		if (data & 1)
		{
			cli();
			PORTB &= ~oneWire;						//oneWire: 0
			sei();

			_delay_us(10);

			cli();
			PORTB |= oneWire;						//oneWire: 1
			sei();

			_delay_us(50);
			} else {
			cli();
			PORTB &= ~oneWire;						//oneWire: 0
			sei();

			_delay_us(60);

			cli();
			PORTB |= oneWire;						//oneWire: 1
			sei();
		}
		_delay_us(10);

		data >>= 1;
	}
}


uint8_t read()
{
	uint8_t r = 0;
	uint8_t data = 0;

	for(uint8_t i = 0; i < 8; i++)
	{
		r >>= 1;

		cli();
		PORTB &= ~oneWire;							//oneWire: 0
		sei();
		_delay_us(6);

		cli();
		PORTB |= oneWire;							//oneWire: 1
		sei();
		_delay_us(9);

		DDRB &= ~oneWire;							//oneWire = Eingang

		data +=  (PINB & oneWire);					//oneWire: Lesen

		data <<= 3;
		r |= data;

		_delay_us(55);
		data = 0;

		DDRB |= oneWire;							//oneWire = Ausgang
		_delay_us(10);
	}

	return r;
}


int main(void)
{
	Disp_init();
	hex = 1;
	
	DDRB |= oneWire;								//oneWire = Ausgang
	
	uint8_t adress[8];
	
    while (1) 
    {
		reset();
		write(readRom);
		
		//Lesen der Adresse
		for (uint8_t i = 0; i < 8; i++)
		{
			adress[i] = read();
			_delay_ms(10);
		}
		
		//Ausgabe der Adresse
		for (uint8_t i = 0; i < 8; i++)
		{
			zahl = adress[i];
			_delay_ms(800);
			
			zahl = 0x88;
			_delay_ms(50);
		}
		
		zahl = 00;
		_delay_ms(400);
    }
}

