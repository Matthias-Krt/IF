/*Uebungsaufgabe
  Matthias Korte

  Schreiben Sie ein Programm das eine BIN-Zahl als Integer einliest
  und zu einem BIN-Wert umrechnet
*/

import java.util.Scanner;

class toDez{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int num;        //eingegebene Zahl
        int digit;      //aktuelle Stelle der Zahl
        int i = 1;      //BIN Wert
        int erg = 0;    //Ergebnis

        System.out.print("BIN zahl:");
        num = s.nextInt();

        //umrechnen von BIN zu DEZ
        while(num > 0){
          digit = num % 10;
          num = num / 10;
          erg += digit * i;
          i *= 2;
        }

        System.out.println("Erg: " + erg);

    }
}
