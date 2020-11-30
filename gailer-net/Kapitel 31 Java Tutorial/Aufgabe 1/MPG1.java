/*Kapitel 31 Aufgabe 1
Matthias Korte

Aendern Sie das Programm aus dem Kapitel 31 so das:
    boolean benzinschwein()
ergibt true, wenn die Meilen pro Gallone weniger als 15.0 ergeben.
    boolean sparauto()
ergibt true, wenn die Meilen pro Gallone mehr als 30.0 ergeben.

Der Konstruktor und die berechneMPG() Methode bleiben unverändert.
Jede von diesen neuen Methoden sollte berechneMPG() verwenden,
um die Meilen pro Gallone zu bekommen,
und sie nicht selbst berechnen.
Eine if-else-Anweisung waehlt den korrekten booleschen Rueckgabewert aus.

Stellen Sie die Benutzer-Interaktionen in die main() Methode,
so dass der Benutzer Werte fuer jedes Auto eingibt.
Die main() Methode verwendet die zusätzlichen Methoden,
um an den Anwender eine Meldung auszugeben,
ob das Auto ein Benzinschwein oder ein Sparauto ist.

Sie koennten in Versuchung geraten einen dieser Ueblichen Designfehler zu begehen:

Meilen pro Gallone in einer Instanzvariablen des Objekts zu speichern,
zusammen mit startMeilen, endMeilen und gallonen.
Das erscheint fast logisch, aber es ist schlechtes Design.
Bewahren Sie keine permanente Kopie eines Wertes auf,
der sich mit Leichtigkeit aus den Daten berechnen laesst.
Der Grund dafuer ist, dass es dem Objekt Komplexitaet hinzugefuegt, aber nur einen geringen Vorteil bringt.
Die Meilen pro Gallone direkt in den neuen Methoden berechnen.
Es ist normalerweise am Besten eine bestimmte Berechnung
nur in einer Methode durchzufuehren
und sie immer zu verwenden, wenn die Berechnung gebraucht wird.
Wenn jetzt in der Berechnung ein Fehler ist
oder die Berechnung geaendert werden muss,
muss nur an einer Stelle nachgesehen werden.
*/

import java.util.Scanner;

class MeilenProGallone {

  public static void main( String[] args ) {

    Auto auto = new Auto( 32456, 32810, 10.6 );		//startTacho, endTacho, galls

    System.out.println( "Meilen pro Gallonen: " + auto.berechneMPG() );

  }
}

public class Auto {
  // Instanzvariablen
  double startMeilen;   // Anfangsstand Tachometer
  double endMeilen;     // Endstand Tachometer
  double gallonen;      // verbrauchte Gallonen Benzin

  // Konstruktor
  Auto(  double startTacho, double endTacho, double galls  ) {
    startMeilen = startTacho;
    endMeilen   = endTacho;
    gallonen    = galls;
  }

  // Methoden
  double berechneMPG() {
    return (endMeilen - startMeilen) / gallonen ;
  }

}
