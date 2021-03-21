/*
 * 7SegSchieberegister.c
 *
 * Author : Matthias
 */ 

#include <avr/io.h>

void sck()
{
	PORTD |= (1<<PD1);
	PORTD &= ~(1<<PD1);
}

void push_serial(uint8_t data)
{
	for (uint8_t i = 0; i < 8; i++)
	{
		if (data & 0b1)
		{
			PORTD |= (1<<PD0);
		} else {
			PORTD &= ~(1<<PD0);
		}
		
		sck();
		
		data = data >> 1;
		
	}
}

int main(void)
{
	
	uint8_t data = 0xFF;	//Input Data
	DDRD = 0xFF;			//PORTD = Ausgang
	PORTD = 0x04;			//RCK = HIGH
	
    while (1) 
    {
		push_serial(data);
		PORTD &= ~(1<<PD2);
		PORTD |= (1<<PD2);
    }
}

