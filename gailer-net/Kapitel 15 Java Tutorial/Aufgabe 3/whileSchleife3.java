/*Kapitel 15 Aufgabe 3
 *Matthias Korte
 *
 *Schreiben Sie ein Programm, das zwei Woerter einliest.
 *Das Programm gibt dann beide Worte auf einer Zeile aus.
 *Dabei werden die Worte durch Punkte getrennt.
 *Die Gesamtlaenge der ausgegebenen Zeichen soll 30 betragen:
 *
 *Das koennte fuer ein Inhaltsverzeichnis verwendet werden.
 *
 *Hinweis: Verwenden Sie System.out.print(".") innerhalb einer Schleife, um die Punkte auszugeben.*/

 import java.util.Scanner;

 class whileSchleife3{

 	public static void main(String[] args){

 		String erste, zweite;

 		int zaehler = 1, laengePkt;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie das erste Wort ein:");
 		erste = s.nextLine();
 		System.out.println("Geben Sie das zweite Wort ein:");
 		zweite = s.nextLine();

 		laengePkt = 30 - erste.length() - zweite.length();

 		System.out.print(erste);

 		while(zaehler <= laengePkt){
 			System.out.print(".");
 			zaehler ++;
 		}

 		System.out.print(zweite);

 	}
 }
