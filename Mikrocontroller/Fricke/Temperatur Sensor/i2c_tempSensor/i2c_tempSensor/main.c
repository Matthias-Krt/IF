/*
 * i2c_tempSensor.c
 *
 * Created: 19.01.2021 16:52:32
 * Author : Matthias Korte
 */ 

#include <avr/io.h>
#include "I2C.h"
#include "Display.h"


int main(void)
{
	Disp_init();
	hex = 0;
	
    while (1) 
    {
		i2c_start();
		i2c_write(0x91);
		zahl = i2c_read();
		i2c_stop();
    }
}