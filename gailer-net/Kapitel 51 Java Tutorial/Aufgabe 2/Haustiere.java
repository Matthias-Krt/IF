/*Kapitel 51 Aufgabe 2
  Matthias Korte

  Die Subklassen der Programmieraufgabe Haustiere des vorherigen Kapitels
  sollen erweitert werden.

  Erweitern Sie die Konstruktoren der Subklassen um eine int-Variable,
  ueber die die Instanzvariablen kategorie bzw. haltung entsprechend initialisiert werden.

  Ueberschreiben Sie in den Subklassen die Methode anzeigen() der Superklasse.
  Sie soll zusätzlich die Kategorie bzw. den Typ der Haltung ausgeben.

  Testeb Sie das Programm in einer Klasse HaustierFuettern.
*/

abstract class Haustiere{

    String name;
    double futtervorrat;
    double anzahlTage;

    Haustiere(String n, double fv){
        name = n;
        futtervorrat = fv;
    }

    public void futtern(){
        spricht();

        while(futtervorrat > 0){
            friss();
        }
    }

    public abstract void friss();
    public abstract void spricht();
    public abstract void anzeigen();

}
