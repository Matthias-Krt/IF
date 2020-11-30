public class Kaufhaus{

    public static void main(String args[]){

        Waren waren = new Waren("Tube", 1.40, 109);
        Lebensmittel lm = new Lebensmittel("Milch", 0.95, 712, 690);
        Spielwaren spiel = new Spielwaren("Lego", 24.45, 2, 8);
        Buecher buch = new Buecher("Taschenbuch", 9.99, 16, "Annegret");

        //Ausgabe
        System.out.println("\nWaren:");
        waren.anzeigen();
        System.out.println("waren Anzahl: " + waren.getAnzahl());

        System.out.println("\nLebensmittel:");
        lm.anzeigen();
        System.out.println("Kalorien: " + lm.getKalorien());

        System.out.println("\nSpielwaren:");
        spiel.anzeigen();

        System.out.println("\nBuecher:");
        buch.anzeigen();
        buch.setAutor("Karrie");
        System.out.println("Neuer Autor: " + buch.getAutor());

    }

}
