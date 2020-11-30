/*Kapitel 14 Aufgabe 2
 *Matthias Korte
 *
 *Beim State Fair Pie Eating Contest muessen alle Teilnehmer in der Schwergewichtsklasse
 *zwischen 235 und 265 Pfund wiegen.
 *
 *Schreiben Sie ein Programm, das nach dem Gewicht des Teilnehmers fragt
 * und dann ausgibt, ob er zum Wettbewerb zugelassen ist oder nicht.*/

 import java.util.Scanner;

 class WettbewerbTortenEssen{

 	public static void main(String[] args){

 		double Gewicht;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Gewicht des Teilnehmers (in Pfund):");
 		Gewicht = s.nextDouble();

 		if(Gewicht >= 235 && Gewicht <= 265){
 			System.out.println("Der Teilnehmer ist fuer die Schwergewichtsklasse zugelassen");
 		}else{
 			System.out.println("Der Teilnehmer ist NICHT fuer die Schwergewichtsklasse zugelassen");
 		}
 	}
 }
