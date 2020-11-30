/*Kapitel 17 Aufgabe 2
 *Matthias Korte
 *
 *Schreiben Sie ein Programm, das x^n berechnet,
 *wobei x eine Gleitpunktzahl
 *und n ein positiver Integer ist.
 *Bei der Eingabe einer negativen Zahl,
 *wird das Programm den Anwender informieren, dass n positiv sein muss.*/

 import java.util.Scanner;

 class Potenz{

 	public static void main(String[] args){

 		int n,i = 1;
 		double x, fakx = 1;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie x ein:");
 		x = s.nextDouble();
 		System.out.println("Geben Sie n ein:");
 		n = s.nextInt();

        if(n<0){
            System.out.println("n muss positiv sein!");
        }

 		System.out.println();

 		while(i<=n){
 			fakx = fakx * x;
 			i++;
 		}

 		System.out.println(x + " hoch " + n + " ergibt: " + fakx);

 	}
 }
