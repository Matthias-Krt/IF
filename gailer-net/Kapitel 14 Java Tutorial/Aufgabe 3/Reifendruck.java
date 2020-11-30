/*Kapitel 14 Aufgabe 3
 *Matthias Korte
 *
 *Die beiden vorderen Reifen eines Autos sollten beide den gleichen Reifendruck haben.
 *Ebenso sollten die beiden hinteren Reifen den gleichen Reifendruck haben,
 *aber nicht unbedingt den gleichen wie die Vorderreifen.
 *
 *Schreiben Sie ein Programm,
 *das den Reifendruck der vier Reifen einliest
 *und dann eine Meldung ausgibt, ob der Reifendruck in Ordnung ist.*/

 import java.util.Scanner;

 class Reifendruck{

 	public static void main(String[] args){

 	float DruckVR, DruckVL, DruckHR, DruckHL;

 	Scanner s = new Scanner(System.in);

 	System.out.println("Reifendruck rechter Vorderreifen");
 	DruckVR = s.nextFloat();
 	System.out.println("Reifendruck linker Vorderreifen");
 	DruckVL = s.nextFloat();
 	System.out.println("Reifendruck rechter Hinterreifen");
 	DruckHR = s.nextFloat();
 	System.out.println("Reifendruck linker Hinterreifen");
 	DruckHL = s.nextFloat();

 	System.out.println();

 	if((DruckVR == DruckVL) && (DruckHR == DruckHL)){
 		System.out.println("Reifendruck ist OK");
 	}else {
 		System.out.println("Reifendruck sollte geprueft werden");
 	}

 	}
 }
