/*
 * Baustellenampel_Test.c
 *
 * Created: 07.12.2020 09:48:47
 * Author : Matthias Korte
 */ 

#define F_CPU 16000000UL

#define A1Green 1
#define A1Yellow 2
#define A1Red 16

#define A2Green 128
#define A2Yellow 64
#define A2Red 32

#define greenPhaseInMS 1000

#include <avr/io.h>
#include <util/delay.h>
#include <avr/interrupt.h>
#include "sv1.h"

//sv1(0b00000001);	//A1 Gruen
//sv1(0b00000010);	//A1 Gelb
//sv1(0b00010000);	//A1 Rot

//sv1(0b00100000);	//A2 Rot
//sv1(0b01000000);	//A2 Gelb
//sv1(0b10000000);	//A2 Gruen

void A2GreenToRed()
{
	sv1(A2Green | A1Red);
	_delay_ms(300);
	sv1(A2Yellow | A1Red);
	_delay_ms(500);
	sv1(A2Red | A1Red);
}

void A2RedToGreen()
{
	sv1(A2Red | A1Red);
	_delay_ms(300);
	sv1(A2Red | A2Yellow | A1Red);
	_delay_ms(300);
	sv1(A2Green | A1Red);
}

void A1GreenToRed()
{
	sv1(A1Green | A2Red);
	_delay_ms(300);
	sv1(A1Yellow | A2Red);
	_delay_ms(500);
	sv1(A1Red | A2Red);
}

void A1RedToGreen()
{
	sv1(A1Red | A2Red);
	_delay_ms(300);
	sv1(A1Red | A1Yellow | A2Red);
	_delay_ms(300);
	sv1(A1Green | A2Red);
}

void A1Phase()
{
	A1RedToGreen();
	_delay_ms(1000);
	A1GreenToRed();
	_delay_ms(1000);
}

void A2Phase()
{
	A2RedToGreen();
	_delay_ms(1000);
	A2GreenToRed();
	_delay_ms(1000);	
}

int main(void)
{
	sv1(0b00110000);	//A1 und A2: Rot
	
	DDRB &= ~(1<<PD2)|(1<<PD3);
	PORTD |= (1<<PD2)|(1<<PD3);
	
	EICRA |= (1<<ISC01) | (1<<ISC00);
	EIMSK |= (1<<INT0)|(1<<INT1);
	
	sei();
	
    while (1) 
    {		
		
	}
}

ISR (INT0_vect)
{
	//Ampel 1	
	A1Phase();
	_delay_ms(greenPhaseInMS);
	sv1(0b00110000);	//A1 und A2: Rot
}

ISR (INT1_vect)
{
	//Ampel 2
	A2Phase();
	_delay_ms(greenPhaseInMS);
	sv1(0b00110000);	//A1 und A2: Rot
}

