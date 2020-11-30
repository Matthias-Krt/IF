/*Kapitel 51 Aufgabe 1
  Matthias Korte
*/

class Geburtstag extends Karte{

    int alter;

    Geburtstag(String e, String s, int jahre){
        super(e, s);
        alter = jahre;
    }

    public void gruss(){
        System.out.println(anrede + " " + empfaenger + ",");
        System.out.println("alles Gute zum " + alter + " Geburtstag\n\n");
    }

}
