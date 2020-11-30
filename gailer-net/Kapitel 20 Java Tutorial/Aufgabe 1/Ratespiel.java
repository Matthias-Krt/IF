/*Kapitel 20 Aufgabe 1
 *Matthias Korte
 *
 *Schreiben Sie ein Programm,
 *dass ein Ratespiel implementiert.
 *Dies ist ein "klassisches" Programm, das haeufig in den Anfangsklassen der Informatik gestellt wird.
 *
 *Das Programm ermittelt eine Zufallszahl zwischen 1 und 10.
 *Der Anwender bekommt jetzt 3 Versuche die Zahl zu erraten.
 *Sobald der Anwender die richtige Zahl eingibt,
 *gibt das Programm eine Gewinnmeldung aus und endet.
 *Wenn der Anwender nach 3 Versuchen die richtige Zahl nicht erraten hat,
 *gibt das Programm eine entsprechende Meldung aus und endet.
 *
 *Verwenden Sie die Methoden der Klasse Random.
 *
 * - Es werden 2 Scanner verwendet, weil ansonsten ein Bug auftritt(Der .nextLine() befehl wird übersprungen)
 */

 import java.util.Random;
 import java.util.Scanner;

 class Ratespiel {

 	public static void main(String[] args){

 		Random rnd = new Random();

 		int userInput, rndX, i = 1;
 		boolean w = false, b = true;
 		String input;

 		Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

		while(b == true){
            userInput = 0;
            //zufaellige Zahl zwischen 0 und 9, +1 um den Bereich 1 bis 10 zu bekommen
            rndX = rnd.nextInt(10)+1;
            i = 1;
            w = false;

			System.out.println("Ich denke an eine Zahl von 1 bis 10.");
 			System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
 			System.out.println("Raten Sie!");

	 		while(w == false && i <= 3){
	 			System.out.println("Versuch: " + i);
	 			userInput = s.nextInt();

	 			if(userInput == rndX){
	 				w = true;
	 				System.out.println("RICHTIG!");
	 			}else{
	 				System.out.println("Falsch");
	 			}
	 			i++;
	 		}

	 		if(w==true){
	 			System.out.println("Sie haben das Spiel gewonnen.");
	 		}else{
	 			System.out.println("Sie haben das Spiel verloren.");
	 			System.out.println("Ich habe an " + rndX + " gedacht");
	 		}

            //erneutes spielen abfrage
	 		System.out.println("Moechten Sie noch einmal spielen? [ja = j | nein = n]");
	 		input = sc.nextLine();

	 		System.out.println();

	 		if(input.equals("j")){
	 			b = true;
	 		} else if(input.equals("n")){
                b = false;
                break;
            } else {
            	System.out.println("Die Eingabe ist ungueltig. Das Programm wird beendet!");
            	b = false;
            	break;
            }

		}

 	}
 }
