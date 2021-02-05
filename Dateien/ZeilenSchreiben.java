/* Matthias Korte

   Der Anwender wird zunaechst gefragt, wie viele Zeilen in die Datei "Randomtext.txt" geschrieben werden sollen.
   Danach soll die angeforderte Anzahl an Textzeilen, bestehend aus zufaelligen Buchstaben und Ziffern, Gross- und Kleinschreibung,
   jeweils 40 Zeichen pro Zeile geschrieben werden.
*/

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class ZeilenSchreiben {
    public static void main(String[] args) throws IOException {

        String path = "E:/temp/Randomtext.txt";
        int maxCharactersInRow = 40;

        Scanner s = new Scanner(System.in);
        FileWriter writer = new FileWriter(path);

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        int randIndex;

        System.out.println("Wie viele Zeilen sollen in die Datei geschrieben werden?");
        int zeilen = s.nextInt();

        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < maxCharactersInRow; j++) {
                writer.write(characters.charAt(rand.nextInt(characters.length()));
            }
            writer.write(System.getProperty("line.separator"));
        }

        writer.close();

    }
}
