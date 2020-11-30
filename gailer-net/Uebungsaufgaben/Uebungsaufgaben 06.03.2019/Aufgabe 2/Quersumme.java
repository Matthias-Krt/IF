/*Matthias Korte

  Schreiben Sie ein Programm, das eine Integerzahl von einer Tastatur einliest.
  Lassen sie in einer Schleife die Quersumme dieser Zahl berechnen
  und im Anschluss auf dem Bildschirm ausgeben.

  Als Quersumme (oder Ziffersumme) bezeichnet man ueblicherweise die Summer der Zifferwerte einer natuerlichen Zahl.
  So ist fuer eine Zahl n = 36037 die dezimale Quersumme:
  q(n) = 3 + 6 + 0 + 3 + 7 = 19
*/

import java.util.Scanner;

class Quersumme{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int input;
        int qsum = 0;

        //Abfrage der Zahl
        System.out.print("Geben Sie eine Zahl ein: ");
        input = s.nextInt();

        System.out.println();

        //eingebene Zahl in ein Array Schreiben
        String temp = Integer.toString(input);
        int[] digits = new int[temp.length()];

        for(int i = 0; i < digits.length; i++){
            digits[i] = temp.charAt(i) - '0';
        }

        //Berechnen der Quersumme
        for(int i = 0; i < digits.length; i++){
            qsum += digits[i];
        }

        /*   ALTERNATIVE
          while(zahl > 0){
            ziffer = zahl % 10;
            zahl = zahl / 10;
            erg += ziffer;
          }
        */

        //Ausgabe
        System.out.println("Quersumme: " + qsum);

    }
}
