/*Kapitel 49 Teil C Aufgabe 1
  Matthias Korte

  Vervollstaendigen Sie das folgende Programm so das es die Summe aller Elemte des Arrays berechnet.
  Schreiben Sie das Programm so das es funktioniert auch wenn sich die Dimensionen der Reihen und Zeilen aendern.
  Mit anderen Worten, benutze besser length als hard-coded Nummern.
*/

import java.io.*;

class ArraySum{

    public static void main(String args[]) throws IOException{

        int sum = 0;

        int[] data = { {3, 2, 5},
                    {1, 4, 4, 8, 13},
                    {9, 1, 0, 2},
                    {0, 2, 6, 3, -1, -8} };

        //compute the sum
        for(int row = 0; row < data.length; row++){
            for(int col = 0; col < data[row].length; col++){
                sum += data[row][col];
            }
        }

        //write out the sum
        System.out.println("Summe: " + sum);

    }
}
