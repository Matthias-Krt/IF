/*Kapitel 16 Aufgabe 1
 *Matthias Korte
 *
 *Schreiben Sie ein Programm, das Integer addiert, die vom Benutzer eingegeben werden.
 *Das Programm fragt zuerst wie viele Zahlen addiert werden sollen.
 *Danach fordert das Programm den Benutzer auf die Zahlen nacheinander einzugeben.
 *Schliesslich gibt es das Ergebnis auf den Bildschirm aus.*/

 import java.util.Scanner;

 class IntegerAddieren{

 	public static void main(String[] args){

 		int IntAnzahl, Summe = 0, i = 1;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Wie viele Integer sollen addiert werden:");          //wie viele Zahlen sollen addiert werden
 		IntAnzahl = s.nextInt();                                                 //IntAnzahl

 		while(i <= IntAnzahl){
 			System.out.println("Geben Sie einen Integer ein:");                  //Zahl eingebn, welche addiert werden soll
 			Summe = Summe + s.nextInt();                                         //Summe = alte Summe + Integer, welcher eingegeben wurde
 			i++;                                                                 
 		}

 		System.out.println("Die Summe ist " + Summe);                            //Ausgabe der Summe

 	}
 }
