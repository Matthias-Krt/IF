/*Kapitel 46 Aufgabe 3
  Matthias Korte

  Schreiben Sie ein Programm mit vier Rechnungen,
  sodass jede Zelle von sum die Summe der gleichen Zellen von valA und valB etc. enthält.
  Zum Beispiel: rechne Zelle 0 von valA zu der Zelle 0 von valB
  und schreibe das Ergebnis in Zelle 0 von sum und so weiter.
*/

class ThreeArrays{

    public static void main(String args[]){

        int[] valA   = { 13, -22,  82,  17};
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};

        // Add values from corresponding cells of valA and valB and put the result in the corresponding cell of sum.
        for(int i = 0; i < valA.length; i++){
            sum[i] = valA[i] + valB[i];
        }

        System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );

    }

}
