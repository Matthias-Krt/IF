/*Schreiben Sie ein Programm, das eine Zahl einliest und deren Zweier-Logarithmus ausgibt.
 *Verwenden Sie Gleitpunkt-Input.
 *Dieses Problem waere einfach, aber das Paket Math hat keine Methode fuer den Zweier-Logarithmus.
 *Stattdessen muesen Sie das tun:
 *log2 X = (loge X) / (loge 2)
 *
 *Hier ist loge X der natuerliche Logarithmus von X.
 *Diese Funktion haben Sie im Paket Math:
 *Math.log(x)
 *
 *Wenn Sie das verwenden, muss X ein double sein.
 *Schreiben Sie ein Programm, so dass der Anwender Gleitpunktzahlen eingeben kann.*/

import java.util.Scanner;

class ZweierLogarithmus {

	public static void main(String[] args) {

		double x, logx;
		Scanner s = new Scanner(System.in);

		System.out.println("Geben Sie ein Double ein: ");
		x = s.nextDouble();
		logx = Math.log(x) / Math.log(2);

		System.out.println("Der Zweierlogarithmus von " + x + " ist " + logx);
		
	}
}
