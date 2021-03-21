/*
 * LCD_ADC.c
 *
 * Created: 01.03.2021 10:37:08
 * Author : Matthias Korte
 */ 

#define F_CPU 16000000UL

#include <avr/io.h>
#include <util/delay.h>
#include "lcd2x16b.h"

float zahl = 9.86754321;
uint8_t i = 0, j=255;

int main(void)
{
	lcd_init();
	lcd_clear();
	/*
	lcd_set_cursor(0,0);
	lcd_write("Hallo Welt");
	*/
	
	uint16_t x, erg;
	
	// Init ADC
	ADMUX |= (1<<REFS0);													//Uref = 5V
	ADCSRA |= (1<<ADEN);													//ADC aktiviert
	ADCSRA |= (1<<ADPS0) | (1<<ADPS1) | (1<<ADPS2);							//Vorteiler auf 128
	ADMUX &= ~((1<<MUX3)|(1<<MUX2)|(1<<MUX0));								//ADC1
	//ADMUX |= (1<<ADLAR);
	ADMUX &= ~(1<<ADLAR);													//Ausgabe 10 Bit rechtsbündig
	//DIDR0 |= (1<<ADC5D);
	
	// Dummy Readout
	ADCSRA |= (1<<ADSC);
	x = ADC;
	
    while (1) 
    {
		ADCSRA |= (1<<ADSC);
		while(ADCSRA & (1<<ADSC));
		erg = ADC;
		
		uint8_t r = (erg & 0xFFC0)>>6;
		
		lcd_clear();
		lcd_bin(erg,0,0);
		_delay_ms(100);
    }
}

