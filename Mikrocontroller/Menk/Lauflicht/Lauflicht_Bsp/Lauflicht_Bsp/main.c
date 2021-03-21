/*
 * Lauflicht_Bsp.c
 *
 * Created: 15.03.2021 14:44:58
 * Author : Matthias
 */

#define F_CPU 16000000UL
#define wait _delay_ms(100)

#include <avr/io.h>
#include <util/delay.h>
#include "sv1.h"


int main(void)
{
    while (1)
    {
		//Binär hochzählen
		for (uint8_t i = 0x00; i < 256; i++)
		{
			sv1(i);
			wait;
		}

		//1 verschieben
		for (uint8_t i = 0x80; i; i = i >> 1)
		{
			sv1(i);
			wait;
		}
    }
}
