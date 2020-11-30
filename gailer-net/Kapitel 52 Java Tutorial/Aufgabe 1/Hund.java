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

    String kategorie;

    Hund(String n, double fv, int k){
        super(n, fv);
        anzahlTage = fv / FRISST;

        switch (k) {
            case 1:
                kategorie = "Kleinhunde";
                break;
            case 2:
                kategorie = "Mittelgrosse Hunde";
                break;
            case 3:
                kategorie = "Grosse Hunde";
                break;
            default:
                kategorie = "Unbekannt";
        }
    }

    public void spricht(){
        System.out.println("Wuff!");
    }

    public void friss(){
        futtervorrat -= FRISST;
        System.out.println(name + " Futtervorrat: " + futtervorrat);
    }

    public void anzeigen(){
        System.out.println("(Kategorie: " + kategorie + ") " + name + " hat Futter fuer " + anzahlTage + " Tage.");
    }

}
