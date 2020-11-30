/**Kapitel 9B Aufgabe 1
 *Schreiben Sie ein Programm, das die durchschnittliche Niederschlagsmenge f�r die drei Monate April, Mai und Juni berechnet.
 *Deklarieren und initialisieren Sie eine Variable fuer jeden Monat. */

class Niederschlagsmenge {
	public static void main (String[] args) {
		int April = 12;
		int Mai = 14;
		int Juni = 8;

		System.out.println("Niederschlag im April: \t" + April);
		System.out.println("Niederschlag im Mai: \t" + Mai);
		System.out.println("Niederschlag im Juni: \t" + Juni);
		System.out.println("Durschnitt: \t \t \t" + ((April+Mai+Juni)/3.0));

		//Tipp:	Man darf den Durchschnitt nicht vorher als integer deklarieren, weil dieser keine Gleitzahlen darstellt
	}
}
