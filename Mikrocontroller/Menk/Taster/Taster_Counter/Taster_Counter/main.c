/*
 * Taster_Counter.c
 *
 * Created: 01.02.2021 09:52:45
 * Author : Matthias Korte
 *
 * Bei jedem Taster Druck sollen die LEDs an SV1 Binaer hochgezaehlt werden
 */

#include <avr/io.h>
#include <avr/interrupt.h>
#include "sv1.h"

uint8_t count = 0;

int main(void)
{
	DDRD &= ~(1<<PD2) & ~(1<<PD3);					//PD2 = PD3 = Eingang (INT0) Taster S3, (INT1) S2
	PORTD |= (1<<PD2) | (1<<PD3);					//PD2, PD3: Pullup
	
	EICRA |= (1<<ISC01) | (1<<ISC00);				//INT0, INT1: wird durch steigende Flanke ausgeloest
	EIMSK |= (1<<INT0) | (1<<INT1);					//Ext. INT0, INT1 aktivieren
	
	sei();											//Interrupts freigeben
	
    while (1) {}
}

ISR (INT0_vect)
{
	count++;
	
	sv1(count);
}

ISR (INT1_vect)
{
	//Reset Count
	count = 0;
	
	sv1(count);
}

