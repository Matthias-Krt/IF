/*Kapitel 47 Aufgabe 3
  Matthias Korte

  Vervollstaendigen Sie das folgende Programm so,
  dass es die Werte von data in umgekehrter Reihenfolge ausgibt.
*/

import java.io.* ;

class ReversalElements{

  public static void main ( String[] args ) throws IOException{

    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13};

    /*Alternative:
    for(int i = data.length -1; i > 0; i--){
        System.out.prin(data[i] + " ");
    }
    */

    int temp;

    // reverse the data
    for ( int i = 0; i < data.length / 2; i++){
        temp = data[i];                     //temp = val[an der Stelle i]
        data[i] = data[data.length -i -1]; //val[an der Stelle i] (gelich wie temp) = val[an der Stelle val-laenge - i -1]
        data[data.length -i -1] = temp;   //val[an der Stelle val-laenge -i -1] (gerade an die Stelle val[i] geschrieben) = temp
    }

    // write out the new data
    for (int i = 0; i < data.length; i++){
        System.out.print(data[i] + " ");
    }

  }
}
