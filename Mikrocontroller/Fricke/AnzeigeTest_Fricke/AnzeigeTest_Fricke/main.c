/*
 * AnzeigeTest_Fricke.c
 *
 * Created: 12.11.2020 08:00:00
 * Author : Matthias Korte
 */ 

#define F_CPU 16000000UL

#include <avr/io.h>
#include "Display.h"
#include <util/delay.h>


int main(void)
{
	
	Disp_init();
	
    while (1) 
    {
		//Dezimalzahlen anzeigen
		hex = 0;
		for (zahl = 0; zahl < 100; zahl++)
		{
			_delay_ms(300);
		}
		
		_delay_ms(500);
		
		//Hexzahlen anzeigen
		hex = 1;
		for (zahl = 0; zahl < 255; zahl++)
		{
			_delay_ms(300);
		}
    }
}

