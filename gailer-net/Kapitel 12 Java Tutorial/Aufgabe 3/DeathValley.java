/*Sie sollen ein Programm schreiben,
 *das den Fahrern hilft zu entscheiden, ob sie tanken sollen oder nicht. 
 *Das Programm fragt nach:
 *	Der Tankkapazität in Gallonen(3,78l)
 *	Der Benzinanzeige in Prozent (voll= 100, drei viertel voll = 75 usw.)
 *	Dem Benzinverbrauch des Fahrzeuges in Meilen pro Gallone.
 *
 *Die Ausgabe des Programms ist "Tanken!", oder "Weiterfahren...". 
 *Je nachdem, ob das Fahrzeug genug Benzin für 200 Meilen hat oder nicht.
 *
 *Verwenden Sie für die Eingabe und die Arithmetik Ganzzahlen*/
 
 import java.util.Scanner;
 
 class DeathValley {
 	
 	public static void main(String[] args){
 		
 		int Tankkapazitaet, Benzinanzeige, Benizinverbrauch;
 		Scanner s = new Scanner(System.in);
 		
 		System.out.println("Tankkapazität:");
 		Tankkapazitaet = s.nextInt();
 		System.out.println("Benzinanzeige in %(100/75/50/25/0):");
 		Benzinanzeige = s.nextInt();
 		System.out.println("Meilen pro Gallone:");
 		Benizinverbrauch = s.nextInt();
 		
 		System.out.println("");
 		
 		if ((((Tankkapazitaet*Benzinanzeige)/100)*Benizinverbrauch) < 200){
 			System.out.println("Tanken!");
 		} else {
 			System.out.println("Weiterfahren...");
 		}
 		
 	}
 }