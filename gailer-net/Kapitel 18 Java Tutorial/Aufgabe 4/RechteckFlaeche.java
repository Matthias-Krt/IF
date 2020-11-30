/*Kapitel 18 Aufgabe 4
 *Matthias Korte
 *
 *Es wird vorausgesetzt, dass die Seiten der Rechtecke parallel zur X und Y Achse verlaufen.
 *Die Koordinaten eines jeden Eckpunkts werden als Paar von Ganzzahlen eingegeben,
 *zuerst die X-Koordinate
 *und dann die Y-Koordinate.
 *Der Urprung des Koordinatensystems (0,0) ist die linke obere Ecke,
 *so dass Y abwaerts zunimmt und X nach rechts zunimmt.
 *
 *Das Programm berechnet fuer jedes Rechteck
 *die Hoehe,
 *die Breite
 *und die Flaeche.
 *Die zwei eingegebenen Eckpunkte muessen sich diagonal gegenueber liegen
    (links oben und rechts unten, oder rechts oben und links unten),
 *aber welche Wahl fuer jedes Rechteck getroffen wird, ist Sache des Anwenders.
 *Der Anwender kann die Eckpunkte in beliebiger Reihenfolge eingeben.
 *Hoehe und Breite sind immer positive (das Programm wird seine Berechnungen anpassen muessen, damit das wahr ist.)
 *
 *Das Programm wird beendet, wenn der Anwender Eckpunkte eingibt,
 *die nicht die eines Rechtecks sein koennen (entweder die Hoehe ist 0, die Breite ist 0 oder beide.)*/

 import java.util.Scanner;

 class RechteckFlaeche{

 	public static void main(String[] args){

 		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;	//x1 = erste X-Koordinate, x2 = zweite X-Koordinate, y1 = erste Y-Koordinate, y2 = zweite Y-Koordinate
 		int DeltaX, DeltaY;					//x2 - x1, y2 - y2
 		int h, b;							//h = Hoehe, b = Breite
 		double A;							//Flaeche

 		boolean w = false, v = true;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Sie muessen 2 Koordinatenpunkte, bestehend aus: X und Y -Koordinate, eingeben. Diese muessen sich Diagonal gegenueber liegen(Rechts Oben und Links unten oder Links Oben und Rechts unten)");
 		System.out.println("Wenn Sie 0 als Koordinate eingeben, startet das Programm von vorn");

		while(v == true){

	 		while(w == false){

				System.out.println("Geben Sie die Koordinaten ein:");

		 		//erste Koordinate
		 		System.out.println("Geben Sie die erste X-Koordinate ein:");
		 		x1 = s.nextInt();
		 		System.out.println("Geben Sie die erste Y-Koordinate ein:");
		 		y1 = s.nextInt();

		 		//zweite Koordinate
		 		System.out.println("Geben Sie die zweite X-Koordinate ein:");
		 		x2 = s.nextInt();
		 		System.out.println("Geben Sie die zweite Y-Koordinate ein:");
		 		y2 = s.nextInt();

	 		}

	 		//DeltaX und DeltaY berechnen
	 		DeltaX = x2 - x1;
	 		DeltaY = y2 - y1;

	 		//Delta zu positiven Zahlen umwandeln (falls negativ)
			if(DeltaX < 0){
				DeltaX = DeltaX * (-1);
			}

			if(DeltaY < 0){
				DeltaY = DeltaY * (-1);
			}

			//Hoehe und Breite initialisieren
			h = DeltaY;
			b = DeltaX;

			//Flaeche berechnen
			A = h * b;

            if(h == 0 || b == 0){
                w = false;
            }else{
                w = true;
            }

			//Ausgabe
			System.out.println("Die Hoehe betraegt: " + h + ", die Breite betraegt: " + b + " und die Flaeche betraegt: " + A);

		}

 	}
 }
