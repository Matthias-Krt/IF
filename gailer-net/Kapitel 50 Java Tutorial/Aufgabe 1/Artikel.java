/*Kapitel 50 Aufgabe 1
  Matthias Korte

  Erstellen Sie eine Klasse Artikel mit den Instanzvariablen:
  artikelNr, bezeichnung, einkaufspreis und lagerzeit(Monate).
  Deklarieren Sie zwei Konstanten:
    final double HANDELSSPANNE = 0.6;   //60 Prozent des Einkaufspreises
    final double MWST = 0.19;           //19 Prozent

  Erstellen Sie einen Konstruktor, der die Artikelobjekte initalisiert (alle Instanzvariablen).

  Schreiben Sie eine oeffentliche anzeigen() Methode, die die Artikelinformationen ausgibt
  und eine oeffentliche Methode zum Berechenen des Verkaufspreises:
    public int berechneVerkaufspreis()
  Der Verkaufspreis ergibt sich aus der Summe von Einkaufspreis und Handelsspanne zuzueglich Mehrwertsteuer.
  Das Ergebnis wird auf eine ganze Zahl abgerundet.
*/

class Artikel{

    String artikelNr;
    String bezeichnung;
    double einkaufspreis;
    int lagerzeit;

    final double HANDELSSPANNE = 0.6;
    final double MWST = 0.19;

    Artikel(String nr, String bz, double einkaufsprs, int lagert){
        artikelNr = nr;
        bezeichnung = bz;
        einkaufspreis = einkaufsprs;
        lagerzeit = lagert;
    }

    public void anzeigen(){
        System.out.println(artikelNr + "\t" + bezeichnung + "\t EK:" + einkaufspreis + "\t VK:" + berechneVerkaufspreis(einkaufspreis) + " Euro \t Lagerzeit: " + lagerzeit + " Monate");
    }

    public int berechneVerkaufspreis(double einkaufsprs){
        einkaufspreis = einkaufsprs;
        einkaufspreis += (einkaufspreis * HANDELSSPANNE);
        einkaufspreis += einkaufspreis * MWST;
        return (int) Math.round(einkaufspreis);
    }

}
