/*Kapitel 15 Aufgabe 1
 * Matthias Korte
 *
 *Schreiben Sie ein Programm,
 *das den Anwender nach einem Start- und Endwert fragt
 *und dann alle Zahlen (Integer) inklusive der eingegebenen ausgibt.*/

 import java.util.Scanner;

class whileSchleife1{

	public static void main(String[] args){

		int zaehler, start, limit;

		Scanner s = new Scanner(System.in);

		System.out.println("Start:");
		start = s.nextInt();
		System.out.println("Limit:");
		limit = s.nextInt();

		zaehler = start;

		while ( zaehler <= limit ) {
		  System.out.println( "Zaehler ist:" + zaehler );
		  zaehler = zaehler + 1;
		}

		System.out.println( "Schleife beendet" );

	}
}
