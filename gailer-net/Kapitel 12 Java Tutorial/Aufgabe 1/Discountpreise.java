/*Waehrend einer Sonderaktion wird ein Rabatt von 10% auf alle Einkaeufe mit einem Gesamtbetrag von mehr als $10.00 gewaehrt.
 *
 *Schreiben Sie ein Programm, das nach dem Gesamtbetrag fragt und den Discountpreis berechnet.
 *Der Gesamtbetrag wird in Cent (als Ganzzahl) eingegeben.
 *
 *Verwenden Sie Ganzzahl-Arithmetik.
 *
 *Wenn mehr als 10 Euro dann 10% Rabatt*/

 import java.util.Scanner;

 class Discountpreise {

 	public static void main(String[] args) {

 		int Gesamtbetrag, Discountpreis;
 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie den Gesamtbetrag in Cent als Ganzzahl ein:");
 		Gesamtbetrag = s.nextInt();

 		if(Gesamtbetrag >= 1000){
 			Discountpreis = Gesamtbetrag - (( Gesamtbetrag * 10)/100);
 			System.out.println("Rabattpreis: " + Discountpreis + " Cent");
 			System.out.println("Sie haben " + ((Gesamtbetrag * 10)/100) + " Cent gespart.");
 		} else{
 			System.out.println("Der Gesamtbetrag ist unter 10$, da gibt es keinen Rabatt.");
 		}

 	}
 }
