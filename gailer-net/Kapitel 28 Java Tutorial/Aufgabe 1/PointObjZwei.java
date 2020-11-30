/*Kapitel 28 Aufgabe 1
Matthias Korte 

Schreiben Sie ein Programm,
das zwei Point-Objekte (pt1 mit den x- und y-Werten 10, 10
und pt2 mit den x- und y-Werten 30, 30) erzeugt.

Die Point-Objekte repräsentieren die Eckpunkte eines Rechtecks.
Berechnen Sie die Fläche dieses Rechtecks.
Verwenden Sie zum Ermitteln der Breite und Höhe die Klassenmethode abs() der Klasse Math.

Die Ausgabe des Programms sieht folgendermaßen aus.
    Die Flaeche ebtraegt: 400*/

import java.awt.*;

class PointObjZwei{

    public static void main(String[] args){

        Point pt1, pt2;

        pt1 = new Point(10, 10);
        pt2 = new Point(30, 30);

        System.out.println("Die Flaeche betraegt: " + Math.abs((pt1.x-pt2.x)*(pt1.y - pt2.y)));

    }
}
