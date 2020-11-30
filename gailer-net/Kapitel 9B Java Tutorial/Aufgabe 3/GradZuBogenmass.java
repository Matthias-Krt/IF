/**Kapitel 9B Aufgabe 3
 * Zusatz zu Aufgabe 2 aus dem gleichem Kapitel.
 *Grad in Bogenmass umrechnen
 und den Sinus und Cosinus,
 sowie die Summe von Sinus und Cosinus zum Quadrat als Ergebnis ausgeben*/

class GradZuBogenmass {
	public static void main (String[] args) {

		double grad = 30;
		double bogenmass = grad * Math.PI/180;
		double sinx = Math.sin(bogenmass);
		double cosx = Math.cos(bogenmass);
		double ergebnis = sinx*sinx+cosx*cosx;

		System.out.println("Bei " + grad + " in Grad betraegt der Sinus: \t " + sinx);
		System.out.println("Bei " + grad + " in Grad betraegt der Cosinus: \t " + cosx);
		System.out.println("Die Summe vom Sinus und Cosinus zum Quadrat betraegt: "+ ergebnis);
		System.out.println("Sinus: " + sinx + " Cosinus: " + cosx + " Ergebnis: " + ergebnis );

	}
}
