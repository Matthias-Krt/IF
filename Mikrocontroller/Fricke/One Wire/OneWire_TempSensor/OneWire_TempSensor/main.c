 * OneWire_TempSensor.c
 *
 * Created: 29.01.2021 15:00:12
 * Author : Matthias Korte
 
#define F_CPU 16000000UL
#define oneWire (1<<PB4)

#include <avr/io.h>
#include <avr/interrupt.h>
#include <util/delay.h>
#include "Display.h"


int reset()
{
	uint8_t r = 0;

	DDRB |= oneWire;

	cli();
	PORTB &= ~oneWire;
	sei();
	
	_delay_us(480);
	
	cli();
	PORTB |= oneWire;
	sei();
	
	DDRB &= ~oneWire;
	_delay_us(70);

	cli();
	r = (PINB & oneWire)>>4;
	sei();
	
	DDRB |= oneWire;
	
	_delay_us(410);

	return r;
}

void write(uint8_t data)
{
	for (uint8_t i = 0; i < 8; i++)
	{
		if(data & i)
		{		
			cli();
			PORTB &= ~oneWire;
			sei();
			
			_delay_us(10);
			
			cli();
			PORTB |= oneWire;
			sei();
			
			_delay_us(50);
			
		} else {			
			cli();
			PORTB &= ~oneWire;
			sei();
			
			_delay_us(60);
			
			cli();
			PORTB |= oneWire;
			sei();
		}
		
		_delay_us(10);
		data = data >> 1;
	}
}

uint8_t readByte()
{
	uint8_t data = 0;
	uint8_t r = 0;
	
	for (uint8_t i = 0; i < 8; i++)
	{
		data >>= 1;
		
		cli();
		PORTB &= ~oneWire;
		sei();
		
		_delay_us(6);
		
		cli();
		PORTB |= oneWire;
		sei();
		
		_delay_us(9);
		
		DDRB &= ~oneWire;
		
		cli();
		r += (PINB & oneWire);
		sei();
		
		r <<= 3;
		data |= r;
		
		_delay_us(55);
		
		r = 0;
		
		DDRB |= oneWire;
		
		_delay_us(10);
	}
	
	return data;
}

int main(void)
{
	
	Disp_init();
	hex = 1;

	DDRB |= oneWire;
	
	uint8_t temp1 = 0;
	uint8_t temp2 = 0;
	
	while(1)
	{
		reset();
		write(0xCC);
		write(0x44);
		
		cli();
		PORTB |= oneWire;
		sei();
		
		_delay_ms(750);
		
		reset();
		write(0xCC);
		write(0xBE);
		
		temp1 = readByte()>>4;
		_delay_ms(200);
		temp2 = readByte()<<4;
		
		zahl = temp2 | temp1;
	}
}

