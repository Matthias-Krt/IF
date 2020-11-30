/*Schreiben Sie ein Programm, das den Anwender nach der Spannung und dem Widerstand eines Geraets fragt.
 *Das Programm wird dann die Stromstaerke, die durch ein Geraet fliesst, ausgeben.
 *
 *Da U und R Ganzahlen sind(konvertiert vom Input des Anwenders) muessen Sie einen Trick anwenden,
 *um die Gleitpunktdivision durchzufuehren. Aendern Sie die Gleichung in:
 *	i = (U+0.0)/r*/

 import java.util.Scanner;

 class OhmscheGesetz {

 	public static void main(String[] args) {

 		int U, R;    //Spannung, Widerstand
 		double i;    //Stromstaerke

 		Scanner s = new Scanner(System.in);

 		System.out.println("Geben Sie die Spannung ein:");
 		U = s.nextInt();
 		System.out.println("Geben Sie den Widerstand ein:");
 		R = s.nextInt();

 		i = (U + 0.0)/R;
 		System.out.println("Bei einer Spannung von " + U + " Volt und einem Widerstand von " + R + " Ohm, fliesst eine Stromstaerke von " + i + " Ampere");

 	}
 }
