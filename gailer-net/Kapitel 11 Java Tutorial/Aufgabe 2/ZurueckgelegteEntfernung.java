/*Wenn ein Stein von einem Turm herunterfaellt,
 *faellt er schneller und schneller, bis er die Erde erreicht hat.
 *Die zurueckgelegte Entfernung e wird bestimmt durch:
 *
 *Dabei ist e die zurueckgelegte Entfernung in Meter,
 *z ist die Zeit in Sekunden
 *und G ist die Konstante der Erdbeschleunigung 9.81.
 *Schreiben Sie ein Programm, das den Anwender nach der Anzahl der Sekunden fragt
 *und die zurueckgelegte Entfernung pro Sekunde ausgibt.*/

import java.util.Scanner;

class ZurueckgelegteEntfernung {

	public static void main(String[] args) {

		double e, G, z;

		G = 9.81;

		Scanner s = new Scanner(System.in);

		System.out.println("Geben Sie die Anzahl der Sekunden ein: ");
		z = s.nextDouble();
		System.out.println(z);

		e = (G*z*z)*(0.5);

		System.out.println("Die entfernung e betraegt: " + e + " Meter

	}
}
