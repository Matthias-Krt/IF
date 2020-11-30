/*Schreiben Sie ein Programm, das die jaehrlichen Stromkosten eines elektrischen Geraetes berechnet.
 *Das Programm fragt den Anwender nach den Kosten je Kilowattstunde
 *und nach der Anzahl der Kilowattstunden pro Jahr:*/

import java.util.Scanner;

class Stromkosten {

	public static void main(String[] args) {

		float Kkwh, Akwh, Kosten; //Kosten kwh, Anzahl kwh, Gesamt Kosten

		Scanner scan = new Scanner( System.in );

		System.out.println("Geben Sie den Preis pro Kilowattstunde in Cent ein:");
		Kkwh = scan.nextFloat();

		System.out.println("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein:");
		Akwh = scan.nextFloat();

		Kosten = Kkwh * Akwh;
		System.out.println("Jahreskosten: " + Kosten);

	}
}
