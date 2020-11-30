abstract class Wasserfahrzeug{

    int Geschwindigkeit;
    String Farbe;

    //Konstruktor
    public Wasserfahrzeug(){}

    public Wasserfahrzeug(String f){
        Farbe = f;
    }

    public Wasserfahrzeug(String f, int geschw){
        Farbe = f;
        Geschwindigkeit = geschw;
    }

    //abstrakte Methode
    public abstract void fahren();

}
