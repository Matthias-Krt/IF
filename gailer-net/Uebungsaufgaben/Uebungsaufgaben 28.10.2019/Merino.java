/*Matthias Korte
  Erstellen Sie die Klasse Merino, die von der Klasse Meerschweinchen erbt.
  Erweitern Sie die Klasse um die Instanzvariablen haarlaenge als double und scheu als
  boolean.
  Die Klasse Merino soll auch Konstruktoren wie Meerschweinchen erhalten. Erweitern Sie
  die Klasse um diese Konstruktoren.
  Testen Sie die Klasse Merino in der Klasse Zoohandlung. Erstellen Sie hierin drei Me-
  rinoobjekte mit Hilfe der drei Konstruktoren. Lassen Sie die Anzahl der Merinos auf
  dem Bildschirm ausgeben. Benutzen Sie alle Methoden der Klasse Merino in der Klasse
  Zoohandlung mindestes einmal.
*/
 public class Merino extends Meerschweinchen{

    //Instanzvariablen
    double haarlaenge;
    boolean scheu;

    //Klassenvariablen
    static int MerinoAnzahl;

    //Methoden
    public void zaehmen(){
        this.scheu = false;
        System.out.println("Ein Meerschweinchen ist nicht mehr scheu\n");
    }

    void neuesMerino(){
        MerinoAnzahl++;
    }

    //Konstruktoren
    public Merino(){
        neuesMerino();
        this.Rasse = "Merino";
    }

    public Merino(double d){
        neuesMerino();
        this.haarlaenge = d;
    }

    public Merino(double d, boolean b){
        neuesMerino();
        this.haarlaenge = d;
        this.scheu = b;
    }

 }
