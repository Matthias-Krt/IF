/* Matthias Korte
*/

import java.io.*;

public class ReadWrite9_4 {
    public static void main(String[] args) {
        String path = "C:/temp/";

        File eineDatei = new File(path, "java_94.txt");
        System.out.println("Name der Datei: " + eineDatei.getName());
        System.out.println("Pfad der Datei: " + eineDatei.getPath());
        System.out.println("Länge der Datei: " + eineDatei.length());
        System.out.println("Datei (ja==true / nein==false): " + eineDatei.isFile());
        System.out.println("Existenz (ja==true / nein==false): " + eineDatei.exists());

        File [] laufwerke = File.listRoots();
        for (File lw: laufwerke) {
            System.out.println(lw.getPath());
        }

        File pfad = new File("C:/temp");
        File [] verzeichnisse = pfad.listFiles();
        for (File vz : verzeichnisse) {
            if (vz.isFile()) {
                System.out.println("Datei: " + vz.getName());
            } else {
                System.out.println("Verzeichnis: " + vz.getName());
            }
        }
    }
}
