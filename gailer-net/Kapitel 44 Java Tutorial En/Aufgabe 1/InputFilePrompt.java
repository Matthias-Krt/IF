/*Kapitel 44 Aufgabe 1
  Matthias Korte

  Schreiben Sie eine Klasse mit einer main() Methode
  die den Benutzer nach einem Dateinamen fragt.
  Dieses Programm oeffnet die Datei nicht sondern sammelt nur den Dateinamen.

  Der Dateiname muss im richtigen Format sein.
  Der Dateiname besteht aus zwei Teilen:
  dem Namen und einem Anhang.
  Der Name darf keine Leerzeichen enthalten.
  Die Endung soll ".dat" (fuer "data") sein.
  Das Programm fragt den Benutzer solange nach einem Dateinamen,
  bis dieser alle Anforderungen erfuellt.
*/
import java.util.Scanner;

class InputFilePrompt{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        String userInput;

        boolean w = false, b = false;

        do {

            System.out.print("input file: ");
            userInput = s.nextLine();

            String parts[] = userInput.split(".");

            String fileName = parts[0];
            String fileFormat = parts[1];

            if(fileName.contains(" ")){
                System.out.println(">>>Dateinamen duerfen keine Leerzeichen enthalten<<<");
                w = false;
            }else{
                w = true;
            }

            if(fileFormat.equals("dat")){
                b = true;
            }else{
                System.out.println(">>>Das Format muss .dat sein<<<");
                b = false;
            }

        } while (w == false && b == false);

    }

}
