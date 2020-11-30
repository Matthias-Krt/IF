/*Schreiben Sie ein Programm, das eine Integerzahl von der Tastatur einliest.
  Lassen sie in einer Schleife die Quersumme dieser Zahl berechnen
  und im Anschluss auf dem Bildschirm ausgeben.

  Als Quersumme(oder Ziffersumme) bezeichnet man ueblicherweise
  die Summe der Zifferwerte einer natürlichen Zahl.
  So ist fuer eine natuerliche Zahl n = 36036 die dezimale Quersumme:
    q(n) = 3+6+0+3+6 = 18
*/

import java.util.Scanner;

class auf9{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int input;  //Zahl
        int qs = 0; //Quersumme
        int digit;  //Ziffer

        System.out.print("Zahl: ");
        input = s.nextInt();

        while(input > 0){
            digit = input % 10; //letzte Ziffer der Zahl bestimmen
            input /= 10;        //letzte Ziffer entfernen
            qs += digit;        //Ziffer zur Quersumme dazu addieren
        }

        System.out.println("Quersumme: " + qs);

    }
}
