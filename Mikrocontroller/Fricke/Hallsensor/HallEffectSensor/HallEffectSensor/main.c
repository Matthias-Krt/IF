/*
 * HallEffectSensor.c
 *
 * Created: 14.01.2021 08:22:45
 * Author : Matthias Korte
 *
 * Schreibe ein Programm, in dem das Bit "arautonic" gesetzt wird 
 * und in einer Endlosschleife die Punkte 1 bis 5 ausgefuehrt werden. 
 * Benutze dabei die Bibliotheken Display.h und I2C.h.
 *
 * 1.	Setze das Bit "oneburst" im Register 0xC4
 * 2.	Warte 11µs oder etwas laenger
 * 3.	Das Messergebnis lesen wir aus den Registern 0xC1 und 0xC2
 * 4.	Wenn Bit 7 des MSB des Messergebnisses 1 ist, wurde ein neues Ergebnis gelesen
 * 5.	Nach Anwenden der Formel haben wir das Ergebnis in mT.
 *		Um allerdings ganze Zahlen zu erhalten sollten wir die Multiplikation mit 0.00125 weglassen
 *		und dem Leser unserer Anzeige mitteilen, dass die angezeigte Zahl mit 1,25 µT multipliziert werden muss.
 */ 

#define F_CPU 16000000UL

#define adress 0x66			//Schreibeadresse
#define regOne 0xC1
#define regTwo 0xC2
#define oneburst 0xC4
#define arautoing 0xC5
#define fir 0xCD

#include <avr/io.h>
#include <util/delay.h>
#include "Display.h"
#include "I2C.h"

int main(void)
{	
	Disp_init();
	hex = 1;		//Display Ausgabe in HEX
	
	unsigned char msb = 0;
	unsigned char lsb = 0;
	uint16_t wert = 0;
	
	//arautoinc setzen
	i2c_start();
	i2c_write(adress);
	i2c_write(arautoing);
	i2c_write(1);
	i2c_stop();
	
	warte();
	
	//Finite Impulse Response
	i2c_start();
	i2c_write(adress);
	i2c_write(fir);
	i2c_write(0x1E);						//df_bw[4:1] (max. 12)
	i2c_stop();
	
	warte();
	
    while (1) 
    {
		//Start new measurement
		i2c_start();
		i2c_write(adress);					//Schreibadresse
		i2c_write(oneburst);
		i2c_write(4);
		i2c_stop();
		
		warte();
		
		i2c_start();
		i2c_write(adress);					//Schreibadresse
		i2c_write(regOne);
		i2c_stop();
		
		i2c_start();			
		i2c_write(adress + 1);				//Leseadresse = Schreibadresse + 1
		
		//Read measurements
		msb = i2c_read();
		i2c_m_ack();						//Damit der Sensor weiter macht
		lsb = i2c_read();
		
		warte();
		
		i2c_m_nack();
		i2c_stop();
		
		//Bei einem neuem Messergebnis
		if(msb & 0x80)
		{
			msb = (msb & 0x7F);
			wert = (256 * msb + lsb - 16384);
			
			zahl = wert;
			
			//_delay_ms(300);	//Zu schneller Werte wechsel
		}
    }
}

