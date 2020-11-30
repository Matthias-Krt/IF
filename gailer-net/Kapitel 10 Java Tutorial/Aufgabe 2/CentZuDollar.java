/*Schreiben Sie ein Programm, das eine Zahl in Cent einliest.
 *Das Programm soll die Anzahl von Dollar und Cent ausgeben.
 *Verwenden Sie fuer dieses Programm Ganzzahlarithmetik
 *und vermeiden Sie Gleitpunktarithmetik.*/

 import java.util.Scanner;

 class CentZuDollar {

 	public static void main (String[] args) {
 		int c,D,Rest;    //Cent, Dollar, Rest
 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie die Cent ein:");
 		c = s.nextInt(); //Cent wird die als nächstes eingegebene Ganzzahl

 		D = c/100;
 		Rest = c%100;   

 		System.out.println("Das ergibt " + D + " Dollar und " + Rest + " Cent.");
 	}
 }
