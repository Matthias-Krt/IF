public class Motorboot extends Wasserfahrzeug{

    //Konstruktor
    public Motorboot(){
        System.out.println("\nNeues Motorboot");
    }

    public Motorboot(String f){
        super(f);
        System.out.println("\nNeues Motorboot");
    }

    public Motorboot(String f, int geschw){
        super(f, geschw);
        System.out.println("\nNeues Motorboot");
    }

    //Klassenmethode
    public void fahren(){
        System.out.println("Das Motorboot faehrt.");
    }

    public void fahren(int geschw){
        System.out.println("Das Motorboot faehrt " + geschw + " Knoten.");
    }

}
