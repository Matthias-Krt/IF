/*Kapitel 25 Aufgabe 1s
  Matthias Korte

Erstellen Sie eine Klasse Plaetzchen mit den folgenden Instanzvariablen:
    sorte
    groesse
    form
Diese Variablen sind vom Typ String.

Erstellen Sie danach eine Methode public void ausgeben(),
die Informationen über die Objekte dieser Klasse ausgibt.

Erzeugen Sie in der main() Methode die folgenden 3 Plaetzchen-Objekte:
    Sorte Kokos, Groesse mittel, Form rund
    Sorte Affennuss, Groesse klein, Form rund
    Sorte Honigkuchen, Groesse gross, Form rechteckig
*/

class Plaetzchen {

    // Instanzvariablen
    String sorte;
    String groesse;
    String form;

    public static void main(String[] args) {

    	System.out.println("+++ Plaetzchen +++ \n");

         //Plaetzchen 1 erstellen
         Plaetzchen plaetzchen1 = new Plaetzchen();
         plaetzchen1.sorte = "Kokos";
         plaetzchen1.groesse = "mittel";
         plaetzchen1.form = "rund";

         plaetzchen1.ausgeben();

         //Plaetzchen 2 erstellen
         Plaetzchen plaetzchen2 = new Plaetzchen();
         plaetzchen2.sorte = "Affennuss";
         plaetzchen2.groesse = "klein";
         plaetzchen2.form = "rund";

         plaetzchen2.ausgeben();

         //Plaetzchen 3 erstellen
         Plaetzchen plaetzchen3 = new Plaetzchen();
         plaetzchen3.sorte = "Honigkuchen";
         plaetzchen3.groesse = "gross";
         plaetzchen3.form = "rechteckig";

         plaetzchen3.ausgeben();

    }

    // Instanzmethode
    public void ausgeben() {
        //Ausgeben von Sorte, Groesse, Form
        System.out.println("Sorte " + sorte + ", Groesse " + groesse + ", Form " + form);
    }

}
