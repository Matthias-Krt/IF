#ifndef LCD2X16_H_
#define LCD2X16_H_

#include <avr/io.h>
#include <util/delay.h>
#include <stdlib.h>

/******** LCD Pinbelegung ******/
#define  LCDPORTB		PORTB
#define  LCDPORTD		PORTD
#define  LCDDDRB		DDRB
#define  LCDDDRD		DDRD
#define  LCD_PIN_RS		0			//siehe Funktion lcd_init()
#define  LCD_PIN_E		2
#define  LCD_PIN_D4		4
#define  LCD_PIN_D5		5
#define  LCD_PIN_D6		6
#define  LCD_PIN_D7		7		

/******* LCD Steuerbefehle *****/
#define LCD_CLEAR		0x01		//Display löschen
#define LCD_HOME		0x02		//Cursor an den Anfang zurück
#define LCD_ON			0x0C		//0x0C = LCD ON, Cursor OFF
#define LCD_ON_C		0x0E		//0x0E = LCD ON, Cursor ON
#define LCD_OFF			0x08		//Display OFF
#define LCD_SET_4Bit	0x28		//Set Function = 4-Bit, 2 Zeilen, 5x7 Matrix
#define LCD_SET_2		0x06		//Entry Mode = Cursor increase, Display is not shifted
#define LCD_SETDDRAM	0x80		//Set Display RAM Address

/****** Hilfsdefinitionen ******/
#define BEFEHL		0
#define DATEN		1
#define sbi(port, bit)  (port |= (1<<bit))				//setze am port das bit
#define cbi(port, bit)	(port &= ~(1<<bit))				//lösche am port das bit

/****** Sende ein Byte an den LCD Controller *****/
void lcd_send (uint8_t type, uint8_t lcd_command)
{
	if(type == BEFEHL)
		cbi(LCDPORTB, LCD_PIN_RS);			//RS=0 Befehl folgt...
	else
		sbi(LCDPORTB, LCD_PIN_RS);

	/* (1) HIGH Nibble wird gesendet */
	if (bit_is_set(lcd_command, 7))
		sbi(LCDPORTD, LCD_PIN_D7);
    else cbi(LCDPORTD, LCD_PIN_D7);
	
	if(bit_is_set(lcd_command, 6))
		sbi(LCDPORTD, LCD_PIN_D6);
	else cbi(LCDPORTD, LCD_PIN_D6);
	
	if (bit_is_set(lcd_command, 5))
		sbi(LCDPORTB, LCD_PIN_D5);
	else cbi(LCDPORTB, LCD_PIN_D5);
	
	if (bit_is_set(lcd_command, 4))
		sbi(LCDPORTB, LCD_PIN_D4);
	else cbi(LCDPORTB, LCD_PIN_D4);
	
	/* Flanke zur Übernahme der Daten für das HIGH-Nibble senden... */
	sbi(LCDPORTB, LCD_PIN_E);
	_delay_ms(1);
	cbi(LCDPORTB, LCD_PIN_E);
	_delay_ms(1);
	
	/* (2) LOW Nibble wird gesendet */
	if (bit_is_set(lcd_command, 3))
		sbi(LCDPORTD, LCD_PIN_D7);
	else cbi(LCDPORTD, LCD_PIN_D7);
	
	if (bit_is_set(lcd_command, 2))
		sbi(LCDPORTD, LCD_PIN_D6);
	else cbi(LCDPORTD, LCD_PIN_D6);
	
	if (bit_is_set(lcd_command, 1))
		sbi(LCDPORTB, LCD_PIN_D5);
	else cbi(LCDPORTB, LCD_PIN_D5);
	
	if (bit_is_set(lcd_command, 0))
	sbi(LCDPORTB, LCD_PIN_D4);
	else cbi(LCDPORTB, LCD_PIN_D4);
	
	/* Flanke zur Übernahme der Daten für das LOW-Nibble senden...*/
	sbi(LCDPORTB, LCD_PIN_E);
	_delay_ms(1);
	cbi(LCDPORTB, LCD_PIN_E);
	
	/* (3) Auf den LCD Controller warten...*/
	_delay_ms(5);
}

/******* Stellt eine Zeichenkette am LCD dar ******/
void lcd_write (char *t)					//*t = pointer auf übertragenes Zeichen
{
	uint8_t i;
	for (i=0; i<255; i++)
	{
		if(t[i]==0)							//String-Ende (bei Wert = 0)? Dann raus hier...
			return;
		else
			lcd_send(DATEN, t[i]);
	}
}


/******* Enable Impuls zur Übernahme der LCD-Daten ******/
void toggle_enable(void)
{
	sbi(LCDPORTB, LCD_PIN_E);
	_delay_ms(1);
	cbi(LCDPORTB, LCD_PIN_E);
}

/******* Initialisierung des LCD Controllers ********/
void lcd_init()
{
	LCDDDRB |= (1<<PB0)|(1<<PB1)|(1<<PB2)|(1<<PB4)|(1<<PB5);
	LCDDDRD |= (1<<PD6)|(1<<PD7);
	LCDPORTB &= ~(1<<PB1);										//RW dauerhaft auf Null (kein auslesen)
	
	
	_delay_ms(60);								//LCD-Power delay (min. 40ms)
	
	/*LCD Soft-Reset 1 - Kommando 0011xxxx */
	sbi(LCDPORTB, LCD_PIN_D5);					//D5 = 1
	sbi(LCDPORTB, LCD_PIN_D4);					//D4 = 1
	toggle_enable();							//Kommando übernehmen
	_delay_ms(40);								//Auf die Ausführung des LCD warten
	
	/*LCD Soft-Reset 2 - Kommando 0011xxxx */
	toggle_enable();							//Kommando übernehmen (D5=1, D4=1)
	_delay_ms(1);								//Auf die Ausführung des LCD warten
	
	/*LCD Soft-Reset 3 - Kommando 0011xxxx */
	toggle_enable();							//Kommando übernehmen (D5=1, D4=1)
	_delay_ms(5);								//Auf die Ausführung des LCD warten	

	// AB hier ist sicher das 8-Bit Mode eingestellt!
	//Jetzt folgt die Umstellung auf den 4-Bit Modus!
	
	/*4-Bit Modus einschalten*/
	sbi(LCDPORTB, LCD_PIN_D5);					//LCD D5=1
	cbi(LCDPORTB, LCD_PIN_D4);					//LCD D4=0
	toggle_enable();							//Kommando übernehmen
	_delay_ms(5);
	
	//Ab hier im 4-Bit Modus (High-Nibble / Low-Nibble senden)
	//LCD auf 2 Zeilen, 4-Bit Modus, 5x7 Matrix einstellen
	lcd_send(BEFEHL, LCD_SET_4Bit);				//Register SET FUNCTION = 0010 1000
	lcd_send(BEFEHL, LCD_OFF);					//Set LCD OFF
	lcd_send(BEFEHL, LCD_CLEAR);				//Clear LCD
	lcd_send(BEFEHL, LCD_SET_2);				//Set ENTRY MODE = 0000 0110
	lcd_send(BEFEHL, LCD_ON);					//Set LCD ON			
}

void sekunde(uint8_t i)
{
	uint8_t k;
	for(;i>0;i--)								//Solange i>0 dekrementiere i um 1
	{
		for (k=0;k<10;k++)
			_delay_ms(50);
	}
}



void lcd_clear()
{
	lcd_send(BEFEHL, LCD_CLEAR);
}



void lcd_set_cursor(uint8_t zeile, uint8_t stelle)
{
	uint8_t wert=0;
	
	if (zeile == 0) wert =0;
	else if (zeile == 1) wert=wert+0x40;						//Wechsel in die zweite Zeile
	
	wert=wert+stelle;
	lcd_send(BEFEHL, LCD_SETDDRAM +wert);						//Position auf der Zeile angeben
}


void lcd_dez(uint32_t dezimalwert,uint8_t zeile, uint8_t stelle)		//Gibt positive und negative ganze Zahlen aus
{
	lcd_set_cursor(zeile, stelle);
	char buffer[10];
	itoa(dezimalwert, buffer, 10);
	lcd_write(buffer);
}


void lcd_bin(uint32_t dezimalwert,uint8_t zeile, uint8_t stelle)		//Gibt positive und negative binär Zahlen aus
{
	lcd_set_cursor(zeile, stelle);
	char buffer[10];
	itoa(dezimalwert, buffer, 2);
	lcd_write(buffer);
}

void lcd_hex(uint32_t dezimalwert,uint8_t zeile, uint8_t stelle)		//Gibt positive und negative hexadezimale Zahlen aus
{
	lcd_set_cursor(zeile, stelle);
	char buffer[10];
	itoa(dezimalwert, buffer, 16);
	lcd_write(buffer);
}

void lcd_double(double dezimalwert,uint8_t prec, uint8_t format, uint8_t zeile, uint8_t stelle)		//Gibt positive und negative ganze Zahlen aus
{																					//prec = Anzahl der Nachkommastellen
	lcd_set_cursor(zeile, stelle);
	char buffer[10];
	dtostrf(dezimalwert,format,prec,buffer);												//5 = 5 Zeichen für ASCIIarray  
	lcd_write(buffer);
}



#endif /* LCD2X26_H_ */