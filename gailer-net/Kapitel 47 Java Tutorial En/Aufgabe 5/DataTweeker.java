/*Kapitel 47 Aufgabe 5
  Matthias Korte

  Werte:
  13
  5.6
  6.2
  6.0
  5.5
  5.7
  6.1
  7.4
  5.5
  5.5
  6.3
  6.4
  4.0
  6.9

  Erstelle eine Textdatei das die Werte beinhaltet.
  Jetzt schreibe ein Programm das die Daten in ein Array liest.
  Berechne den Durchschnitt all dieser Werte.
  Scanne durch das Array und finde die Werte am weitesten entfernt(beide Richtungen) vom Mittelpunkt.
  Setze diesen Wert auf -1 um zu zeige das es nicht benutzt werden soll.
  Berechne dann den neuen Durchschnitt.
*/

import java.util.*;
import java.io.*;

class DataTweeker{

    public static void main(String args[]) throws IOException{
        
        File phData = new File("phData.txt");
        Scanner s = new Scanner(phData);
        Scanner sc = new Scanner(phData);

        double[] data;
        String input;
        double sum = 0;
        double sumNew = 0;

        int lineCount = 0;
        int index = 0;

        //get how many lines the file has
        while(s.hasNextLine()){
            lineCount++;
            System.out.println("data[" + index + "]: \t" + s.nextLine());
            index++;
        }

        System.out.println();

        //Array initialisieren
        data = new double[lineCount];

        //put data into the Array
        //get the sum
        for(int i = 0; i < lineCount; i++){
            input = sc.nextLine();
            //String converted to Double
            data[i] = Double.parseDouble(input);
            sum += Double.parseDouble(input);
        }

        //Average
        double average = sum / lineCount;

        //get the number farest away from average
        double temp = average;
        double tempOld = average - data[0];
        double farestNum = data[0];
        int farestIndex = 0;
        for(int j = 0; j < data.length; j++){
            temp = average - data[j];
            if(temp > tempOld){
                tempOld = temp;
                farestIndex = j;
                farestNum = data[farestIndex];
            }
        }

        System.out.println(Arrays.toString(data));  //print array
        System.out.println("average: " + average);
        System.out.println("most disatance value: " + farestNum);

        //set the farest value to -1
        data[farestIndex] = -1;

        //new sum
        for(int i = 0; i < data.length; i++){
            sumNew += data[i];
        }
        //get the new sum without -1
        sumNew += 1.0;

        //new Average
        double averageNew = sumNew / lineCount;

        System.out.println("new average: " + averageNew);

    }
}
