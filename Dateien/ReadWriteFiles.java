/* Matthias Korte
 *
 * Dateioperationen in Java
 * Kapitel 9.1
*/

import java.io.*;

public class ReadWriteFiles {
    public static void main(String[] args) throws IOException {

        String path = "E:/temp/java";

        //in eine Datei schreiben
        FileWriter writer = new FileWriter(path + ".txt");
        for (int i = 65; i < 91; i++) { writer.write(i); }
        writer.write(System.getProperty("line.separator"));
        writer.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        writer.close();

        //Daten anhaengen
        writer = new FileWriter(path + ".txt", true);
        writer.write(System.getProperty("line.separator"));
        writer.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        writer.close();

        //Zeichenweise aus der Datei lesen
        FileReader reader = new FileReader(path + ".txt");
        char[] c = new char[1];
        while (reader.read(c) != -1) { System.out.print(c[0]); }
        reader.close();
        System.out.println();

        System.out.println();

        //Komplett aus der Datei lesen
        reader = new FileReader(path + ".txt");
        char[] zeichen = new char[82];
        reader.read(zeichen);
        reader.close();
        for (int i = 0; i < zeichen.length; i++) { System.out.print(zeichen[i]); }
        System.out.println();

        System.out.println();

        //Direkter Zugriff in Dateien
        RandomAccessFile freierZugriff = new RandomAccessFile(path + "_1" + ".txt", "rw");  //Zum schreiben oeffnen
        freierZugriff.writeBytes("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        freierZugriff.close();

        freierZugriff = new RandomAccessFile(path + "_1" + ".txt", "r");
        System.out.println(freierZugriff.readLine());
        freierZugriff.close();

        freierZugriff = new RandomAccessFile(path + "_1" + ".txt", "rw");
        long length = freierZugriff.length();
        System.out.println("Dateizeiger steht auf Position: " + freierZugriff.getFilePointer());
        System.out.println("Laenge der Datei: " + length);

        freierZugriff.seek(length/2);   //Position des Zeigers setzen
        System.out.println("Dateizeiger steht auf Position: " + freierZugriff.getFilePointer());
        System.out.println("Zeichen an dieser Position: " + (char) freierZugriff.read());
        System.out.println("Dateizeiger steht auf Position: " + freierZugriff.getFilePointer());

        freierZugriff.write('X');
        System.out.println("Dateizeiger steht auf Position: " + freierZugriff.getFilePointer());

        freierZugriff.seek(0);
        System.out.println("Dateizeiger steht auf Position: " + freierZugriff.getFilePointer());
        System.out.println(freierZugriff.readLine());
        freierZugriff.close();
    }
}
