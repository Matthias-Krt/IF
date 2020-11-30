/*Kapitel 71 Aufgabe 1
  Matthias Korte

  Schreiben Sie ein Programm das diese Definition von square Numbers implimentiert.
    square(1) = 1
    square(N) = square(N-1) + 2N - 1

  Schreiben Sie ein vollstaendiges Programm das aehnlich ist zu TriangleTexter.java aus diesem Kapitel.
*/

import java.util.Scanner;

class squareNum{

    int square(int n){
        if(n == 1)
            return 1;
        else
            return square(n-1) + 2*n - 1;
    }
}

class squareTester{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int userInput;

        System.out.print("Input: ");
        userInput = s.nextInt();

        squareNum num = new squareNum();
        int result = num.square(userInput);

        System.out.println("Square Number: " + result);

    }

}
