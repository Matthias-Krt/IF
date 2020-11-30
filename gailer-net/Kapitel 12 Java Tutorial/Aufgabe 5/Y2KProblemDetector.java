/*Kapitel 12 Aufgabe 5
 *Matthias Korte
 *
 *Schreiben Sie ein Programm,
 *dass den Anwender nach seinem Geburtsjahr fragt,
 *kodiert als zwei Ziffern (wie "62"),
 *und nach dem aktuellen Jahr fragt,
 *ebenfalls kodiert als zwei Ziffern (wie 99).
 *Das Programm soll das richtige Alter des Anwenders in Jahren ausgeben.
 *
 *Beachte die Eingabe wie z.B. 04*/

 import java.util.Scanner;

 class Y2KProblemDetector {

 	public static void main(String[] args){

 		int GebY, AktuellY;
 		int Alter;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie das Geburtsjahr ein (mit zwei Ziffern (z.B. 1969 -> 69):");
 		GebY = s.nextInt();
 		System.out.println("Geben Sie das aktuelle Jahr ein (mit zwei Ziffern (z.B. 1999 -> 99):");
 		AktuellY = s.nextInt();

 		Alter = AktuellY - GebY;     //Alter berechnen 

 		if(Alter<0){
 			Alter = 100 + Alter;	//Jahrhundertwende
 		}

 		System.out.println("Ihr Alter ist: " + Alter);
 	}
 }
