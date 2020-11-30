/*Kapitel 21 Aufgabe 2
  Matthias Korte

  Modifizieren Sie das Programm so das es 10 Linien mit 10 "X" ausgibt.
*/

class MoreControlCharacters{

    public static void main(String args[]){

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){
                System.out.print("X");
            }

            System.out.println();
        }

    }
}
