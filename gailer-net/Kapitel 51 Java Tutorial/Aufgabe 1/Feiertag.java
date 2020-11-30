/*Kapitel 51 Aufgabe 1
  Matthias Korte
*/

class Feiertag extends Karte{

    public Feiertag(String e, String s){
        super(e, s);
    }

    public void gruss(){
        System.out.println(anrede + " " + empfaenger + ",");
        System.out.println("frohe Feiertage!\n\n");
    }

}
