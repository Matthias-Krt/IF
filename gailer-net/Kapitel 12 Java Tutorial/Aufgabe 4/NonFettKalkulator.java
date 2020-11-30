/*Kapitel 12 Aufgabe 4
 *Matthias Korte
 *
 *Verschiedene Packungen von Rinderhack haben einen unterschiedlichen Anteil von Fett und einen unterschiedlichen Preis pro Pfund.
 *
 *Schreiben Sie ein Programm, das den Anwender fragt nach:
 *	1. Dem Preis pro Pfund der Packung "A".
 *	2. Dem Prozentanteil an mageren (nicht-fetten) Fleisch in Packung "A".
 *	3. Dem Preis pro Pfund der Packung "B".
 *	4. Dem Prozentanteil an mageren (nicht-fetten) Fleisch in Packung "B".
 *
 *Das Programm berechnet dann den Preis des mageren (nicht-fetten) Rindfleischs fuer jede Packung und gibt den guenstigsten Preis aus.
 *
 *Nehmen Sie an, dass die zwei Packungen unterschiedliche Werte ergeben.*/

 import java.util.Scanner;

 class NonFettKalkulator {

 	public static void main(String[] args){

 		float PreisA, PreisB, PreisProPfundA, PreisProPfundB;
 		int ProzentA, ProzentB;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Preis pro Pfund Packung A:");
 		PreisA = s.nextFloat();
 		System.out.println("Prozent mageres Fleisch Packung A:");
 		ProzentA = s.nextInt();
 		System.out.println("Preis pro Pfund Packung B:");
 		PreisB = s.nextFloat();
 		System.out.println("Prozent mageres Fleisch Packung B:");
 		ProzentB = s.nextInt();

 		PreisProPfundA = (PreisA*ProzentA)/100;
 		PreisProPfundB = (PreisB*ProzentB)/100;

 		System.out.println();

 		System.out.println("Packung A kostet pro Pfund mageres Fleisch: " + PreisProPfundA);
 		System.out.println("Packung B kostet pro Pfund mageres Fleisch: " + PreisProPfundB);

 		if(PreisProPfundA < PreisProPfundB) {
 			System.out.println("Packung A ist preiswerter");
 		} else if(PreisProPfundB > PreisProPfundA) {
 			System.out.println("Packung B ist preiswerter");
 		} else if(PreisProPfundA == PreisProPfundB) {
            System.out.println("Preise sind gleich.")
        }
 	}
 }
