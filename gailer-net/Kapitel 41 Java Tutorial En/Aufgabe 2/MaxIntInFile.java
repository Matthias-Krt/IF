/*Kapitel 41 Aufgabe 2
  Matthias Korte

  Schreiben Sie ein Programm das 5 Integer aus einer Datei, vergleicht und deren Maximum  ausgibt.
  Machen Sie dies indem Sie das Summen-Programm aus dem Kapitel bearbeiten.
  Fügen Sie eine neue Int Variable, mit dem Namen max hinzu.
  Initialisieren Sie diese mit dem ersten Wert in der Datei.
*/

//TODO: Datei einlesen und Max bestimmen

class MaxIntInFile{

    public static void main(String args[]){

        int sum = 0;
        int max;

        for(int i = 0; i <= 5; i++){
            sum += i;
            System.out.print(i + " ");
        }

        System.out.println("\nSum: " + sum);

    }
}
