/*do while Uebungsaufgabe
  Matthias Korte

  Programmieren Sie eine schleife, die alle durch 3 teilbaren
  Ganzzahlen zwischen 10 und 40 zur Standardausgabe ausgibt.

  Benutzen Sie hierfuer eine do while Schleife.

  Die Ausgabe soll etwa so aussehen:
  12 15 18 21 24 27 30 33 36 39
*/

import java.util.Scanner;

class doWhileUebung{

    public static void main(String args[]){

        int teiler = 3; //teiler
        int i = 10;     //Startwert
        int j = 40;     //Endwert

        do {
            if(i%teiler == 0){
                System.out.print(" " + i);
            }
            i++;
        } while (i <= j);

        System.out.println();

    }
}
