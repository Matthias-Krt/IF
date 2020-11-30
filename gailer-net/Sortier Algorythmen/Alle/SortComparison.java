/*Matthias Korte

  Schreiben Sie ein Java Programm, das ein Interger Array mit 10000 slots erstellt.
  Lassen Sie anschließend in einer Schleife dieses Array
  mit Zufallszahlen zwischen 1 und 100000 fuellen.

  Hiernach sollen die ersten 100 Slots und die letzten 100 Slots auf dem Bildschirm ausgegeben werden.

  Mit System.nanoTime() kann man die Zeit messen, welche fuer die Sortierung benoetigt wird.
*/

import java.util.Random;

class quickBubbleSortComparison{

    //bubble sort
    public static void bubble (int[] feld){
        for(int i = 1; i < feld.length; i++){
            for(int j = feld.length-1; j >= i; j--){
                if(feld[j] < feld[j-1]){
                    int temp = feld[j];
                    feld[j] = feld[j-1];
                    feld[j-1] = temp;
                }
            }
        }
    }

    //quicksort
    public static void quick(int[] feld, int l, int r){
        int i = l;
        int j = r;
        int vgl;

        vgl = feld[(l+r) >> 1];

        do {
            while(feld[i] < vgl){
                i++;
            }
            while(vgl < feld[j]){
                j--;
            }

            if(i <= j){
                int temp = feld[j];
                feld[j] = feld[i];
                feld[i] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if(l < j){
            quick(feld, l, j);
        }
        if(i < r){
            quick(feld, i, r);
        }
    }

    //print function
    static void print(int[] data){
        //ersten und letzten 100 Slots ausgeben
        final int OUTPUTDIGITS = 100;
        for(int i = 0; i < data.length; i++){
            if(i < OUTPUTDIGITS || i > data.length - OUTPUTDIGITS){
                System.out.println(data[i]);
            }
        }
    }

    public static void main(String args[]){

        Random rnd = new Random();

        final int border = 1000000;

        final int size = 10000;
        int[] arr = new int[size];
        int[] arrDouble = new int[size];

        //Array fuellen
        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(border) + 1;
            arrDouble[i] = arr[i];
        }

        print(arr);

        System.out.println("----------\n" + "SORTED - QUICKSORT\n" + "----------");

        //sortieren
        long timeStartBubble = System.nanoTime();
        bubble(arr);
        long timeEndBubble = System.nanoTime();
        long bubbleSortTime = timeEndBubble - timeStartBubble;
        print(arr);

        System.out.println("----------\n" + "SORTED - QUICKSORT\n" + "----------");

        //quicksort
        long timeStartQuick = System.nanoTime();
        quick(arrDouble, 0, arrDouble.length - 1);
        long timeEndQuick = System.nanoTime();
        long quickSortTime = timeEndQuick - timeStartQuick;
        print(arrDouble);

        //Differenz zwischen quicksort und bubblesort
        long timeDifference;
        if(bubbleSortTime < quickSortTime){
            timeDifference = quickSortTime - bubbleSortTime;
        }else{
            timeDifference = bubbleSortTime - quickSortTime;
        }

        System.out.println("----------\n" + "SORT - TIMES\n" + "----------");

        System.out.println("bubblesort:\t" + bubbleSortTime + " Nanosekunden");
        System.out.println("quicksort:\t" + quickSortTime + " Nanosekunden");
        System.out.println("Differenz:\t" + timeDifference + " Nanosekunden");
    }
}
