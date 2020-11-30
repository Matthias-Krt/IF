/*Kapitel 16 Aufgabe 2
 *Matthias Korte
 *
 *Schreiben Sie ein Programm, das die folgende Summe berechnet
 *		summe = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/n
 *Die Variable n ist ein Integer, bis zu dem die Reihe berechnet werden soll.
 *Sie wird vom Anwender eingegeben.*/

 import java.util.Scanner;

 class nSumme{

 	public static void main(String[] args){

 		int n,i = 1;
 		double Summe = 0;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben sie n ein:");
 		n = s.nextInt();

 		while(i<=n){
 			Summe = Summe + 1.0/i;
 			i++;
 		}

 		System.out.println("Die Summe ist: " + Summe);

 	}
 }
