/*Kapitel 13 Aufgabe 3
 *Matthias Korte
 *
 *Die maximal moegliche Effizienz einer Dampfmaschine
 *ist abhaengig von der Dampftemperatur im Heizkessel und von der Aussentemperatur der Luft:
 *	effizienz = 1 - tLuft / tDampf
 *tLuft = Lufttemperatur
 *tDampf = Dampftemperatur
 *
 *Temperaturen werden in Kalvin angegeben
 *Die normale Lufttemperatur betraegt ungefaehr 300 Kelvin.
 *Der Siedepunkt liegt bei 373 Kelvin.
 *
 *Aufgabe:
 *Schreiben Sie ein Programm, das den Anwender nach der Luft- und Dampftemperatur fragt
 *und die maximal moegliche Effizienz der Dampfmaschine ausgibt.
 *Aber, wenn die Dampftemperatur weniger als 373 Kelvin betraegt,
 *dann gibt es keinen Dampf und die Effizienz betraegt 0.
 *
 *Verwenden Sie Ganzzahl- oder Gleitpunkt-Input,
 *aber fuehren Sie die Berechnungen mit Gleitpunkt durch.*/

 import java.util.Scanner;

 class EffizenzDampfmaschinen{

 	public static void main(String[] args){

 		float tLuft, tDampf;
 		double Effizenz;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie die Lufttemperatur in Kelvin ein:");
 		tLuft = s.nextFloat();
 		System.out.println("Geben Sie die Dampfttemperatur in Kelvin ein:");
 		tDampf = s.nextFloat();

 		if(tDampf < 373){
 			Effizenz = 0;
 			System.out.println("Die Effizenz betraegt: " + Effizenz);
 			System.out.println("Die Dampftemperatur ist unter 373 Kelvin, da entsteht kein Dampf");
 		} else {
 			Effizenz = 1.0 - tLuft / tDampf;
 			System.out.println("Die Effizenz betraegt: " + Effizenz);
 		}

 	}
 }
