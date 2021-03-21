/*
 * 7Segment_Anzeige_Menk.c
 *
 * Created: 07.09.2020 09:44:16
 * Author : Matthias Korte
 */ 

#define F_CPU 16000000UL
#include <util/delay.h>
#include <avr/io.h>
#include "sv1.h"

uint8_t i = 9;
const uint8_t ziffern[11] = {0x03, 0xF3, 0x25, 0x0D, 0x99, 0x49, 0x41, 0x1F, 0x01, 0x19, 0xFE};

int main(void)
{
    while (1) 
    {

	}
}

