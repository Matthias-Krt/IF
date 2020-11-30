/*Kapitel 72 Aufgabe 1
  Matthias Korte

  Eine Primzahl ist ein integer, der nur durch sich selbst und durch eins dividiert werden kann.
    prime(n)    =   prime(n, n-1)
    prime(n, 1) =   true
    prime(n, D) =   wenn D dividierbar durch n ist, false
                    sonst prime(n, D-1)

  Zum Beispiel:
    prime(4)    =   prime(4,3)
    prime(4,3)  =   prime(4,2)
    prime(4,2)  =   false

  Ein anderes Beispiel:
    prime(3)    =   prime(3,2)
    prime(3,2)  =   prime(3,1)
    prime(3,1)  =   true

  Uebersetzen Sie die Definition in 2 Java Methoden die ein boolean zurueckgeben.
  Nutzen Sie den %-Operator um die dividierbarkeit zu testen.

  Schreiben Sie die Methoden in eine Klasse und schreiben Sie eine Test Klasse.
*/

import java.util.Scanner;

class primeNum{

    boolean prime(int n){
        return prime(n, n-1);
    }

    boolean prime(int n,int D){
        if(D == 1){
            return true;
        }else{
            if(n % D != 0){
                return prime(n, D-1);
            }else{
                return false;
            }
        }
    }
}

class primeTester{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int userInput;

        System.out.print("Input: ");
        userInput = s.nextInt();

        primeNum p = new primeNum();
        boolean resultN = p.prime(userInput);

        System.out.println(userInput + " is a prime number: " + resultN);

    }
}
