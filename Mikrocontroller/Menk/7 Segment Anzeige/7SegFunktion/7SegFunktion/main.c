/*
 * 7SegFunktion.c
 *
 * Created: 21.09.2020 10:16:42
 * Author : Matthias Korte
 */ 

#define F_CPU 16000000UL

#include <avr/io.h>
#include <util/delay.h>
#include "sv1.h"
#include "sv2.h"

void segAusgabe(int wert)
{
	/*Ausgabe von ganzzahligen Werten von -9 bis 99*/
	
	const uint8_t segmente[11] = {0x03, 0xF3, 0x25, 0x0D, 0x99, 0x49, 0x41, 0x1F, 0x01, 0x19, 0xFE};
	
	//Negative Zahl ausgeben
	if (wert < 0 && wert > (-10))
	{
		sv1(0xFD);					//Minuszeichen ausgeben
		sv2(segmente[wert * (-1)]);	//Wert ausgeben
	}
	
	//Positive Zahlen
	if (wert >= 0 && wert < 100)
	{
		int einer, zehner;
		
		einer = (int) wert % 10;	//Einer Wert berechnen
		zehner = (int) wert / 10;	//Zehner Wert berechnen
		
		sv1(segmente[zehner]);		//Zehner Wert ausgeben
		sv2(segmente[einer]);		//Einer Wert ausgeben
	}
}

int main(void)
{
    while (1) 
    {
		for(int i = -9; i < 100; i++)
		{
			segAusgabe(i);		//Funktionsaufruf mit dem Parameter i
			_delay_ms(300);
		}
    }
}

