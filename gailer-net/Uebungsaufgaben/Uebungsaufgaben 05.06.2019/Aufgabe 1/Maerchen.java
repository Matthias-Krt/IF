/*Uebungsaufgabe
  Matthias Korte

  Dodon, der Maerchenkoenig nahm bei einem Feldzug 100 Feinde gefangen,
  die er in 100 Einzelzellen steckte.
  An seinem Geburtstag sollten einige freigelassen werden und zwar nach einem eigenartigen Verfahren.

  Zunaechst werden alle Zellentueren aufgeschlossen,
  dann wir in einem zweiten Durchgang jede zweite Tuer wieder geschlossen,
  im dritten Durchgang wird jede dritte Tür,
  die offen stand wieder geschlossen und die,
  welche geschlossen waren, wieder geoeffnet.
  Und so geht es im 4. 5. bis zum 100 Durchgang weiter...

  Welche Tueren standen schliesslich am Geburtstag des Koenigs offen?
*/

class Maerchen{

    public static void main(String args[]){

        //false = Tuer geschlossen
        //true = Tuer geoeffnet

        final int NDOORS = 101;
        boolean[] doors = new boolean[NDOORS];

        //1. Durchgang
        for(int i = 0; i < doors.length; i++){
            doors[i] = true;
        }

        //2. Durchgang
        for(int i = 0; i < doors.length; i += 2){
            doors[i] = false;
        }

        //Durchgaenge 3 bis NDOORS
        for(int j = 3; j <= NDOORS; j++){
            for(int i = 0; i < doors.length; i += j){
                if(doors[i] == true){
                    doors[i] = false;
                }else{
                    doors[i] = true;
                }
            }
        }

        System.out.println();

        //Ausgabe von geoeffneten Tueren
        for(int i = 1; i < doors.length; i++){
            if(doors[i] == true){
                System.out.println("Door: " + i);
            }
        }

    }
}
