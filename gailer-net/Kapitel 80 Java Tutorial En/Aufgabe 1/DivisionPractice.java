/*Kapitel 80 Aufgabe 1
  Matthias Korte

  Bearbeiten Sie das DivisionPractice Programm aus dem Kapitel.
    1.  Schreiben Sie eine Loop-Funktion so das der Nutzer immer wieder
        fuer den zaehler und teiler gefragt wird.
        Bei jeder Eingabe von Daten gibt das Programm das Ergeniss aus
        oder eine informative Error-Nachricht, wenn es ein Problem gibt
        (Divison durch 0 oder ein falscher Input).
    2.  Das Programm soll fortfahren, wenn es ein Problem gibt.
    3.  Der Loop wird verlassen, wenn der Nutzer beim zaheler eine Eingabe
        mit einem "q" oder "Q" anfaengt.
        Dann soll keine Error-Nachricht ausgegeben werden.
    4.  Frage nicht nach dem Teiler, wenn der Nutzer verlassen moechte.
*/

import java.util.Scanner;

class DivisionPractice{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        String unserInput;
        int num, div;

        boolean isQInput = true;

        do {
            try {
                System.out.print("Enter the numerator: ");
                unserInput = s.nextLine();

                //Test if the user wants to leave
                if(unserInput.toUpperCase().charAt(0) == 'Q'){
                    break;
                }

                num = Integer.parseInt(unserInput); //convert String to Integer

                System.out.print("Enter the divisor: ");
                unserInput = s.nextLine();

                div = Integer.parseInt(unserInput); //convert String to Integer

                //Output
                System.out.println(num + " / " + div + " is " + (num/div) + " rem " + (num % div) + "\n");

            } catch(Exception e) {
                isQInput = false;
                System.out.println("\nOh no something went wrong!");
                System.out.println(e);
            }
        } while (isQInput);

        System.out.println("\nGood-bye");

    }

}
