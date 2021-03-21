/*
 * Taster_Interrupt.c
 *
 * Created: 25.01.2021 10:04:23
 * Author : Matthias Korte
 */ 

#include <avr/io.h>
#include <avr/interrupt.h>


int main(void)
{
	DDRD &= ~(1<<PD2);		//PD2 = Eingang (INT0) Taster S3
	PORTD |= (1<<PD2);		//PD2: Pullup
	
	DDRB |= (1<<PB0);		//PB0 = Ausgang
	PORTB = 0x00;			//PORTB: LOW
	
	EICRA |= (1<<ISC01) | (1<<ISC00);	//INT0 wird durch eine steigende Flanke ausgeloest
	EIMSK |= (1<<INT0);					//Ext. INT0 aktivieren
	
	sei();								//Interrupts freigeben
	
    while (1) 
    {

    }
}

ISR (INT0_vect)
{
	PORTB ^= (1<<PB0);	//Toggle PB0
}

