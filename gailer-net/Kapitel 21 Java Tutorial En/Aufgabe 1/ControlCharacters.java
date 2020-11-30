/*Kapitel 21 Aufgabe 1
  Matthias Korte

  Schreiben Sie ein Programm das zehn mal x ausgibt. Benutzen Sie file redirection um die Ausgabe
  in einer Textdatei zu speichern.
  Benutzen Sie den DIR Befehl um zu sehen, wie gross die Datei ist. Je nachdem,
  welches Betriebssystem Sie benutzen wird die Datei groesser als 10 byte sein.
    C:\java ControlCharacters > output.txt
    C:\dir output.txt
*/

class ControlCharacters{

    public static void main(String args[]){

        for(int i = 0; i < 10; i++){
            System.out.print("X");
        }

    }
}
