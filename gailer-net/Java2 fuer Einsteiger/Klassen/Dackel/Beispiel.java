/*Matthias Korte*/

public class Beispiel{

    public static void main(String args[]){

        Dackel Waldi = new Dackel();
        Dackel hundi = new Dackel(8);
        Dackel bernd = new Dackel(3, "Mittellanghaar");

        System.out.println(bernd.Alter);

        Waldi.bellen();
        Waldi.setAlter(4);
        Waldi.setFarbe("Braun");
        Waldi.setArt("Kurzhaar");

        hundi.bellen("Wuff Wuff!");
        hundi.Farbe = "Schwarz";
        hundi.Art = "Langhaar";

        System.out.println();
        System.out.println("Alter: " + Waldi.Alter + "\t Farbe: " + Waldi.Farbe + "\t Art: " + Waldi.Art);
        System.out.println("Alter: " + hundi.Alter + "\t Farbe: " + hundi.Farbe + "\t Art: " + hundi.Art);
        System.out.println("Alter: " + bernd.Alter + "\t Farbe: " + bernd.Farbe + "\t Art: " + bernd.Art);

        System.out.println("\nDackel: " + Dackel.anzahl);

        //Vererbung
        System.out.println("\t--- Vererbung ---");
        Rauhaardackel bello = new Rauhaardackel();
        bello.bellen();
    }

}
