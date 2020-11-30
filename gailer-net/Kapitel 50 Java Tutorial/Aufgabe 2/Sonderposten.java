/*Kapitel 50 Aufgabe 2
  Matthias Korte

  Leiten Sie eine Klasse Sonderposten von der Klasse ab.
  Die Subklasse erweitert die Superklasse, um die Instanzvariablen rabatt.

  Erstellen Sie unter Verwendung des Konstruktors der Superklasse einen Konstruktor,
  der die Objekte der Subklasse initalisiert.
  Die Initiasierung der Instanzvariablen rabatt wird vom Konstruktor je nach Lagerzeituebernommen.
  Bei einer Lagerzeit groesser 12 Monate wird ein Rabatt auf dem Verkaufspreis von 30 Prozent gewaehrt.
  Anderenfalls betraegt der Rabatt 10 Prozent.

  Schreiben Sie eine Methode anzeigen() fuer die Subklasse, die die anzeigen() Methode der Superklasse ueberschreibt.

  Schreiben Sie eine Methode berechneVerkaufspreis(), die ebenfalls die Methode der Superklasse ueberschreibt.
*/

class Sonderposten extends Artikel{

    double rabatt;

    Sonderposten(String nr, String bz, double einkaufsprs, int lagert){
        super(nr, bz, einkaufsprs, lagert);

        if(lagert > 12){
            rabatt = 0.30;  //30%
        }else{
            rabatt = 0.10;  //10%
        }
    }

    public void anzeigen(){
        System.out.println("\nSonderposten:\n" + artikelNr + "\t" + bezeichnung + "\t EK:" + einkaufspreis + "\t Rabatt:" + rabatt * 100 + "%" + "\t VK:" + berechneVerkaufspreis(einkaufspreis, rabatt) + " Euro \t Lagerzeit: " + lagerzeit + " Monate");
    }

    public int berechneVerkaufspreis(double einkaufsprs, double rbtt){
        einkaufspreis = einkaufsprs;
        rabatt = rbtt;

        einkaufspreis += (einkaufspreis * HANDELSSPANNE);
        einkaufspreis -= einkaufspreis * rabatt;
        einkaufspreis += einkaufspreis * MWST;
        
        return (int) Math.round(einkaufspreis);
    }

}
