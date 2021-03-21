/*
 * Taster.c
 *
 * Author : Matthias Korte
 */

#include <avr/io.h>

void on()
{
	PORTD |= 0xC0;
	PORTB |= 0x3F;
}

void off()
{
	PORTD &= ~0xC0;
	PORTB &= ~0x3F;
}

int main(void)
{
	
	DDRD &= 0b11110111;
	
	DDRB |= 0x3F;
	DDRD |= 0xC0;
	
	PORTD = 0b1000;		//Pull-Up
	
    while (1) 
    {	
		/*
		if (!(PIND & 0b1000))
		{
			on();
		} else {
			off();
		}
		*/
		
		if (!(PIND & (1<<PD3)))
		{
			on();
		} else {
			off();
		}
    }
}

