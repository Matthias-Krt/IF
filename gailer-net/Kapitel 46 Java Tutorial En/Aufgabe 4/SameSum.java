/*Kapitel 46 Java Tutorial
  Matthias Korte

  Schreiben Sie ein Programm das Werte in valB schreibt,
  sodass die Summe der gleichen Zelle von valA und valB 25 ergibt.
*/

class SameSum{

    public static void main(String args[]){

        int[] valA   = { 13, -22,  82,  17};
        int[] valB   = {  0,   0,   0,   0};

        final int MUSTERG = 25; //gewuenschtes Ergebnis

        // Put values into valB so that the sum of the values in corresponding cells of valA and valB is 25.
        for(int i = 0; i < valA.length; i++){
            valB[i] = MUSTERG - valA[i];
        }

        System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );

        System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

        System.out.println( "sum:  " + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );

    }

}
