class Spielwaren extends Waren implements Besteuerbar{

    private int mindestalter;

    //Konstruktor
    Spielwaren(String b, double p, int az, int minAlter){
        super(b, p, az);
        mindestalter = minAlter;
    }

    void anzeigen(){
        super.anzeigen();
        System.out.println("Steuer: " + berechneSteuer());
        System.out.println("mindestalter: " + mindestalter);
    }

    public double berechneSteuer(){
        return getPreis() * STEUERSATZ;
    }

    //set- get-Methoden
    public int getMindestalter(){
        return this.mindestalter;
    }
    public void setMindestalter(int a){
        this.mindestalter = a;
    }

}
