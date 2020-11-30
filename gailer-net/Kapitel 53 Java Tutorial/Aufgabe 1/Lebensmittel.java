class Lebensmittel extends Waren{

    private double kalorien;

    //Konstruktor
    Lebensmittel(String b, double p, int az, double k){
        super(b, p, az);
        kalorien = k;
    }

    void anzeigen(){
        super.anzeigen();
        System.out.println("kalorien: " + kalorien);
    }

    //set- get-Methoden
    public double getKalorien(){
        return this.kalorien;
    }
    public void setKalorien(double k){
        this.kalorien = k;
    }

}
