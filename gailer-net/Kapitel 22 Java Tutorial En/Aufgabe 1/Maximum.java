/*Kapitel 22 Aufgabe 1
  Matthias Korte

  Schreiben Sie ein Programm das 5 Integer von einer Datei einlist, das Maximum ermittelt und ausgibt.
  Modifizieren Sie dazu das Programm aus dem Kapitel.
*/

import java.util.Scanner;

class Maximum{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int max;
        int fileInput;

        max = s.nextInt();

        for(int i = 0; i < 4; i++){
            fileInput = s.nextInt();

            if(fileInput > max){
                max = fileInput;
            }
        }

        System.out.println("Maximum: " + max);

    }
}
