/**Kapitel 9B Aufgabe 2
 *Mit Bogemass Sinus und Cosinus, sowie die Summe von Sinus und Cosinus zum Quadrat berechnen und ausgeben*/

class Trigonometrie {

	public static void main (String[] args)	{

		double zahl = 0.5235;
		double sinx = Math.sin(zahl);
		double cosx = Math.cos(zahl);
		double ergebnis = sinx*sinx+cosx*cosx;    //ergebnis ist immer 1, wenn man Bogenmass verwendet

		System.out.println("Bei " + zahl + " in Bogenmass betraegt der Sinus:    \t" + sinx);
		System.out.println("Bei " + zahl + " in Bogenmass betraegt der Cosinus:  \t" + cosx);
		System.out.println("Die Summe vom Sinus und Cosinus zum Quadrat betraegt: "+ ergebnis);
		System.out.println();
		System.out.println("Sinus: " + sinx + " Cosinus: " + cosx + " Ergebnis: " + ergebnis);
	} 
}
