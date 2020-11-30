/*Kapitel 17 Aufgabe 1
 *Matthias Korte
 *
 *Schreiben Sie ein Programm, das Quadrat- und Kubikzahlen (Integer)
 *von 1 bis n addiert.
 *Wobei n vom Anwender eingegeben wird.
 *
 *Verwenden Sie nur eine Schleife.*/

 import java.util.Scanner;

 class AdditionQuadratKubikzahlen{

 	public static void main(String[] args){

 		int n, i = 1;
        int sumQ = 0, sumK = 0;     //Summen

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie n ein:");
 		n = s.nextInt();

 		while(i<=n){
 			sumQ = sumQ + i*i;      //Quadrat Summe
 			sumK = sumK + i*i*i;    //Kubik Summe
 			i++;
 		}

 		System.out.println("Die Quadratsumme ist: " + sumQ);
 		System.out.println("Die Kubiksumme ist: " + sumK);

 	}
 }
