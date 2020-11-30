/*Kapitel 51 Aufgabe 1
  Matthias Korte
*/

import java.util.Scanner;

public class KarteTester{

    public static void main(String args[]){

        String name;
        String sex;

        Scanner s = new Scanner(System.in);

        System.out.print("Ihr Name:");
        name = s.nextLine();
        System.out.print("Ihr Geschlecht: (w/m)");
        sex = s.nextLine();

        System.out.println();

        Feiertag feiern = new Feiertag(name, sex);
        feiern.gruss();

        Geburtstag geb = new Geburtstag(name, sex, 21);
        geb.gruss();

        Valentin val = new Valentin(name, sex, 7);
        val.gruss();

    }

}
