/*Matthias Korte

  Erstellen Sie ein Java Programm, welches eine Millionen mal eine Zufallszahl zwischen 1 und 6 berechnet.
  Geben Sie nach druchlaufen der Schleife an wie oft die Zahlen 1, 2, 3, 4, 5 und 6 gewuerfelt wurden.
  Verweden Sie zur sammlung der Zahlen ein Array.
*/

class MatthiasWuerfel{

    public static void main(String args[]){

        final int MAX = 1000000;
        int[] data = new int[6];
        int[] test = new int[7];
        int rnd;

        for(int i = 0; i < MAX; i++){
            rnd = (int) (6 * Math.random() + 1);

            test[rnd] += 1;

            switch(rnd){
                case 1:
                    data[0] += 1;
                    break;
                case 2:
                    data[1] += 1;
                    break;
                case 3:
                    data[2] += 1;
                    break;
                case 4:
                    data[3] += 1;
                    break;
                case 5:
                    data[4] += 1;
                    break;
                case 6:
                    data[5] += 1;
                    break;
            }
        }

        System.out.println("1: " + data[0]);
        System.out.println("2: " + data[1]);
        System.out.println("3: " + data[2]);
        System.out.println("4: " + data[3]);
        System.out.println("5: " + data[4]);
        System.out.println("6: " + data[5]);

        System.out.println("\nTEST:");
        System.out.println("1: " + test[1]);
        System.out.println("2: " + test[2]);
        System.out.println("3: " + test[3]);
        System.out.println("4: " + test[4]);
        System.out.println("5: " + test[5]);
        System.out.println("6: " + test[6]);

    }
}
