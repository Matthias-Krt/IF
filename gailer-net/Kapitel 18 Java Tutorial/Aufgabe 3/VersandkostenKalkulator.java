/*Kapitel 18 Aufgabe 3
 *Matthias Korte
 *
 *Ein Paketdienst berechnet $3.00 Versandkosten bis zu einem Gewicht von 10 Pfund (inklusive).
 *Darueber sind fuer jedes Pfund zusaetzlich $0.25 zu bezahlen.
 *
 *Schreiben Sie ein Programm,
 *das den Anwender nach dem Gewicht der Sendung fragt und dann die Versandkosten ausgibt.
 *Das Programm endet, wenn ein Gewicht von 0 oder weniger eingegeben wird.*/

import java.util.Scanner;

 class Versandkosten{

   public static void main(String[] args){

     int Gewicht;
     double Kosten;

     Scanner s = new Scanner(System.in);

     System.out.println("Wie schwer ist das Paket?");
     Gewicht = s.nextInt();

     if(Gewicht > 0){

         if(Gewicht <= 10){
           Kosten = 3;
         }else{
             int x = Gewicht - 10;
             Kosten = 3 + x * 0.25;
         }
         System.out.println("Versandkosten: " + Kosten + "$");

     }else{
         System.out.println("Das Programm wurde beendet!");
     }



   }
 }
