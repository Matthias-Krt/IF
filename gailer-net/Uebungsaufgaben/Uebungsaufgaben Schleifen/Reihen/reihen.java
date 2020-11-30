/*Uebungsaufgbe zu Schleifen
  Matthias Korte

  Schreiben sie ein Programm das das kleine 1*6 auf dem Bildschirm anzeigt.
  Hierbei soll untereinander, jeweils in Paekchenform die Zeilen:
    1 * 6 = 6
    2 * 6 = 12
    ...usw.
  ausgegeben werden, wobei alle Zahlen durch Variablen realisiert werden.

  6er Reihe - while-Schleife
  7er Reihe - for-Schleife
  8er Reihe - dow-Schleife
*/

class reihen{
    public static void main(String args[]){

        //6er Reihe
        int fak = 6;    //Reihe
        int i = 1;      //Multiplikator
        int erg = 0;    //Ergebniss

        while(i <= 10){
            erg = i * fak;
            System.out.println(i + "*" + fak + "=" + erg);
            i++;
        }

        System.out.println();
        //7er Reihe
        fak = 7;

        for(i = 1; i <= 10; i++){
            erg = i * fak;
            System.out.println(i + "*" + fak + "=" + erg);
        }

        System.out.println();
        //8er Reihe
        fak = 8;
        i = 1;

        do {
            erg = i * fak;
            System.out.println(i + "*" + fak + "=" + erg);
            i++;
        } while (i <= 10);

    }
}
