/*Kapitel 53 Aufgabe 1
  Matthias Korte

  Eine bessere Kapslung der Klasse Waren und ihrer Subklassen würde alle Instanzvariablen
  als private deklarieren und get- und set-Methoden verwenden, um auf sie zu zugreifen.
  Fuegen Sie eine weitere Instanzvariable anzahl hinzu.

  Hinweis:
    Die Subklassen werden die get- und set-Methoden verwenden muessen,
    um auf die privaten Instanzvariablen zu greifen zu koennen.
 */
class Waren{

    //private Instanzvariablen
    private String beschreibung;
    private double preis;
    private int anzahl;

    //Konstruktor
    Waren(String b, double p, int a){
        beschreibung = b;
        preis = p;
        anzahl = a;
    }

    //Methoden
    void anzeigen(){
        System.out.println("Artikel: " + beschreibung + " Preis: " + preis + " Anzahl: " + anzahl);
    }

    //get- und set-Methoden
    public double getPreis(){
        return this.preis;
    }
    public void setPreis(double p){
        this.preis = p;
    }

    public int getAnzahl(){
        return this.anzahl;
    }
    public void setAnzahl(int az){
        this.anzahl = az;
    }

}
