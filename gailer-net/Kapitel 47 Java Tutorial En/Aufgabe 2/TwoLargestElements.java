/*Kapitel 47 Aufgabe 2
  Matthias Korte

  Schreiben Sie ein Programm das die zwei größten Elemente aus einem Array ausgibt.
*/

import java.io.*;

class TwoLargestElements{

    public static void main(String args[]) throws IOException {

        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

        // declare and initialize variables for the two largest
        int Largest = data[0];
        int secLargest = data[1];

        // compute the two largest
        for ( int i = 0; i < data.length; i++){
            if(data[i] > Largest){
                secLargest = Largest;
                Largest = data[i];
            }else if(data[i] > secLargest){
                secLargest = data[i];
            }
        }

        // write out the two largest
        System.out.println("Die zwei groessten Elemente sind: " + Largest + " und " + secLargest);

    }
}
