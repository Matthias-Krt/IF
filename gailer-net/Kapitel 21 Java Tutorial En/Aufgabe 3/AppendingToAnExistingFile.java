/*Kapitel 21 Aufgabe 3
  Matthias Korte

  Jetzt fuehre das Programm aus Aufgabe 1, 10 mal hintereinander aus.
  Mit dem ersten durchlauf, erstelle die Textdatei. Mit jeder weiteren, fuege die Ausgabe zu der ersten Datei hinzu.
    C:\java AppendingToAnExistingFile.java > output.txt
    C:\java AppendingToAnExistingFile.java >> output.txt
    ...
    C:\java AppendingToAnExistingFile.java > output.txt
*/

class AppendingToAnExistingFile{

    public static void main(String args[]){

        for(int i = 0; i < 10; i++){
            System.out.print("X");
        }
    
    }
}
