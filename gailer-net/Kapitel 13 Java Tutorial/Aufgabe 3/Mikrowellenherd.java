/*Kapitel 13 Aufgabe 3
 *Matthias Korte

 *Der Hersteller eines Mikrowellenherds empfiehlt beim Erhitzen von
 *zwei Posten 50% mehr Erhitzungszeit
 *und beim Erhitzen von drei Posten, die Erhitzungszeit zu verdoppeln.
 *Das Erhitzen von mehr als drei Posten wird nicht empfohlen.
 *
 *Schreiben Sie ein Programm, das den Anwender nach der Anzahl der Posten
 *und nach der Erhitzungszeit fuer einen Posten fragt.
 *Das Programm gibt dann die empfohlene Erhitzungszeit aus.
 *
 *Hinweis: Verwenden Sie vier aufeinanderfolgende einzweigige if-Anweisungen,
 *wobei jede von ihnen einen von vier Faellen testet: 1 Posten, 2 Posten, 3 Posten, mehr als drei Posten.*/

 import java.util.Scanner;

 class Mikrowellenherd {

 	public static void main(String[] args) {

 		int AnzahlPosten;
 		float ErhitzungszeitPosten;
 		double Erhitzungszeit;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Wie viele Posten moechten Sie erhitzen?");
 		AnzahlPosten = s.nextInt();
 		System.out.println("Erhitzungszeit fuer einen Posten:");
 		ErhitzungszeitPosten = s.nextFloat();

 		if(AnzahlPosten == 1){
 			Erhitzungszeit = ErhitzungszeitPosten;
 			System.out.println("Die empfohlene Erhitzungszeit fuer " + AnzahlPosten + " Posten betraegt " + Erhitzungszeit + " Sekunden");
 		}

 		if(AnzahlPosten == 2){
 			Erhitzungszeit = ErhitzungszeitPosten + (ErhitzungszeitPosten/2);
 			System.out.println("Die empfohlene Erhitzungszeit fuer " + AnzahlPosten + " Posten betraegt " + Erhitzungszeit + " Sekunden");
 		}

 		if(AnzahlPosten == 3){
 			Erhitzungszeit = ErhitzungszeitPosten * 2;
 			System.out.println("Die empfohlene Erhitzungszeit fuer " + AnzahlPosten + " Posten betraegt " + Erhitzungszeit + " Sekunden");
 		}

 		if(AnzahlPosten > 3){
 			System.out.println("Das erhitzen von mehr als 3 Posten wird nicht empfohlen.");
 		}

 	}
 }
