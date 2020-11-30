/*Schreiben Sie ein Programm, das die Flaeche eines Kreises aus dem Radius berechnet.
 *Der Radius ist ein int-Wert und wird ueber die Tastatur eingelesen.
 *
 *Sie werden die Konstante PI benooetigen,
 *die Sie bekommen, indem Sie Math.PI verwenden.*/

import java.util.Scanner;

class KreisFlaeche {

	public static void main (String[] args) {

		int r;		//Radius
		double A;	//Flaeche

		Scanner s = new Scanner(System.in);		//Scanner erstellen

		System.out.println("Geben Sie den Radius als Ganzzahl ein:");
		r = s.nextInt();		//Eingabe des Nutzers abfragen

		A = r * r * Math.PI;	//Flaeche = r^2 * PI Variable

		System.out.println("Der Radius ist: " + r + " Die Flaeche betraegt: " + A);

	}
}
