/*Kapitel 46 Aufgabe 1
  Matthias Korte

  Schreiben Sie ein Prgramm das die Summe
  aller Zahlen in einem Array berechnet.
*/

import java.util.stream.*;

class ArraySum {

  public static void main ( String[] args ) {
    int[] val = {0, 1, 2, 3};

    int sum = 0;    //soll 6 werden

    //sum = IntStream.of(val).sum();

    for(int i = 0; i < val.length; i++){
        sum += val[i];
    }

    System.out.println( "Sum of all numbers = " + sum );

   }
}
