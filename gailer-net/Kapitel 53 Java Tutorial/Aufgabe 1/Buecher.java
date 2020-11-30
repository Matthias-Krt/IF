class Buecher extends Waren implements Besteuerbar{

    private String autor;

    //Konstruktor
    Buecher(String b, double p, int az, String a){
        super(b, p, az);
        autor = a;
    }

    void anzeigen(){
        super.anzeigen();
        System.out.println("Steuer: " + berechneSteuer());
        System.out.println("Autor: " + autor);
    }

    public double berechneSteuer(){
        return getPreis() * STEUERSATZ;
    }

    //set- get-Methoden
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }

}
