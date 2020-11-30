/*Kapitel 14 Aufgabe 5
 *Matthias Korte
 *
 *Reifen muessen nicht genau den gleichen Druck haben.
 *Veraendern Sie Ihr Programm aus Aufgabe 3,
 *so dass sich die beiden Vorder- und Hinterraeder in einem Toleranzbereich von 3 psi bewegen duerfen.*/

 import java.util.Scanner;

 class Reifendruck3{

 	public static void main(String[] args){

 		float DruckVR, DruckVL, DruckHR, DruckHL, toleranzV, toleranzH;          //V = Vorne, H = Hinten, R = Rechts, L = Links

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

	 	//Toleranz berechnen
	 	toleranzV = DruckVR - DruckVL;
	 	toleranzH = DruckHR - DruckHL;

	 	if(toleranzV<=3 && toleranzV >=-3 && toleranzH <=3 && toleranzH>=-3){    //ist die oben berechnete Toleranz noch im Toleranzbereich von 3 psi
	 		System.out.println("Reifendruck ist OK");
	 	}else{
	 		System.out.println("Reifendruck sollte geprueft werden");
	 	}

 	}
 }
