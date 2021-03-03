/* Matthias Korte
*/

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class ReadWriteFiles9_2 {
    public static void main(String[] args) throws IOException {

        String path = "C:/temp/java";

        PrintWriter writer = new PrintWriter(path + "9_2.txt");

        writer.println("Hallo");
        writer.println(123);
        writer.println(true);
        writer.println(100.45);
        writer.close();

        /* 9.2.2 */
        Scanner reader = new Scanner(new FileReader(path + "9_2.txt"));

        System.out.println(reader.nextLine());
        System.out.println(reader.nextInt());
        System.out.println(reader.nextBoolean());
        reader.useLocale(Locale.ENGLISH);
        System.out.println(reader.nextDouble());
        reader.close();
    }
}
