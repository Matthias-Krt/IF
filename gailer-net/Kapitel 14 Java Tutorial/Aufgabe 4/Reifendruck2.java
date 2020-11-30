/*Kapitel 14 Aufgabe 4
 *Matthias Korte
 *
 *Es genuegt nicht, dass der Reifendruck der beiden Vorder- und Hinterraeder der gleiche ist.
 *Beide Reifendruecke muessen sich innerhalb eines bestimmten Bereichs befinden.
 *
 *Erweitern Sie das Pogramm aus Aufgabe 3.
 *Es soll ueberpruefen, ob sich der Druck aller Reifen zwischen 35 und 45 befindet.
 *Befindet sich ein Reifen ausserhalb dieses Bereichs, wird sofort eine Warnmeldung ausgegeben.
 *Danach fuehrt das Programm mit dem Einlesen und Verarbeiten der Werte fort.
 *
 *Kommt es zu einer Warnmeldung, dann gibt das Programm am Ende eine letzte Warnmeldung aus.
 *Deklarieren Sie dafuer eine boolesche Variable druckOK.
 *Initialisieren Sie sie mit true und setzen Sie den Wert auf false,
 *wenn sich ein Reifen ausserhalb des gueltigen Bereichs befindet.*/

 import java.util.Scanner;

 class Reifendruck2{

 	public static void main(String[] args){

 		float DruckVR, DruckVL, DruckHR, DruckHL;

	 	Scanner s = new Scanner(System.in);

	 	boolean druckOK = true;

	 	System.out.println("Reifendruck rechter Vorderreifen");
	 	DruckVR = s.nextFloat();
	 	if((DruckVR>=35) && (DruckVR <= 45)){
	 	}else{
	 		System.out.println("Warnung: Der Reifendruck ist ausserhalb de erlaubten Bereichs");
	 		druckOK = false;
	 	}

	 	System.out.println("Reifendruck linker Vorderreifen");
	 	DruckVL = s.nextFloat();
	 	if((DruckVL>=35) && (DruckVL <= 45)){
	 	}else{
	 		System.out.println("Warnung: Der Reifendruck ist ausserhalb de erlaubten Bereichs");
	 		druckOK = false;
	 	}

	 	System.out.println("Reifendruck rechter Hinterreifen");
	 	DruckHR = s.nextFloat();
	 	if((DruckHR>=35) && (DruckHR <= 45)){
	 	}else{
	 		System.out.println("Warnung: Der Reifendruck ist ausserhalb de erlaubten Bereichs");
	 		druckOK = false;
	 	}

	 	System.out.println("Reifendruck linker Hinterreifen");
	 	DruckHL = s.nextFloat();
	 	if((DruckHL>=35 && DruckHL <= 45)){
	 	}else{
	 		System.out.println("Warnung: Der Reifendruck ist ausserhalb de erlaubten Bereichs");
	 		druckOK = false;
	 	}

	 	System.out.println();

	 	 if((DruckVR == DruckVL) && (DruckHR == DruckHL) && (druckOK == true)){
 		System.out.println("Reifendruck ist OK");
 		}else{
 		System.out.println("Reifendruck sollte geprueft werden");
 		}

 	}
 }
