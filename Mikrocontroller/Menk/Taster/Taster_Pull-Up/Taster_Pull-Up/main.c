/*
 * Taster_Pull-Up.c
 *
 * Created: 18.01.2021 09:59:53
 * Author : Matthias
 */ 

#include <avr/io.h>

void on()
{
	//Alle LEDs anschalten
	PORTD |= 0xC0;
	PORTB |= 0x3F;
}

void off()
{
	//Alle LEDs ausschalten
	PORTD &= ~0xC0;
	PORTB &= ~0x3F;
}


int main(void)
{
	DDRD &= ~((1<<PD3)|(1<<PD2));
	
	DDRD |= 0x3F;
	DDRB |= 0xC0;
    
	PORTD |= (1<<PD3) | (1<<PD2);	//Pull-Up
	
    while (1) 
    {
		
		if (!(PIND & (1<<PD3)))
		{
			on();
		} else {
			off();
		}
		
    }
}

