/*Kapitel 19 Aufgabe 2
 *Matthias Korte
 *
 *Ein bestimmtes Arzneimittel verliert jeden Monat 4% seines Wirkstoffgehalts.
 *Wenn sein Wirkstoffgehalt unter 50% faellt, muss es ausgemustert werden.
 *
 *Schreiben Sie ein Programm,
 *das berechnet wie viele Monate eine Arznei gelagert werden kann.*/

 import java.util.Scanner;

 class WirkstoffgehaltArzneimittels{

     public static void main(String[] args){

         final int Verlust = 4;
         int monat = 1;
         double Wirkung = 100;

         Scanner s = new Scanner(System.in);

         System.out.println("Monat 0\t Wirkstoffgehalt: 100%");

         while(Wirkung > 50){

             monat++;
             Wirkung = Wirkung-(Wirkung*Verlust/100);

             System.out.println("Monat " + monat + "\t Wirkstoffgehalt: " + Wirkung + "%");

         }

     }
 }
