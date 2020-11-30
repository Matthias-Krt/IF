/*Schreiben Sie ein Programm, das zwei Zahlen als Gleitpunkt einliest
 *und den ueblichen Durchschnitt (das arithmetische Mittel)
 *und das harmonische Mittel ausgibt*/

import java.util.Scanner;

class HarmonischesMittel {

	public static void main (String[] args) {

		double x, y;
		double H, A;

		Scanner s = new Scanner(System.in);

		System.out.println("Geben Sie x ein: ");
		x = s.nextDouble();
		System.out.println("Geben Sie y ein: ");
		y = s.nextDouble();

		A = (x+y)/2;
		H = 2 / (1/x + 1/y);

		System.out.println("Arithmetisches Mittel: " + A);
		System.out.println("Harmonisches Mittel: " + H);

	}
}
