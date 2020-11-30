/*Matthias Korte*/

public class Rauhaardackel extends Dackel{

    String Fellfarbe;

    //Klassenmethode
    public void beissen(){
        System.out.println("Der Dackel beisst!");
    }

    //Methode ueberladen
    public void bellen(){
        System.out.println("BellBellBell");
    }

    //Konstruktor
    public Rauhaardackel(){
        System.out.println("Noch ein Rauhaardackel!");
    }
}
