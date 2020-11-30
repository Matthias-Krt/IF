/*Kapitel 51 Aufgabe 2
  Matthias Korte

  Die Klasse Hund bekommt zusätzlich eine Instanzvariable kategorie (Typ String).
  Es wird 3 Kategorien geben:
    1. Kleinhunde
    2. Mittelgrosse Hunde
    3. Grosse Hunde
*/

class Hund extends Haustiere{

    static double FRISST = 1;

    Hund(String n, double fv){
        super(n, fv);
        anzahlTage = fv / FRISST;
    }

    public void spricht(){
        System.out.println("Wuff!");
    }

    public void friss(){
        futtervorrat -= FRISST;
        System.out.println(name + " Futtervorrat: " + futtervorrat);
    }

    public void anzeigen(){
        System.out.println(name + " hat Futter fuer " + anzahlTage + " Tage.");
    }

}
