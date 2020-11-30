/*Matthias Korte
  Testen Sie die Klasse Meerschweinchen mit der neuen Klasse Zoohandlung. Erstellen
  Sie hierin drei Meerschweinchenobjekte mit Hilfe der drei Konstruktoren. Lassen Sie die
  Anzahl der Meerschweinchen auf dem Bildschirm ausgeben. Benutzen Sie alle Methoden
  der Klasse Meerschweinchen in der Klasse Zoohandlung mindestes einmal.
*/

public class Zoohandlung{

    public static void main(String args[]){

        //Konstruktoren
        Meerschweinchen x = new Meerschweinchen();
        Meerschweinchen y = new Meerschweinchen("Kurzhaar");
        Meerschweinchen z = new Meerschweinchen("Langhaar", 12.5);

        Merino m = new Merino();
        Merino n = new Merino(3.5);
        Merino o = new Merino(2.5, true);

        //Methoden
        x.fressen();
        m.zaehmen();

        //Tieranzahl ausgeben
        System.out.println("Meerschweinchen: " + Meerschweinchen.Tieranzahl);
        System.out.println("Merinos: " + Merino.MerinoAnzahl);

    }
}
