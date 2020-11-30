/*Ermitteln sie in einer Schleife solange eine ganzzahlige Zufallszahl
  zwischen 1 und 6 bis eine 1 gewuerfelt wurde.
  Geben sie auf der Konsole aus, wieviele Versuche hierzu benötigt wurden.
*/

import java.util.Scanner;

class aufg11{

    public static void main(String args[]){

    int zahl = 0;
    int vers = 0;

    do {
        zahl = (int)(Math.random() * 10) + 4;
        System.out.println(zahl);
        vers++;
    } while (zahl != 4);

    System.out.println("Versuche: " + vers);

    }
}
