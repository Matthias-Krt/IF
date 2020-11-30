/*Matthias Korte*/

public class Dackel{

    //Standard Konstruktor
    public Dackel(){
        System.out.println("Geburt eines Dackels!\n");
        Dackel.anzahl++;
        this.Alter = 1;
    }

    //Konstruktor mit Alter
    public Dackel(int var){
        System.out.println("Geburt eines Dackels!\n");
        Dackel.anzahl++;
        this.Alter = var;
    }

    //Konstruktor mit Alter und Art
    public Dackel(int age, String art){
        System.out.println("Geburt eines Dackels!\n");
        Dackel.anzahl++;
        this.Alter = age;
        this.Art = art;
    }

    //Konstruktor mit allen Instanzvariablen
    public Dackel(int age, String color, String art){
        System.out.println("Geburt eines Dackels!\n");
        Dackel.anzahl++;
        this.Alter = age;
        this.Farbe = color;
        this.Art = art;
    }

    //Destruktor
    protected void finalize(){
        Dackel.anzahl--;
    }

    //Instanzvariablen
    int Alter;
    String Farbe;
    String Art;

    //Klassenvariablen
    static int anzahl;

    //Instanzmethoden
    public void bellen(){
        System.out.println("WauWau!");
    }

    public void bellen(String svar){
        System.out.println(svar);
    }

    public int getAlter(){
        return this.Alter;
    }

    public String getFarbe(){
        return this.Farbe;
    }

    public String getArt(){
        return this.Art;
    }

    public void setAlter(int x){
        this.Alter = x;
    }

    public void setFarbe(String s){
        this.Farbe = s;
    }

    public void setArt(String s){
        this.Art = s;
    }

    //Klassenmethoden
    static void moreDackel(){
        Dackel.anzahl++;
    }

}
