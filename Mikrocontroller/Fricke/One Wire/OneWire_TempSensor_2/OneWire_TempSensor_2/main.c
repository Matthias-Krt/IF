/*
 * OneWire_TempSensor_2.c
 *
 * Created: 01.02.2021 14:58:33
 * Author : Matthias
 */ 

#define oneWire (1<<PB4)
#define skipRom 0xCC
#define startMeasurement 0x44
#define readScratchpad 0xBE

#define F_CPU 16000000UL

#include <avr/io.h>
#include <avr/interrupt.h>
#include <util/delay.h>
#include "Display.h"

void noInterrupts() { cli(); }
	
void interrupts() { sei(); }

uint8_t reset()
{
	uint8_t r;
	
	DDRB |= oneWire;		//oneWire = Ausgang
	
	noInterrupts();
	
	PORTB &= ~oneWire;		//oneWire: 0
	_delay_us(480);
	
	PORTB |= oneWire;		//oneWire: 1
	DDRB &= ~oneWire;		//oneWire = Ausgang
	_delay_us(70);
	
	r = (PINB & oneWire);
	
	interrupts();
	
	_delay_us(410);
	
	return r;
}

void writeBit(uint8_t b)
{
	if ((b & 1) != 0)
	{
		noInterrupts();
		
		DDRB |= oneWire;	//oneWire = Ausgang
		
		PORTB &= ~oneWire;	//oneWire: 0
		_delay_us(6);
		
		PORTB |= oneWire;	//oneWire: 1
		_delay_us(10);
		
		interrupts();
		
		_delay_us(54);
	} else {
		noInterrupts();
		
		DDRB |= oneWire;	//oneWire = Ausgang
		
		PORTB &= ~oneWire;	//oneWire: 0
		_delay_us(6);
		
		PORTB &= ~oneWire;	//oneWire: 0
		
		interrupts();
		
		_delay_us(54);
	}
}

void writeByte(uint8_t data)
{
	for (uint8_t mask = 0x01; mask < 0x80; mask <<= 1)
	{
		if ((data & mask) != 0)
		{
			writeBit(1);
		} 
		else
		{
			writeBit(0);
		}
	}
}

uint8_t readBit()
{
	uint8_t r;
	
	noInterrupts();
	
	DDRB |= oneWire;	//oneWire = Ausgang
	
	PORTB &= ~oneWire;	//oneWire: 0
	_delay_us(6);
	
	DDRB &= ~oneWire;	//oneWire = Eingang
	_delay_us(9);
	
	r = (PINB & oneWire);
	
	interrupts();
	
	_delay_us(55);
	
	return r;
}

int8_t readByte()
{
	int8_t r = 0;
	
	for (uint8_t mask = 0x01; mask < 0x80; mask <<= 1)
	{
		if (readBit() != 0)
		{
			r |= mask;
			_delay_us(10);
		}
	}
	
	return r;
}

uint8_t readTemperature()
{
	uint8_t temperature[2];
	int8_t digit;
	uint16_t decimal;
	
	reset();
	writeByte(skipRom);
	writeByte(startMeasurement);
	
	_delay_ms(750);
	
	reset();
	writeByte(skipRom);
	writeByte(readScratchpad);
	
	temperature[0] = readByte();
	temperature[1] = readByte();
	
	reset();
	
	digit = temperature[0]>>4;
	digit |= (temperature[1]&0x07)<<4;
	
	decimal = temperature[0]&0x0F;
	decimal *= 625;
	
	return digit;
}


int main(void)
{
	
	Disp_init();
	hex = 1;
	
	unsigned char data[12];
	
    while (1) 
    {
		
		reset();
		writeByte(skipRom);
		writeByte(startMeasurement);
		
		noInterrupts();
		DDRB |= oneWire;		//oneWire = Ausgang
		PORTB |= oneWire;		//oneWire: 1
		interrupts();
		
		_delay_ms(1000);		//750ms
		
		reset();
		writeByte(skipRom);
		writeByte(readScratchpad);
		
		for (uint8_t i = 0; i < 9; i++)
		{
			data[i] = readByte();
		}
		
		//Convert Data to Temperature
		int8_t tempMSB = (data[1] & 0x07) << 4;
		int8_t tempLSB = (data[0] & 0xF0) >> 4;
		
		uint8_t temp = tempMSB | tempLSB;
		
		for (uint8_t i = 0; i < 9; i++)
		{
			zahl = data[i];
			_delay_ms(1000);
			zahl = i;
			_delay_ms(200);
		}
    }
}

