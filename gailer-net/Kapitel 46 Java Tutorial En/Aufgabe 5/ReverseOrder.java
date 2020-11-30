/*Kapitel 46 Aufgabe 5
  Matthias Korte

  Schreiben Sie ein Programm das die Werte in val in umgekehrter Reihenfolge
  in den selben Array schreibt.
  Fuer dieses Programm bnoetigen Sie die Variable temp.
*/

class ReverseOrder{

    public static void main(String args[]){

        int[] val = {0, 1, 2, 3};
        int temp;

        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        // reverse the order of the numbers in the array
        for(int i = 0; i <= val.length / 2; i++){
            temp = val[i];                  //temp = val[an der Stelle i]
            val[i] = val[val.length -i -1]; //val[an der Stelle i] (gelich wie temp) = val[an der Stelle val-laenge - i -1]
            val[val.length -i -1] = temp;   //val[an der Stelle val-laenge -i -1] (gerade an die Stelle val[i] geschrieben) = temp
        }

        System.out.println( "Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

    }
}
