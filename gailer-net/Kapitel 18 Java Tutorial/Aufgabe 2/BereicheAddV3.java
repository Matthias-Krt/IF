/*Kapitel 18 Aufgabe 2 mit for
 *Matthias Korte
 *
 *Schreiben Sie ein Programm,
 *das den Anwender nach einer Unter- und Obergrenze
 *fuer einen Bereich von Ganzzahlen fragt.
 *
 *Das Programm fragt dann den Anwender nach Ganzzahlen,
 *die addiert werden sollen. Das Programm berechnet zwei Summen
 *		Die Summe der Integer, die im Bereich sind
 *		und die Summe der Integer, die ausserhalb des Bereichs sind.
 *
 *Der Anwender signalisiert das Ende der Eingabe mit einer 0
*/

import java.util.Scanner;

class BereicheAddV3{

   public static void main(String[] args){

       int UnterGrenze, OberGrenze;	//Grenzen
       int sumIn = 0, sumOut = 0;   //sumIn = Summe innerhalb der Grenzen, sumOut = Summe ausserhalb der Grenzen
       int Eingabe;					//Die Eingabe des Benutzers

       Scanner s = new Scanner(System.in);

       System.out.println("Geben Sie die Untergrenze ein:");
       UnterGrenze = s.nextInt();
       System.out.println("Geben Sie die Obergrenze ein:");
       OberGrenze = s.nextInt();

       System.out.println("Sie beenden die Eingabe, wenn Sie 0 eingeben");

       for(boolean w = true; w == true; ){

           System.out.println("Geben Sie eine Ganzzahl ein:");
           Eingabe = s.nextInt();

           if(Eingabe == 0){
               w = false;
               break;
           }

           if(Eingabe > UnterGrenze && Eingabe < OberGrenze){
               //Eingabe innerhalb der Grenzen
               sumIn = sumIn + Eingabe;
           }else{
               //Eingabe ausserhalb der Grenzen
               sumOut = sumOut + Eingabe;
           }

       }

       //Ausgabe
       System.out.println("Die Summe der Zahlen, welche zwischen " + UnterGrenze + " und " + OberGrenze + " liegen, betraegt: " + sumIn);
       System.out.println("Die Summe der Zahlen, welche ausserhalb " + UnterGrenze + " und " + OberGrenze + " liegen, betraegt: " + sumOut);
   }
}
