/*Wenn Sie in einem Geschaeft an der Kasse Ihr Wechselgeld bekommen,
 *gibt Ihnen der Kassenmitarbeiter
 *zuerst Dollar, (100 Cent),
 *dann Quarter (25 Cent),
 *dann Dime (10 Cent),
 *dann Nickel (5 Cent)
 *und schliesslich Cent zurueck (1 Cent)
 *
 *Schreiben Sie ein Programm,
 *das Wechselgeld in Cent einliest
 und die Anzahl der Dollar, Quarter, Dime, Nickel und Cent ausgibt.
 *Alle Variablen und alle mathematischen Operationen sind vom Typ Ganzzahl.*/

 import java.util.Scanner;

 class Wechselbeld {

 	public static void main(String[] args) {

 		int Wechselgeld;
 		int Dollar, Quarter, Dime, Nickel, Cent;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie das Wechselgeld in Cent ein:");
 		Wechselgeld = s.nextInt();

 		/*int Rest1, Rest2, Rest3, Rest4;

 		Dollar = Wechselgeld/100;
 		Rest1 = Wechselgeld%100;	//Rest 1
 		Quarter = Rest1/25;
 		Rest2 = Rest1%25;			//Rest 2
 		Dime = Rest2/10;
 		Rest3 = Rest2%10;			//Rest 3
 		Nickel = Rest3/5;
 		Rest4 = Rest3%5;		    //Rest 4
 		Cent = Rest4;

 		System.out.println("Das Wechselgeld ist " + Dollar + " Dollar, " + Quarter + " Quarter, " + Dime + " Dime, " + Nickel + " Nickel und " + Cent + " Cent.");*/

 		Dollar = Wechselgeld/100;
 		Quarter = (Wechselgeld%100)/25;
 		Dime = ((Wechselgeld%100)%25)/10;
 		Nickel = (((Wechselgeld%100)%25)%10)/5;
 		Cent = (((Wechselgeld%100)%25)%10)%5;

 		System.out.println("Das Wechselgeld ist " + Dollar + " Dollar, " + Quarter + " Quarter, " + Dime + " Dime, " + Nickel + " Nickel und " + Cent + " Cent.");

 	}
 }
