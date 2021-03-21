#ifndef SV1_H_
#define SV1_H_

void sv1(uint8_t ausgabe)
{
	DDRB |= 0x3F;						//Richtungsregister PORTB PB0-PB5 auf Ausgang
	DDRD |= 0xC0;						//Richtungsregister PORTD PB6 und PB7 auf Ausgang
	
	PORTB = ausgabe;					//Ausgabe LED0-5
	
	if (ausgabe & 0x40)					//Wenn ausgabe an der Stelle 6 = 1
	{
		PORTD |= (1<<PD6);				//LED6 = HIGH
	}
	else							
	PORTD &= ~(1<<PD6);					//sonst LED6 = LOW
	
	
	if (ausgabe & 0x80)						//Wenn ausgabe an der Stelle 7 = 1 
	{
		PORTD |= (1<<PD7);				//LED7 = HIGH
	}
	
	else
	PORTD &= ~(1<<PD7);					//sonst LED7 = LOW
}

#endif /* SV1_H_ */