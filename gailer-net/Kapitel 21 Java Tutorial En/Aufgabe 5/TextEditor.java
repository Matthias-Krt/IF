/*Kapitel 21 Aufgabe 5
  Matthias Korte

  Schreiben Sie ein Programm das den Nutzer nach Text fragt. Nach heder Linie gibt das Programm die Linie im Terminal aus.
  Das Programm ist zu ende wenn der Nutzer "//done" eingibt.
  Leiten Sie die Ausgabe in eine Textdatei um.

  Versuchen Sie mit diesem Texteditor eine kleine Java source Datei zu erstellen.
*/

import java.util.Scanner;

class TextEditor{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        String userInput;
        do {
            userInput = s.nextLine();
            System.out.println(userInput);
        } while (!userInput.equals("//done"));

    }
}
