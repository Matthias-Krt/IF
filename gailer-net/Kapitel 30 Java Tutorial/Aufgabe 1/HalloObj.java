/*Kapitel 30 Aufgabe 1
Matthias Korte 

Veraendern Sie das Programm aus Kapitel 30,
so dass ein HalloObjekt-Objekt eine Mitteilung so oft ausgibt
wie die Mitteilung Zeichen hat.
Die HalloObjekt-Klasse wird einen Konstruktor haben,
der es der Methode main() erlaubt das Objekt
mit unterschiedlichen Mitteilungen zu initialisieren.*/

import java.util.Scanner;

class HalloObj{

    public static void main(String[] args) {

        String Input;

        int i = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie ihre Nachricht ein:");
        Input = s.nextLine();

        HalloObjekt obj = new HalloObjekt(Input);

        System.out.println();

        //so oft ausführen wie der String Input lang ist
        while(i < Input.length()) {
            obj.sprich();
            i++;
        }

    }
}

class HalloObjekt {

    String msg;

    //msg Eingabe aus main zuweisen
    HalloObjekt(String str) {
        msg = str;
    }

    void sprich(){
        System.out.println(msg);
    }
}
