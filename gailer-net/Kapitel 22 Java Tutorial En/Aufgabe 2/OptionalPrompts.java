/*Kapitel 22 Aufgabe 2
  Matthias Korte

  Modifizieren Sie das Programm so, dass es nach 5 Integern den Nutzer fragt ob es weitere Zahlen gibt.
  Der Nutzer gibt "ja" oder "nein" ein.
*/

//TODO

import java.util.Scanner;

class OptinalPrompts{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int max;
        int fileInput;

        String userInput;

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
