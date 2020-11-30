/*Kapitel 25 Aufgabe 2
  Matthias Kote

Die Plaetzchen-Objekte sollen über eine weitere Eigenschaft Verzierung verfuegen.

Erweitern Sie dazu die Klasse Plaetzchen um die boolesche Instanzvariable verzierungJaNein.
Passen Sie die ausgeben() Methode an.
Weisen Sie in der Methode main() den ersten beiden Plaetzchen-Objekten keine
und dem letzten Plaetzchen-Objekt eine Verzierung zu.

Testen Sie dann die erweiterte Plaetzchen-Klasse.

    Hinweis: Sie werden eine lokale Stringvariable in der Methode ausgeben() brauchen.*/

class Plaetzchen {

    // Instanzvariablen
    String sorte;
    String groesse;
    String form;

    boolean verzierung;

    public static void main(String[] args) {

    	System.out.println("+++ Plaetzchen +++ \n");

         //Plaetzchen 1 erstellen
         Plaetzchen plaetzchen1 = new Plaetzchen();
         plaetzchen1.sorte = "Kokos";
         plaetzchen1.groesse = "mittel";
         plaetzchen1.form = "rund";
         plaetzchen1.verzierung = false;

         plaetzchen1.ausgeben();

         //Plaetzchen 2 erstellen
         Plaetzchen plaetzchen2 = new Plaetzchen();
         plaetzchen2.sorte = "Affennuss";
         plaetzchen2.groesse = "klein";
         plaetzchen2.form = "rund";
         plaetzchen2.verzierung = false;

         plaetzchen2.ausgeben();

         //Plaetzchen 3 erstellen
         Plaetzchen plaetzchen3 = new Plaetzchen();
         plaetzchen3.sorte = "Honigkuchen";
         plaetzchen3.groesse = "gross";
         plaetzchen3.form = "rechteckig";
         plaetzchen3.verzierung = true;

         plaetzchen3.ausgeben();

    }

    // Instanzmethode
    public void ausgeben() {
        String verzierungJaNein;

        if(verzierung == true){
          verzierungJaNein = "ja";
        }else{
          verzierungJaNein = "nein";
        }

        System.out.println("Sorte: " + sorte + ", Groesse: " + groesse + ", Form: " + form + ", Verzierung: " + verzierungJaNein); //Ausgeben von Sorte, Groesse, Form
    }
}
