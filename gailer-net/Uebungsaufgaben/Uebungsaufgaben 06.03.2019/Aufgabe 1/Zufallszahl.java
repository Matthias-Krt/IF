/*Matthias Korte

  Ermitteln Sie in eriner Schleife solange eine ganzzahlige Zufallszahl
  zwischen 1 und 6, bis eine 1 gewuerfelt wurde.
  Geben Sie auf der Konsole aus, wie viele Versuche hierzu benoetigt wurden.
*/

import java.util.Random;

class Zufallszahl{

    public static void main(String args[]){

        int n;      //gewuerfelte Zahl
        int i = 0;  //Zaehler

        do{

            n = (int) (6 * Math.random()) + 1;
            i++;

        }while(n != 1);

        System.out.println("Versuche: " + i);

    }
}
