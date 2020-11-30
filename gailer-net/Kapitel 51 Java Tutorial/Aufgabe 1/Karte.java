/*Kapitel 51 Aufgabe 1
  Matthias Korte

  Das Grusskarten-Beispiel hat in der deutschen Ueberstzung einen kleinen Schoenheitsfehler.
  Erweitern Sie die abstrakte Klasse Karte um die Instanzvariable String anrede
  und einem Konstruktor, der die Variablen empfaenger und anrede initialisiert.
    Karte(String empfaenger, String sex)

  Der Variablen anrede wird dann entweder der String "Liebe" oder "Lieber" zugewiesen.
  Passen Sie die Subklassen und das Testprgramm entsprechend an.
*/

abstract class Karte{

    String empfaenger;
    String anrede;

    Karte(String e, String sex){
        empfaenger = e;

        if(sex.equals("w") || sex.equals("W")){
            anrede = "Liebe";
        }else if(sex.equals("m") || sex.equals("M")){
            anrede = "Lieber";
        }else{
            anrede = "Liebe/Lieber";
        }
    }

    public abstract void gruss();

}
