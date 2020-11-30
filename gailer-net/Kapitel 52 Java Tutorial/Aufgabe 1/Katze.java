/*Kapitel 51 Aufgabe 2
  Matthias Korte

  Die Klasse Katze bekommt eine Instanzvariable haltung (Typ String).
  Es wird zwei Typen geben:
    1. Wohnung
    2. Artgerecht
*/

class Katze extends Haustiere{

    static double FRISST = 0.5;

    String haltung;

    Katze(String n, double fv, int h){
        super(n, fv);
        anzahlTage = fv / FRISST;

        switch (h) {
            case 1:
                haltung = "Wohnung";
                break;
            case 2:
                haltung = "Artgerecht";
                break;
            default:
                haltung = "Unbekannt";
        }
    }

    public void spricht(){
        System.out.println("Miau!");
    }

    public void friss(){
        futtervorrat -= FRISST;
        System.out.println(name + " Futtervorrat: " + futtervorrat);
    }

    public void anzeigen(){
        System.out.println("(Haltung: " + haltung + ") " + name + " hat Futter fuer " + anzahlTage + " Tage.");
    }

}
