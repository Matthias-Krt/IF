/*Kapitel 27 Aufgabe 1
Matthias Korte

Schreiben Sie ein Programm,
das zwei Point-Objekte erzeugt.
Die x- und y-Werte werden vom Anwender eingegeben.
Verwenden Sie für die Ausgabe die toString() Methode der Klasse Point.*/

import java.awt.*;
import java.util.Scanner;

class PointObj{

    public static void main(String[] args){

        int x,y;
        Point a, b;

        Scanner s = new Scanner(System.in);

        System.out.println("Wert x1:");
        x = s.nextInt();
        System.out.println("Wert y1:");
        y = s.nextInt();
        a = new Point(x, y);

        System.out.println("Wert x2:");
        x = s.nextInt();
        System.out.println("Wert y2:");
        y = s.nextInt();
        b = new Point(x, y);

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
