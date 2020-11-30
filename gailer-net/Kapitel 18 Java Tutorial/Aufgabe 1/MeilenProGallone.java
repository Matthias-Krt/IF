/*Kapitel 18 Aufgabe 1
 *Matthias Korte
 *
 *Schreiben Sie ein Programm,
 *das die gefahrenen Meilen pro Gallone fuer eine Reihe von Autos berechnet.
 *Die Daten fuer jedes Auto bestehen aus
 *dem Anfangs-
 *und Endstand in Meilen
 *und der Anzahl der Gallonen.
 *Das Programm wird beendet, sobald der Anwender eine negative Zahl als Anfangsstand eingibt.*/

 import java.util.Scanner;

 class MeilenProGallone{

 	public static void main(String[] args){

 		int MeilenAnfang, MeilenEnde, Meilen =0, Gallonen = 0;
 		double MeilenProGallone;

 		boolean w = true;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Wenn Sie eine negative Zahl eingeben wird das Programm beendet");

 		while(w){

	 		//Meilen
	 		System.out.println("Geben Sie den Anfangsmeilenstand ein:");
	 		MeilenAnfang = s.nextInt();
	 		if(MeilenAnfang < 0){
	 			break;	//beendet die Schleife
	 		}
	 		System.out.println("Geben Sie den Endmeilenstand ein:");
	 		MeilenEnde = s.nextInt();

	 		//Gallonen
	 		System.out.println("Geben Sie die verbrauchten Gallonen ein:");
	 		Gallonen = s.nextInt();

            //gefahrene Meilen berechnen
 			Meilen = MeilenEnde - MeilenAnfang;

            //Meilen pro Gallone berechnen
	 		MeilenProGallone = Meilen/Gallonen;

	 		System.out.print("Verbrauch (Meilen pro Gallone: ");
	 		System.out.println(MeilenProGallone);

 		}
 	}
 }
