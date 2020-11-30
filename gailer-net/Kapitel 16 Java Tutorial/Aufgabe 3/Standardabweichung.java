/*Kapitel 16 Aufgabe 3
 *Matthias Korte
 *
 *Schreiben Sie ein Programm, das die Standardabweichung fuer eine Reihe von Gleitpunktzahlen berechnet,
 *die vom Anwender eingegeben werden.
 *Zuerst teilt der Anwender mit wie viele Zahlen N folgen werden.
 *Dann wird das Programm die Gleitpunktzahlen anfordern
 *und nacheinander einlesen.
 *Schliesslich wird es die Standardabweichung ausgeben.
 *Die Standardabweichung fuer einen Satz Zahlen Xi ist:
 *	SD = Math.sqrt( durchschnittQ - durchschnitt2 )
 *Dabei ist durchschnitt der Durchschnitt der Zahlen N und durchschnitt2 ist das Quadrat des Durchschnitts.
 *durchschnittQ ist der Durchschnitt von Xi * Xi. Mit anderen Worten,
 *es ist der Durchschnitt der quadrierten Werte aller Gleitpunktzahlen.
 *
 *mehrere Dinge innerhalb des Schleifenkoerpers fuer jeden Gleitpunktwert tun muessen.
 *Die Gleitpunktwerte muessen addiert werden und die Quadrate der Gleitpunktwerte muessen addiert werden.
 *Dann, nachdem die Schleife fertig ist,
 *wenden Sie die Formel an.*/

 import java.util.Scanner;

 class Standardabweichung{

 	public static void main(String[] args){

 		int n, i = 1;
 		double xI, xQ;
        double SummexI = 0, SummexQ = 0;
        double durchschnittQ, durchschnitt, SD;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben sie n ein:");
 		n = s.nextInt();

 		while(i <= n){
 			i++;
 			System.out.println("Geben Sie eine Zahl ein:");
 			xI = s.nextDouble();
 			xQ = xI*xI;
 			SummexI = SummexI + xI;
 			SummexQ = SummexQ + xQ;
 		}

 		durchschnitt = SummexI / n;
 		durchschnittQ = SummexQ / n;

 		SD = Math.sqrt(durchschnittQ-(durchschnitt*durchschnitt));

 		System.out.println("SD: " + SD);

 	}
 }
