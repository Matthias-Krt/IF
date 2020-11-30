/*Kapitel 29 Aufgabe 3
Matthias Korte

Schreiben Sie ein Programm,
das den Anwender nach dem Vornamen und Nachnamen fragt.
Dann den Vornamen, so wie er eingegeben wurde, ausgibt
und den Nachnamen in Großbuchstaben ausgibt.*/

import java.util.Scanner;

class EchoName{

    public static void main(String[] args){

        String Name;

        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie ihren Namen ein:");
        Name = s.nextLine();

        String[] Nachname = Name.split(" ");            //String Name beim Leerzeichen "splitten"
        System.out.println(Nachname[1].toUpperCase());  //Den 2 Teil des "gesplitteten" Teils groß schreiben und ausgeben

    }
}
