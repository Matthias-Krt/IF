/*Kapitel 13 Aufgabe 5
 *Matthias Korte
 *
 *In einem Fantasy-Rollenspiel koennen die Spieler ihre Spielfiguren entwerfen,
 *indem Sie einen Punktwert fuer jedes von drei Merkmalen vergeben:
 *	1. Staerke von 1 bis 10
 *	2. Gesundheit von 1 bis 10
 *	3. Glueck von 1 bis 10
 *
 *Schreiben Sie ein Programm, das nach dem Namen der Spielfigur
 *und nach den Punktwerten der einzelnen drei Merkmale fragt.
 *Aber, die Gesamtpunktzahl muss geringer als 15 sein.
 *Wenn die Gesamtpunktzahl 15 ueberschreitet,
 *dann wird jedem Merkmal 5 Punkte zugewiesen.
 *
 *(Diese Benutzerschnittstelle koennte wesentlich komplizierter gestaltet werden.
 *Vielleicht moechten Sie einige Ihrer eigenen Ideen implementieren.)*/

 import java.util.Scanner;
 import java.util.Random;

 class FantasySpiel{

 	public static void main(String[] args){

 		int Staerke, Gesundheit, Glueck;
 		String CharakterName;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Seit gegruesst, du darfst insgesamt nicht mehr als 15 Punkte vergeben");
 		System.out.println();

 		System.out.println("Geben Sie den Namen der Spielfigur ein:");
 		CharakterName = s.nextLine();

 		System.out.println("Staerke eingeben(1-10):");
 		Staerke = s.nextInt();

 		System.out.println("Gesundheit eingeben(1-10):");
 		Gesundheit  = s.nextInt();

 		System.out.println("Glueck  eingeben(1-10):");
 		Glueck = s.nextInt();

 		if((Staerke + Gesundheit + Glueck) > 15){
 			System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben!");
 			System.out.println("Es werden jedem Merkmal 5 Punkte zugewiesen.");
 			Staerke = 5;
 			Gesundheit = 5;
 			Glueck = 5;
  		}

        System.out.println(CharakterName + ", Staerke: " + Staerke + ", Gesundheit: " + Gesundheit + ", Glueck: " + Glueck);
        System.out.println();

 	}
 }
