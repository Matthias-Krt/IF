/*Kapitel 29 Aufgabe 1
Matthias Korte

Schreiben Sie ein Programm
in dem der Anwender einen String eingibt
und das Programm ihn ein Zeichen pro Zeile auf den Bildschirm ausgibt:
    Geben Sie einen String ein:
    OCTOPUS

    O
    c
    t
    O
    P
    U
    S

Sie verwenden dafür die folgende Methode der Klasse String brauchen:
    public char charAt(int index)
Diese Methode gibt das Zeichen zurück,
das sich an der Stelle index des String befindet*/

import java.util.Scanner;

class charAt{

    public static void main(String[] args){

        int i = 0;
        String Input;

        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie einen String ein:");
        Input = s.nextLine();

        System.out.println();

        while(i < Input.length()){
            System.out.println(Input.charAt(i));
            i++;
        }
    }
}
