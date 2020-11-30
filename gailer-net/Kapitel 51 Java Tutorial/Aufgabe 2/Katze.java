/*Kapitel 51 Aufgabe 2
  Matthias Korte

  Die Klasse Katze bekommt eine Instanzvariable haltung (Typ String).
  Es wird zwei Typen geben:
    1. Wohnung
    2. Artgerecht
*/

class Katze extends Haustiere{

    static double FRISST = 0.5;

    Katze(String n, double fv){
        super(n, fv);
        anzahlTage = fv / FRISST;
    }

    public void spricht(){
        System.out.println("Miau!");
    }

    public void friss(){
        futtervorrat -= FRISST;
        System.out.println(name + " Futtervorrat: " + futtervorrat);
    }

    public void anzeigen(){
        System.out.println(name + " hat Futter fuer " + anzahlTage + " Tage.");
    }

}
