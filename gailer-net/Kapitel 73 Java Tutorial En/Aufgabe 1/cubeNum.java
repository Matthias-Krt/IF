/*Kapitel 73 Aufgabe 1
  Matthias Korte

  Schreiben Sie ein Programm das diese Definition von kubischen Nummern implimentiert:
    cube(1) =   1
    cube(n) =   cube(n-1) + 3*(square(n)) - 3*n + 1

  Implimentiert sie die square() Methode aus dem vorherigen Kapitel
*/

import java.util.Scanner;

class cubeNum{

    int cube(int n){
        if(n == 1){
            return 1;
        }else{
            return cube(n-1) + 3*(square(n)) - 3*n + 1;
        }
    }

    int square(int n){
        if(n == 1){
            return 1;
        }else{
            return square(n-1) + 2*n - 1;
        }
    }

}

class cubeTester{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int userInput;

        cubeNum cn = new cubeNum();
        int result;

        System.out.print("Input: ");
        userInput = s.nextInt();

        result = cn.cube(userInput);
        System.out.println("Result: " + result);

    }
}
