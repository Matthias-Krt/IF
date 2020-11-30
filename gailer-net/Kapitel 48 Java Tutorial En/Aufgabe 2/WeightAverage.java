/*Kapitel 48 Aufgabe 2
  Matthias Korte

  Schreiben Sie ein Programm das den durchschnitt berechnet.
*/

import java.io.*;

class AverageOps{

    int average(int[] data){
        int sum = 0;
        int avg;

        //Summe des Arrays
        for(int i = 0; i < data.length; i++){
            sum += data[i];
        }

        //Durchschnitt
        avg = sum / data.length;

        return avg;

    }
}

class WeightAverage{
    public static void main (String args[]){

        int[] val = {98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                     105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                     105, 105, 104, 104, 103, 102, 102, 101, 100, 102};

        AverageOps june = new AverageOps();
        int avg = june.average(val);

        System.out.println("Durchschnitt: " + avg);

    }
}
