/* Matthias Korte
   Das eine vom Anwender anzugebene Textdatei einliest,
   intern mit dem Codewort AbiturZwanzigEinundzwanzig nach Vigenere verschlüsselt
   und das Ergebnis als Datei geheim.txt abspeichert.
*/

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class ReadWriteVigenere {

    static String encryptVigenere(String txt, String codeWord) {
        int key = 3;
        String chiffre = "";
        char ch, codeWordCh;
        int charNum;
        int codeWordNum = 0;

        //Remove \n->_, \t
        txt = txt.replaceAll("[\\n ]", "_");                                        //Um es gleich zu erkennen und ersetzen
        txt = txt.replaceAll("[\\t ]", " ");

        for(int i = 0; i < txt.length(); i++){
            ch = txt.charAt(i);
            codeWordCh = codeWord.charAt(codeWordNum);

            key = (int) codeWordCh - 65;

            if(ch != 32 && ch != 92 && ch != 95){
                charNum = (int) ch - 65;
                charNum += key;
                charNum %= 26;

                chiffre += (char) (charNum + 65);
            } else {
                if (ch == 95) { chiffre += System.getProperty("line.separator"); }    //Umbruch hinzufuegen
                if(ch == 32) { chiffre += " "; }                                      //Leerzeichen
            }

            if(codeWordNum < codeWord.length()-1) {codeWordNum++;} else {codeWordNum = 0;}

        }

        return chiffre;
    }

    public static void main(String[] args) throws IOException {
        final String CODEWORD = "abiturzwanzigeinundzwanzig";
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie den kompletten Pfad zu Datei an:");
        String userIn = s.nextLine();
        Path p = Paths.get(userIn.trim());

        //Read from File
        String inputTxt = Files.readString(p);

        //Create File
        FileWriter writer = new FileWriter(p.getParent() + "/geheim.txt");
        String chiffre = encryptVigenere(inputTxt, CODEWORD);
        writer.write(chiffre);
        writer.close();

        System.out.println("Datei geheim.txt wurde in " + p.getParent() + " erstellt.");
    }

}
