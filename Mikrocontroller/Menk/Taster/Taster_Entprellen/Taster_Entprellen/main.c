/*
 * Taster_Entprellen.c
 *
 * Created: 18.01.2021 10:44:31
 * Author : Matthias Korte
 * 
 * Buch S.144
 */ 

#define F_CPU 16000000UL
#define btn_down	!(PIND & (1<<PIND2))	//Taster an PD2 = low

#include <avr/io.h>
#include <util/delay.h>

enum button {off, on} state;

void led_on()
{
	PORTD |= 0xC0;
	PORTB |= 0x3F;
}

void led_off()
{
	PORTD &= ~0xC0;
	PORTB &= ~0x3F;
}

int main(void)
{
	DDRD &= ~(1<<PD2);
	
	DDRB |= 0x3F;
	DDRD |= 0xC0;
	
	DDRD |= (1<<PD2);
	
    while (1) 
    {
		if (btn_down)
		{
			for (uint8_t i = 0; i < 10; i++)
			{
				_delay_ms(1);
				if (btn_down) 
				{
					asm("NOP");
				} else {
					i = 0;
				}
			}
			
			if (state == on)
			{
				led_on();
				state = on;
			} else if (state == off) {
				led_off();
				state = off;
			}
			
			while(btn_down);
			
		}
    }
}

