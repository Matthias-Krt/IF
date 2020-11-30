/*Kapitel 14 Aufgabe 1
 *Matthias Korte
 *
 *Eine Bank verfuehrt nach der folgenden Regel:
 *Wenn ein Kunde auf seinem Girokonto ein Guthaben von mehr als 1000$
 *oder auf seinem Sparkonto ein Guthaben von mehr als 1500$ hat,
 *wird keine Scheckgebuehr erhoben.
 *Andernfalls wird eine Gebuehr von 0.15$ erhoben.
 *
 *Schreiben Sie ein Programm, das nach dem Kontostand der beiden Konten fragt
 *und dann ausgibt, ob eine Gebuehr erhoben wird oder nicht.*/

 import java.util.Scanner;

 class Scheckgebuehr{

 	public static void main(String[] args){

 		float Girokonto, Sparkonto;
 		final double CHECKGEBUEHR = 0.15;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben sie Ihr Girokonto Guthaben ein:");
 		Girokonto = s.nextFloat();
 		System.out.println("Geben sie Ihr Sparkonto Guthaben ein:");
 		Sparkonto = s.nextFloat();

 		if(Girokonto > 1000 || Sparkonto > 1500){
 			System.out.println("Es wird keine Gebuehr erhoben.");
 		}else{   //wenn Girokonto <= 1000 oder Sparkonto <= 1500
 			System.out.println("Es wird eine Gebuehr von " + CHECKGEBUEHR + "$ erhoben");
 		}

 	}
 }
