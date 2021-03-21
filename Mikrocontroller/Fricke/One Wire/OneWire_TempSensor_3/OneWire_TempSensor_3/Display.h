#include <avr/interrupt.h>

unsigned char zifferB[16] = {0xC, 0xD, 0xA, 0x8, 0x9, 0x8, 0x8, 0xD,
							 0x8, 0x8, 0x9, 0x8, 0xA, 0x8, 0xA, 0xB};
unsigned char zifferD[16] = {0x00, 0xC4, 0x40, 0xC0, 0x84, 0x88, 0x08, 0xC0,
							 0x00, 0x80, 0x00, 0x0C, 0x4C, 0x44, 0x08, 0x08};
unsigned char hex = 1;
unsigned char zahl = 0;
	
ISR(TIMER0_COMPA_vect)
{
	static unsigned char stelle = 0x10;	//PD4 -> Einerstelle
	unsigned char zind;
	PORTD = PORTD & 0xCF;				//PD4 = PD5 = 0
	if(stelle == 0x10)
	{	
		if(hex)
			zind = zahl & 0x0F;
		else
			zind = zahl % 10;
	}	
	else
	{
		if(hex)
			zind = zahl >> 4;
		else
			zind = zahl / 10;
	}	
	PORTB = (PORTB & 0xF0) | zifferB[zind];
	PORTD = (PORTD & 0x33) | zifferD[zind];		
	PORTD = PORTD | stelle;				//Anoden fuer aktuelle Stelle ein
	stelle = stelle ^ 0x30;				//Bit 4 und 5 von stelle invertieren
}

void Disp_init()
{
	DDRB = DDRB | 0x0F;				//PB3..PB0 Ausgaenge fuer Segmente
	DDRD = DDRD | 0xFC;				//PD7..PD2 Ausgaenge fuer Segmente und Stellen
	TCCR0A = 2;						//normal port operation, CTC mode: TOP = OCR0A; Anzeige-Multiplex
	OCR0A = 77;						//15625 Hz / 78 = ca. 200 Hz fuer Anzeige-Multiplex
	TIMSK0 = 0x02;					//Freigabe "Compare Match A"-Interrupt
	TCCR0B = 5;						//Takt = Systemtakt / 1024 = 15625 Hz
	sei();							//Interrupts allgemein freigeben
}