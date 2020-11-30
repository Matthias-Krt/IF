/*Kapitel 13 Aufgabe 3
 *Matthias Korte
 *
 *Das Programm fragt welchen Artikel der Kunde moechte,
 *den Preis und ob der Artikel per Express verschickt werden soll.
 *Fuer Artikel unter $10 betragen die Versandkosten $2.00.
 *Kostet der Artikel $10 oder mehr betragen sie $3.00.
 *Der Expresszuschlag betraegt $5.00.
 *
 *(Verwenden Sie die Konsole I/O-Methoden.)*/

 import java.util.Scanner;

 class InternetDelikatessen {

 	public static void main(String[] args){

 		final int VERSANDKOSTEN0, VERSANDKOSTEN1, EXPRESSZUSCHLAG;
 		VERSANDKOSTEN0 = 2;
 		VERSANDKOSTEN1 = 3;
 		EXPRESSZUSCHLAG = 5;

 		int ExpressversandBool, Versandkosten;

 		float Preis, Gesamtkosten;
 		String Artikel;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie den Artikel ein:");
 		Artikel = s.nextLine();
 		System.out.println("Geben Sie den Preis ein:");
 		Preis = s.nextFloat();
 		System.out.println("Expressversand (0=nein, 1=ja):");
 		ExpressversandBool = s.nextInt();
 		//alternativ: 2x mit .nextLine(); abfragen

 		System.out.println("");

 		if(Preis < 10){
 			Versandkosten = VERSANDKOSTEN0;
 		} else{
 			Versandkosten = VERSANDKOSTEN1;
 		}

 		if(ExpressversandBool == 1){
 			 Versandkosten += EXPRESSZUSCHLAG;
 		}

 		Gesamtkosten = Preis + Versandkosten;

 		System.out.println("+++ Rechnung +++");
 		System.out.println("\t " + Artikel + ": \t" + Preis);
 		System.out.println("\t Versand: \t" + Versandkosten);
 		System.out.println("\t Gesamt: \t" + Gesamtkosten);

 	}
 }
