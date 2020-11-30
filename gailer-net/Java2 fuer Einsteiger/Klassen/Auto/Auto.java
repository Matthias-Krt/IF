/*Matthias Korte
  Erzeugen sie die Klasse Auto die die Eigenschaften Farbe (String), Hubraum(int)
  und Hoechstgeschwindigkeit(double), sowie 2 weitere Eigenschaften nach freier Wahl enthaelt.

  Erzeugen sie hierin die Mehtode fahren, wobei die Methode einmal parameterlos,
  sowie mit einer Doublevariablen zum dierekten setzen der Geschwindigkeit aufgerufen werden kann.
  Als Ausgabe soll die Methode "Das Auto faehrt vorwaerts" bzw.
  "Das Auto faehrt mit x km/h vorwaerts" auf den Bildschirm schreiben.

  Als Konstruktor verwenden sie drei Parametermodelle:
    1. Ohne Parameter
    2. Mit Parameter Farbe
    3. Mit Parameter Farbe und Hubraum

  Testen sie ihre Klasse mit dem Programm AutoTester.java in dem jeweils mindestens
  ein Auto pro Konstruktor erzeugt wird.

  ### Erweiterung 1 ###
  Erweitern sie die Klasse Auto um die Klassenvariabel Anzahl, die alle Auto Objekte zählt.
  Zusaätzlich schreiben sie die Klassenmethode moreAuto(), diese Methode erhöht die Klassenvariabel
  Anzahl um eins.
  Geben sie die Anzahl der Autos in AutoTester ausgeben

  ### Erweiterung 2 ###
  Erweitern sie die Klasse Auto mit unterschiedlichen Sichtbarkeiten und Zugriffsrechten.
  Setzen sie die Variabel "anzahl" private und lassen sie, dise trotzdem anzeigen
*/

public class Auto{

    String color;
    String mfd;

    int ccm;
    int doors;

    double topspeed;

    private static int anzahl;      //#1    #2

    //Konstruktor 1
    public Auto(){
        System.out.println("\nEs wurde ein neues Auto hergestellt.\n");
        moreAuto();
    }

    //Konstruktor 2
    public Auto(String s){
        System.out.println("\nEs wurde ein neues Auto hergestellt.\n");
        this.color = s;
        moreAuto();
    }

    //Konstruktor 3
    public Auto(String s, int var){
        System.out.println("\nEs wurde ein neues Auto hergestellt.\n");
        this.color = s;
        this.ccm = var;
        moreAuto();
    }

    //Mehtoden
    public void fahren(){
        System.out.println("Das Auto faehrt vorwaerts.");
    }

    public void fahren(int x){
        System.out.println("Das Auto faehrt mit " + x + "km/h vorwaerts.");
    }

    //#1
    void moreAuto(){
        anzahl++;
    }

    //#2
    private void aufschliessen(){
        System.out.println("Das Auto wurde aufgeschlossen!");
    }

    protected void autoOeffnen(){
        this.aufschliessen();
    }

    protected static void showAnzahl(){
        System.out.println("Auto-Anzahl: " + anzahl);
    }
}
