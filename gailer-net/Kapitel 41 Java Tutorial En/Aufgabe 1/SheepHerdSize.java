/*Kapitel 41 Aufgabe 1 (Original Version)
  Matthias Korte

  Anzahl der Schafe n, Jahre t.
  Die Anzahl der Schafe n, nach t Jahren werden mit der Formel:
    n = 220/(1 + 10(0.83)^t)

  Schreiben Sie ein Programm(benutze for-loop) das den Wert fuer n berechnet.
  t startet bei 0 und geht bis 25.
  Wie lange dauert es bis es 80 Schafe sind?
*/

/*Besser: In der for-Schleife t als Zaehler nutzen,
  so wird immer ein Jahr uebersprungen*/

class SheepHerdSize{

    public static void main(String args[]){

        double n = 20;       //Anzahl Schafe
        int t = 0;           //Anzahl Jahre

        int in = 0;
        int it = 0;
        boolean w = false;

        for(double pow = 1; t < 25; pow *= 0.83){
            t++;
            n = 220/(1+10*(0.83*pow));
            System.out.println(t + ". Jahr: " + (int) n + "\t\t pow: " + pow);

            //erstesmal ueber 80 Schafe
            if(n >= 80 && w == false){
            	in = (int) n;  //abgeschnittene Zahl
                it = t;
            	w = true;
            }
        }

        System.out.println("\n Schafe: " + in + " nach " + it + " Jahren");

    }

}
