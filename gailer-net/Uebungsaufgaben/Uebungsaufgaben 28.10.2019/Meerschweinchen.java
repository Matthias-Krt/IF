/*Matthias Korte
  Schreiben Sie die Klasse Meerschweinchen mit den Instanzvariablen
  Rasse als String, Bauchumfang als double und vollgefressen als boolean, Instanzmethode
  fressen, mit der String Ausgabe "Das Meerschweinchen ist satt" und gleichzeitigem
  Setzen der Instanzvariable vollgefressen auf true. Die Klassenvariable Tieranzahl und die
  neue Methode neuesTier, die jeweils die Tieranzahl um 1 erhoeht.
  Erzeugen Sie folgende Konstruktoren:
    1. ohne Parameter
    2. mit Uebergabe der Rasse als String
    3. mit Uebergabe der Rasse als String und Bauchumfang als double
  Bei jedem Erstellen eines Meerschweinchens soll die Tieranzahl mit Hilfe der Methode
  neuesTier um eins erhoeht werden.
*/

public class Meerschweinchen{

    //Instanzvariablen
    String Rasse;
    double Bauchumfang;
    boolean vollgefressen;

    //Klassenvariablen
    static int Tieranzahl;

    //Instanzmethoden
    public void fressen(){
        vollgefressen = true;
        System.out.println("Das Meerschweinchen ist satt\n");
    }

    //Klassenmethoden
    void neuesTier(){
        Tieranzahl++;
    }

    //Konstruktoren
    public Meerschweinchen(){
        neuesTier();
    }

    public Meerschweinchen(String s){
        neuesTier();
        this.Rasse = s;
    }

    public Meerschweinchen(String s, double d){
        neuesTier();
        this.Rasse = s;
        this.Bauchumfang = d;
    }
}
