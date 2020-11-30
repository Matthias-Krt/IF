/*Kapitel 15 Aufgabe 2
 *Matthias Korte
 *
 *Schreiben Sie ein Programm, das ein Wort einliest.
 *Das Wort wird dann so oft ausgegeben, wie es Buchstaben hat:
 *
 *Verwenden Sie die Methode length(),
 *um die Anzahl der Zeichen eines Strings zu ermitteln:*/

 import java.util.Scanner;

 class whileSchleife2{

 	public static void main(String[] args){

 		String inputString;
 		int laenge, zaehler = 1;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie ein Wort ein:");
 		inputString = s.nextLine();

 		laenge = inputString.length();

 		System.out.println();

 		while(zaehler <= laenge){
 			System.out.println(inputString);
 			zaehler ++;
 		}

 	}
 }
