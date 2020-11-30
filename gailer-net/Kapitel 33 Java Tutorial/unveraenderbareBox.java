/*Kapitel 33 Aufgabe 1
Matthias Korte

Implementieren Sie eine Klasse Box, ähnlich wie in der vorherigen Testaufgabe.
Aber die neue Implementierung von Box wird eine bessere Kapselung haben.
Hier ist die Dokumentation für Box:
    class Box
     Eine Klasse, die eine Box implementiert.

    Konstruktoren
     Box(double breite, double hoehe, double laenge)
     Box(double seite)

    Methoden
     double berechne Volumen()
     double berechneFlaeche()
Verwenden Sie als Ausgangsbasis das Beispiel des vorherigen Tests,
das für diese und die nächsten Übungen leicht modifiziert werden kann.

Deklarieren Sie in der jetzigen Implementierung von Box alle Instanzvariablen als private.
Das bedeutet, dass nur die Methoden eines Box-Objekts dessen Objektdaten sehen können.
Das Objekt wird unveränderbar sein, wenn es keine Zugriffsmethoden gibt, die die Daten ändern.
Ein unveränderbares Objekt ist ein Objekt,
dessen Daten sich nicht ändern.
Sie erinnern sich vielleicht, dass Stringobjekte unveränderbar sind
— sobald die Zeichen des Strings mit dem Konstruktor gesetzt worden sind,
werden sie sich niemals ändern (obwohl sie für die Erzeugung anderer Stringobjekte verwendet werden können.)
Es gibt viele Vorteile in der Verwendung unveränderbarer Objekte,
besonders in der Programmierung mit Threads (mit Threads werden fast alle umfangreichen Programme geschrieben).
*/

class unveraenderbareBox {

  public static void main( String[] args ) {

    Auto auto = new Auto( 32456, 32810, 10.6 );		//startTacho, endTacho, galls

    System.out.println( "Meilen pro Gallonen: " + auto.berechneMPG() );

  }
}

public class Box {
  // Instanzvariablen
  double breite;
  double hoehe;
  double laenge;
  double seite;

  // Konstruktor
  Box(  double breite, double hoehe, double laenge, double seite  ) {
    breite = breite;
    hoehe = hoehe;
    laenge = laenge;
    seite = seite;
  }

  // Methoden
  double berechneMPG() {
    return (endMeilen - startMeilen) / gallonen ;
  }

}
