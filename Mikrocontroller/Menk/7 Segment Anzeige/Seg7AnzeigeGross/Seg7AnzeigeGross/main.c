/*
 * Seg7AnzeigeGross.c
 *
 * Created: 02.11.2020 10:24:34
 * Author : Matthias Korte
 */ 

#define F_CPU 16000000UL

#include <avr/io.h> 
#include <util/delay.h>

const uint8_t segTbl[15] = {0x77, 0x14, 0xB3, 0xB6, 0xD4, 0xE6, 0xC7, 0x34, 0xF7, 0xF4, 0x77, 0x80, 0xE1, 0x00, 0x08};

void soft_serial(uint8_t data)
{	
	//8 Durchgänge -> 8 Bits
	for (uint8_t i = 0; i < 8; i++)
	{
		PORTB &= ~(1<<PB5);		//Clock LOW
		
		//Vergleich 1. Bit
		if (data & 0b1)
		{
			//1. Bit = 1
			PORTB |= (1<<PB3);	//ser-Pin = 1
		} else {
			//1. Bit = 0
			PORTB &= ~(1<<PB3);	//ser-Pin = 0
		}
		
		PORTB |= (1<<PB5);		//Clock HIGH
		
		data = data >> 1;		//data eine Stelle nach rechts verschieben
	}
}

void enableImpuls()
{
	PORTB |= (1<<PB0);			//Enabled Impulses
	PORTB &= ~(1<<PB0);
}

void anzeigen(float wert)
{
	if (wert > -10 && wert < 100)
	{
		//Nachkommastelle
		soft_serial(segTbl[wert % 1]);		//Nachkommastelle				
		enableImpuls();
		soft_serial(segTbl[14]);			//Punkt
		enableImpuls();
	}
	
	if (wert > 0)
	{
		soft_serial(segTbl[wert % 10]);				//Einer
		enableImpuls();
		soft_serial(segTbl[wert % 100 / 10]);		//Zehner
		enableImpuls();
		if (wert >= 100)
		{
			soft_serial(segTbl[wert % 1000 / 100]);		//Hunderter
			enableImpuls();
		}
	} else if (wert <= 0) {
		soft_serial(segTbl[wert % 10]);				//Einer
		enableImpuls();
	}
	
	if (wert < 0)
	{
		soft_serial(segTbl[11]);	//Minus
		enableImpuls();
	}
}

int main(void)
{
	DDRB |= (1<<PB0) | (1<<PB3) | (1<<PB5);	//enabled = PB0, serial = PB3, clock = PB5; Ausgänge
	PORTB &= ~(1<<PB0);
	
    while (1)
    {
		/*
		for (uint8_t i = 0; i < 10; i++)
		{
			soft_serial(segTbl[i]);
			PORTB |= (1<<PB0);			//Enabled Impulses
			PORTB &= ~(1<<PB0);
			
			_delay_ms(500);
		}	
		*/
		
		for (uint16_t i = 0; i < 1000; i++)
		{
			anzeigen(i);
			_delay_ms(200);
		}
			
    }
}

