/*
 * 2x7 Seg.c
 *
 * Created: 14.09.2020 09:59:50
 * Author : Matthias Korte
 */ 

#define F_CPU 16000000UL
#include <avr/io.h>
#include <util/delay.h>
#include "sv1.h"
#include "sv2.h"

int main(void)
{
	const uint8_t segmente[11] = {0x03, 0xF3, 0x25, 0x0D, 0x99, 0x49, 0x41, 0x1F, 0x01, 0x19, 0xFE};

    while (1) 
    {
		//00 bis 99
		for (uint8_t z = 0; z < 10; z++)
		{
			sv1(segmente[z]);
			_delay_ms(200);
			for (uint8_t e = 0; e < 10; e++)
			{
				sv2(segmente[e]);
				_delay_ms(200);
			}
		}
		
		//Negative Zahlen
		sv1(0x04);				// -
		_delay_ms(200);
		for (uint8_t i = 9; i > 0; i--);
		{
			sv2(segmente[i]);
		}
		
		//99 bis -9
		for (uint8_t z = 9; z >= -1; z--)
		{
			if (z >= 0)
			{
				sv1(segmente[z]);
			} else 
			{
				sv1(0x04);	// -	
			}
			_delay_ms(200);
			for (uint8_t e = 9; e >= 0; e--)
			{
				sv2(segmente[e]);
				_delay_ms(200);
			}
		}
		
		
    }
}

