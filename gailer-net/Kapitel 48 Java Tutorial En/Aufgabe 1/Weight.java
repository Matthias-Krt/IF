/*Kapitel 48 Aufgabe 1
  Matthias Korte

  Schreiben Sie ein Programm das den Array data konstruiert
  und dann die Daten vom Parameter Array in data kopiert.

  Schreiben Sie die print() Methode so,
  das es 7 Werte pro Zeile ausgibt,
  ausgenommen der letzten Zeile.
*/

import java.io.*;

class Weight{

    int[] data;

    //Constructor
    Weight(int[] init){
        //Construct the array the same length as that referenced by init.
        data = new int[init.length];

        //copy values from the input data to data.
        for(int j = 0; j < data.length; j++){
            data[j] = init[j];
        }
    }

    //TODO: Test
    //Print
    void print(){
        for(int j = 0; j < data.length; j++){
            if(data.length - (j+1) >= 7){
                //prints out if there are more than 7 elements remain in the Array data
                for(int i = 0; i < 7; i++, j++){
                    System.out.print(data[j] + "[" + j + "] ");
                }
                System.out.println();
            }else{
                System.out.print(data[j] + "[" + j + "] ");
            }
        }
    }

    public static void main(String args[]){

        int[] values = {98,  99,  98,  99, 100, 101, 102, 100, 104, 105, 105, 106, 105, 103,
                        104, 103, 105, 106, 107, 106, 105, 105, 104, 104, 103, 102, 102, 101,
                        100, 102};

        Weight june = new Weight(values);
        june.print();
    }
}
