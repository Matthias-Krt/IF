/*Kapitel 48 Aufgabe 3
  Matthias Korte

  Fuege jetzt eine weitere Methode hinzu das den Durchschnitt in einem Bereich von Tagen berechnet.
  Der Bereich soll alle Tage von "start" bis "end" enthalten.

  Nutze die main() Methode um den Durchschnitt der ersten Hälfte des Monats
  und die zweite Hälfte des Monats zu berechnen.
  Wenn der Monat eine ungearde Zahl an Tagen hat addiere den mittleren Tag in beiden Rechnungen.
*/

//TODO: Fehler bei zweiter Haelfte des Monats

import java.io.*;
import java.util.Scanner;

class AverageOps{

    int average(int[] data){
        int sum = 0;
        int avg;

        //Summe des Arrays
        for(int i = 0; i < data.length; i++){
            sum += data[i];
        }

        //Durchschnitt
        avg = sum / data.length;

        return avg;

    }

    int subAverage(int start, int end, int[] data){
        int subAvg;
        int sum = 0;
        int i;
        int counter = 1;

        for(i = start -1; i <= end -1; i++){
            sum += data[i];
            counter++;
        }

        subAvg = sum / counter;

        return subAvg;
    }
}

class SubrangeOfDays{

    public static void main (String args[]){

        Scanner s = new Scanner(System.in);

        int start, end;

        System.out.println("Von wann soll der Durchschnitt berechnet werden?");
        start = s.nextInt();
        System.out.println("Bis wann soll der Durchschnitt berechnet werden?");
        end = s.nextInt();

        System.out.println();

        int[] val = {98,  99,  98,  99, 100, 101, 102, 100, 104, 105, 105, 106, 105, 103, 104,
                     103, 105, 106, 107, 106, 105, 105, 104, 104, 103, 102, 102, 101, 100, 102, 100};

        AverageOps june = new AverageOps();

        //Average for the whole month
        int avg = june.average(val);

        //Subrange of Days with userinput
        int subAvg = june.subAverage(start, end, val);

        //Subrange of days automatic
        int startOne, endOne;
        int startTwo, endTwo;

        if(val.length % 2 == 0){
            startOne = 1;
            endOne = val.length / 2;

            startTwo = (val.length / 2) + 1;
            endTwo = val.length;
        }else{
            startOne = 1;
            endOne = (val.length / 2) + 1;

            startTwo = endOne;
            endTwo = val.length;
        }

        int subOneAvg = june.subAverage(startOne, endOne, val);
        int subTwoAvg = june.subAverage(startTwo, endTwo, val);

        System.out.println("Durchschnitt: " + avg);
        System.out.println("Durchschnitt: vom " + start + " bis zum " + end + " : "  + subAvg);
        System.out.println("Durchschnitt: vom " + startOne + " bis zum " + endOne + " : "  + subOneAvg);
        System.out.println("Durchschnitt: vom " + startTwo + " bis zum " + endTwo + " : "  + subTwoAvg);

    }
}
