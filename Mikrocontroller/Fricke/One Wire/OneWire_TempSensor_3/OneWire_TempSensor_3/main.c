/*
 * OneWire_TempSensor_3.c
 *
 * Created: 02.02.2021 21:06:06
 * Author : Matthias Korte
 */


#define F_CPU 16000000UL

#define oneWire (1<<PB4)

#define t_conv 750

#define skipRom 0xCC
#define convertT 0x44
#define readScratchpad 0xBE

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
	hex = 0;

	DDRB |= oneWire;								//oneWire = Ausgang

	uint8_t data[9];

	while (1)
	{
		reset();
		write(skipRom);
		write(convertT);

		cli();
		PORTB |=oneWire;							//oneWire: 1
		sei();

		_delay_ms(t_conv);

		reset();
		write(skipRom);
		write(readScratchpad);

		for (uint8_t i = 0; i < 9; i++)
		{
			data[i] = read();
			_delay_ms(200);
		}

		uint8_t temp = (data[1]<<4) | (data[0]>>4);
		uint8_t decimal = (data[0] & 0x0F);

		zahl = temp;
		_delay_ms(800);
		//zahl = decimal;
	}
}
