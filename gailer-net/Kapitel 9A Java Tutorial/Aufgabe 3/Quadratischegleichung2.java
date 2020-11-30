//Kapitel 9A Aufgabe 3 Erneute Wertzuweisung an Variable

class Quadratischegleichung {
	public static void main (String[] args) {
		double x = 4;
		double Erg;
		
		Erg = 3 * x * x - 8 * x + 4;
		
		System.out.println("Bei x = " + x + " ergibt die Quadratischegleichung den Wert: " + Erg);
		
		//x einen neuen Wert zuweisen
		x = 8;
		
		Erg = 3 * x * x - 8 * x + 4;
		
		System.out.println("Bei x = " + x + " ergibt die Quadratischegleichung den Wert: " + Erg); 
		
		//x einen neuen Wert zuweisen	
		x = 100;
			
		Erg = 3 * x * x - 8 * x + 4;
		
		System.out.println("Bei x = " + x + " ergibt die Quadratischegleichung den Wert: " + Erg);
	}
}