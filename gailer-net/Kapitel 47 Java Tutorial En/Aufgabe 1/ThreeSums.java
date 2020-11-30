/*Kapitel 47 Aufgabe 1
  Matthias Korte

  Berechnen Sie die Summe aller Elemete des Arrays,
  die Summe der geraden Elemten
  und die Summe der ungeraden Elemten.
  Nehmen Sie an das alle Nummern 0 oder positiv sind. Gerade Integer sind die die n%2 = 0.
*/
import java.io.*;

class ThreeSums{

    public static void main(String args[]) throws IOException{

        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

        int sumAll = 0;
        int sumOdd = 0;
        int sumEven = 0;

        for(int i = 0; i < data.length; i++){
            sumAll += data[i];

            if(data[i]%2 == 0){
                sumEven += data[i];
            }else{
                sumOdd += data[i];
            }
            
        }

        System.out.println("Alle zusammen: " + sumAll + "\nGerade Zahlen: " + sumEven + "\nUngerade Zahlen: " + sumOdd);

    }

}
