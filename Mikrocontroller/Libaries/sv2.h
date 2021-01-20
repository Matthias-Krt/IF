#ifndef SV2_H_
#define SV2_H_

void sv2(uint8_t ausgabe)
{
	DDRD |= (1<<PD5)|(1<<PD4)|(1<<PD3)|(1<<PD2);			//Richtungsregister PORTD PD5-PD2 auf Ausgang
	DDRC |= (1<<PC3)|(1<<PC2)|(1<<PC1)|(1<<PC0);			//Richtungsregister PORTC PC3-PC0 auf Ausgang
	
	if (ausgabe & 0b00000001)			//Wenn ausgabe an der Stelle 0 = 1
	{
		PORTD |= (1<<PD5);				//LED0 = HIGH
	}
	else
	PORTD &= ~(1<<PD5);					//sonst LED0 = LOW
	
	
	if (ausgabe & 0b00000010)			//Wenn ausgabe an der Stelle 1 = 1
	{
		PORTD |= (1<<PD4);				//LED1 = HIGH
	}
	else
	PORTD &= ~(1<<PD4);					//sonst LED1 = LOW
	
	
	if (ausgabe & 0b00000100)			//Wenn ausgabe an der Stelle 2 = 1
	{
		PORTD |= (1<<PD3);				//LED2 = HIGH
	}
	else
	PORTD &= ~(1<<PD3);					//sonst LED2 = LOW
	
	
	if (ausgabe & 0b00001000)			//Wenn ausgabe an der Stelle 3 = 1
	{
		PORTD |= (1<<PD2);				//LED3 = HIGH
	}
	else
	PORTD &= ~(1<<PD2);					//sonst LED3 = LOW
	
	
	if (ausgabe & 0b00010000)			//Wenn ausgabe an der Stelle 4 = 1
	{
		PORTC |= (1<<PC0);				//LED4 = HIGH
	}
	else
	PORTC &= ~(1<<PC0);					//sonst LED4 = LOW
	
	
	if (ausgabe & 0b00100000)			//Wenn ausgabe an der Stelle 5 = 1
	{
		PORTC |= (1<<PC1);				//LED5 = HIGH
	}
	else
	PORTC &= ~(1<<PC1);					//sonst LED5 = LOW
	
	
	if (ausgabe & 0b01000000)			//Wenn ausgabe an der Stelle 6 = 1
	{
		PORTC |= (1<<PC2);				//LED6 = HIGH
	}
	else
	PORTC &= ~(1<<PC2);					//sonst LED6 = LOW
	
	
	if (ausgabe & 0b10000000)			//Wenn ausgabe an der Stelle 7 = 1
	{
		PORTC |= (1<<PC3);				//LED7 = HIGH
	}
	else
	PORTC &= ~(1<<PC3);					//sonst LED7 = LOW
}

#endif /* SV2_H_ */