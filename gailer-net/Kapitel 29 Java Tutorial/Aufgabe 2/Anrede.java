/*Kapitel 29 Aufgabe 2
Matthias Korte

Schreiben Sie ein Programm,
das den Anwender nach seinem Namen fragt
und dann den Namen zusammen entweder mit "Ms." oder "Mr." ausgibt,
je nachdem ob der Name weiblich oder männlich ist.
Angenommen, dass die einzigen weiblichen Namen
    Amy
    Buffy
    Cathy
und, dass die einzigen männlichen Namen
    Elroy
    Fred
    Graham
sind.
Alle anderen Namen werden ohne Anrede ausgegeben.
Das Programm setzt seine Schleifendurchläufe solange fort,
bis der Anwender die Eingabe-Taste drückt,
ohne zuerst etwas einzugeben.*/

import java.util.Scanner;

class Anrede{

    public static void main(String[] args){

        String Name;
        boolean w = true;

        Scanner s = new Scanner(System.in);

        while(w == true) {

            System.out.println("Geben Sie einen Namen ein:");
            Name = s.nextLine();

            if(Name.startsWith("Amy") || Name.startsWith("Buffy") || Name.startsWith("Cathy")){             //Amy oder Buffy oder Cathy
                System.out.println("Ms. " + Name);
            }else if(Name.startsWith("Elroy") || Name.startsWith("Fred") || Name.startsWith("Graham")){     //Elroy oder Fred oder Graham
                System.out.println("Mr. " + Name);
            }else if(Name.equals("")) {                                                                     //Keine Eingabe = w = false setzen
                w = false;
            }else{
                System.out.println(Name);                                                                   //wenn kein oberes if-statement stimmt
            }
        }

    }
}
