/*Kapitel 28 Aufgabe 2
Matthias Korte

Kopieren Sie die Referenz von pt1 in eine Referenzvariable ptAlias.
Ueberpruefen Sie anschliessend mit dem == -Operator
ob die Referenzvariablen pt1 und ptAlias auf dasselbe Objekt verweisen.
    Geben Sie die x- und y-Werte des Point-Objekts aus, auf das die Referenzvariablen pt1 und ptAlias verweisen.
    Verdoppeln Sie dann die x- und y-Werte des Point-Objekts auf das ptAlias verweist.
    Verwenden Sie dazu NICHT die move() Methode.
    Geben Sie erneut die x- und y-Werte des Point-Objekts aus,
    auf das die Referenzvariablen pt1 und ptAlias verweisen.

Die Ausgabe des Programms sieht dann folgendermaßen aus:
    pt1 und ptAlias verweisen auf dasselbe Objekt!

    Point pt1 vorher:      java.awt.Point[x=10,y=10]
    Point ptAlias vorher:  java.awt.Point[x=10,y=10]

    Nur von ptAlias wurden die x- und y-Werte verdoppelt!

    Point pt1 nachher:      java.awt.Point[x=20,y=20]
    Point ptAlias nachher:  java.awt.Point[x=20,y=20]*/

import java.awt.*;

class dasselbePointObj{

    public static void main(String[] args){

        Point pt1, ptAlias;

        pt1 = new Point(10, 10);
        ptAlias = pt1;

        if(pt1 == ptAlias){
            System.out.println("pt1 und ptAlias verweisen auf dasselbe Objekt!");
            System.out.println();
        }

        System.out.println("Point pt1 vorher: \t \t \t" + pt1.toString());
        System.out.println("Point ptAlias vorher: \t \t" + ptAlias.toString());
        System.out.println();

        ptAlias.translate(pt1.x, pt1.y);

        System.out.println("Nur von ptAlias wurden die x- und y-Werte verdoppelt!");
        System.out.println();
        System.out.println("Point pt1 nachher: \t \t \t" + pt1.toString());
        System.out.println("Point ptAlias nachher: \t \t" + ptAlias.toString());

    }
}
