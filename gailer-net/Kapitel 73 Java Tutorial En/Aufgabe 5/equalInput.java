/*Kapitel 73 Aufgabe 5
  Matthias Korte

  Schreiben Sie ein Programm das die equal() Methode aus dem Kapitel testet.
  Fordern Sie den Nutzer auf zwei Strings einzugeben, welche getestet werden sollen.
  Die equal() Methode soll eine static Methode in der Klasse main() sein.

  Eine andere implimentierung: Definieren Sie eine Klasse myString diese enthaelt eine Referenz zu einem String und der Methode equals().
  Ihre main() wird zwei myString Objekte erzeugen und deren equals() Methode nutzen.
*/

//TODO

import java.util.Scanner;

class equalInput{

    boolean equals(String strA, String strB){
        if(strA.length() == 0 && strB.length() == 0){
            return true;
        }else if(strA.length() == 0 && strB.length() != 0){
            return false;
        }else if(strA.length() != 0 && strB.length() == 0){
            return false;
        }else if(strA.charAt(0) != strB.charAt(0)){
            return false;
        }else{
            return equals(strA.substring(1), strB.substring(1));
        }
    }

}

class equalTester{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        String strA, strB;

        System.out.println("Geben Sie den ersten String ein:");
        strA = s.nextLine();

        System.out.println("Geben Sie den zweiten String ein:");
        strB = s.nextLine();

        equalInput obj = new equalInput();
        boolean result = obj.equals(strA, strB);

        System.out.println("\nDie Strings sind gleich: " + result);

    }

}
