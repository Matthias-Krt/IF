/*Kapitel 26 Aufgabe 2
Matthias Korte 

Schreiben Sie ein Programm,
das den Anwender auffordert 5 Integer einzugeben.
Das Programm wird den Anwender fünfmal auffordern eine Zahl einzugeben.
Danach wird es die Summe berechnen und ausgeben.

Die Ausgabe des Programms sieht dann ungefähr folgendermaßen aus:
    Geben Sie 1. Zahl ein:
    11
    Geben Sie 2. Zahl ein:
    4
    Geben Sie 3. Zahl ein:
    5
    Geben Sie 4. Zahl ein:
    1
    Geben Sie 5. Zahl ein:
    9
    Gesamtsumme: 30

Verändern Sie dann das Programm,
so dass es am Anfang den Anwender fragt,
ob er eine Eingabeaufforderung wünscht.
Der Anwender gibt "ja" oder "nein" ein (nur einmal, am Anfang).
Die Schleife wird jetzt entweder eine Eingabeauforderung ausgeben oder nicht.

Deklarieren Sie eine weitere Stringvariable antwort
und weisen Sie ihr das Stringliteral "ja" zu.
Vergleichen Sie dann mit der equals() Methode
ob der vom Anwender eingegebene String äquivalent zur Stringvariablen antwort ist.
Setzen Sie eine boolesche Variable auf true oder false,
je nach dem was der Anwender eingegeben hat.
Innerhalb der Schleife bestimmt dann eine if-Anweisung
ob die Eingabeaufforderung ausgegeben wird oder nicht.

Die Ausgabe des Programms sieht dann ungefähr folgendermaßen aus:
    Eingabeaufforderung <ja> oder <nein>?
    nein
    3
    5
    2
    12
    8
    Gesamtsumme: 30*/

import java.util.Scanner;

class equals{

    public static void main(String[] args){

        int x, Summe = 0;
        int i = 1;
        String ja = "ja", Input;

        boolean w = false;

        Scanner s = new Scanner(System.in);


        System.out.println("Eingabeaufforderung <ja> oder <nein>?");
        Input = s.nextLine();

        if(ja.equals(Input)){
            w = true;
        }else{
            w = false;
        }

        while(i<=5){

            if(w==true){
                System.out.println("Geben Sie die " + i + ". Zahl ein:");
            }

            x = s.nextInt();
            Summe += x;			//addiert x
            i++;				//Index +1

        }

        System.out.println("Gesamtsumme: " + Summe);

    }
}
