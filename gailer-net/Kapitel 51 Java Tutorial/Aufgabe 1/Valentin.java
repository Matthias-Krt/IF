/*Kapitel 51 Aufgabe 1
  Matthias Korte
*/

class Valentin extends Karte{

    int kuesse;

    public Valentin(String e, String s, int k){
        super(e, s);
        kuesse = k;
    }

    public void gruss(){
        System.out.println(anrede + " " + empfaenger + ",");
        System.out.println("herzliche Gruesse und Kuesse,\n");

        for(int i = 0; i < kuesse; i++){
            System.out.print("X");
        }

        System.out.println("\n\n");
    }

}
