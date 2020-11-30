/*Kapitel 47 Aufgabe 4
  Matthias Korte

  Ein Audio Signal ist manchmal in einer Liste mit int Werten aufbewart.
  Die Werte repräsentieren die Intensität der Signale.
  In diesem Programm werden Signale in einem Array dargestellt.

  Oft gibt es dabei Störgeräusche.
  Glaetten eines Signal entfernt ein par dieser Störgeräusche
  und verbessert die Qualitaet des Signals. Diese Aufgabe ist die Werte in einem Integer Array zu glaetten.

  In dem Array "signal" sind die originalen Werte gespeichert.
  Jeder Wert wird durchlaufen smooth[n] ist der durchschnitt von drei Werten:
    signal[n-1], signal[n] und signal[n+1]

  Das erste Element von smooth ist der Durchschnitt der ersten zwei Werte von signal.
  Fuer das letzte Element, der Durchschnitt der letzten beiden Werte von signal.

  Nutze hierfuer integer arithmetic damit die Werte in smooth auch integer sind.
*/

import java.io.*;

class SignalSmoother{

    public static void main(String args[]) throws IOException{

        int[] signal = {5, 5, 4, 5, 6, 6, 7, 6, 5, 4, 1, 4};
        int[] smooth = new int[signal.length];

        //erste und letzte Element glaetten
        smooth[0] = (int) (signal[0] + signal[1])/2;
        smooth[signal.length - 1] = (int) (signal[signal.length - 1] + signal[signal.length - 2])/2;

        //restlichen Elemente glaetten
        for(int i = 1; i < signal.length - 1; i++){
            smooth[i] = (int) (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
        }

        //signal ausgeben
        for(int j = 0; j < signal.length; j++){
            System.out.print(signal[j] + " ");
        }

        System.out.println();

        //smooth ausgeben
        for(int j = 0; j < smooth.length; j++){
            System.out.print(smooth[j] + " ");
        }

    }
}
