/*Kapitel 17 Aufgabe 3
 *Matthias Korte
 *
 *Schreiben Sie ein Programm, das Sterne in Keilform ausgibt.
 *Der Anwender gibt die Anfangszahl fuer die Sterne ein
 *und das Programm gibt Zeilen von Sternen aus,
 *wobei jede Zeile einen Stern weniger hat als die vorhergehende.*/

 import java.util.Scanner;

 class KeilVonSternen{

 	public static void main(String[] args){

 		int Sterne,i = 1, anzahlRows, row = 1;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Anfangszahl der Sterne:");
 		Sterne = s.nextInt();

 		anzahlRows = Sterne;

 		while(row <= anzahlRows){

 			while(i<=Sterne){
 				System.out.print("*");
 				i++;
 			}
 			System.out.println();
 			i=1;
 			Sterne = Sterne -1;
 			row++;
 		}

 	}
 }
