public class Schiff extends Wasserfahrzeug{

    //Konstruktor
    public Schiff(){
        System.out.println("\nNeues Schiff");
    }

    public Schiff(String f){
        super(f);
        System.out.println("\nNeues Schiff");
    }

    public Schiff(String f, int geschw){
        super(f, geschw);
        System.out.println("\nNeues Schiff");
    }

    //Klassenmethode
    public void fahren(){
        System.out.println("Das Schiff faehrt.");
    }
    public void fahren(int geschw){
        System.out.println("Das Schiff faehrt " + geschw + " Knoten.");
    }

}
