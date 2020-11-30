/*Kapitel 27 Aufgabe 2
Matthias Korte 

Überprüfen Sie mit der equals() Methode
ob die beiden Point-Objekte äquivalente Daten enthalten.

siehe auch Aufgabe 1*/

import java.awt.*;
import java.util.Scanner;

class AequivalentePointObj{

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

        if(a.equals(b)){
            System.out.println("Die Koordinaten der beiden Punkte sind gleich:");
            System.out.println(a.toString() + " und " + b.toString());
        }else{
            System.out.println("Die Koordinaten der beiden Punkte sind unterschiedlich:");
            System.out.println(a.toString() + " und " + b.toString());
        }

    }
}
