import java.io.*;

class Kunde implements Serializable {
    private String name;

    public Kunde() {
        name = "Leer";
    }

    public Kunde(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return "Kundenname: " + name;
    }
}

class Auftrag implements Serializable {
    private Kunde derKunde;
    private String bezeichnung;

    public Auftrag(Kunde k, String b) {
        derKunde = k;
        bezeichnung = b;
    }

    @Override
    public String toString() {
        return "Bezeichnung: " + bezeichnung + " " + derKunde.toString();
    }
}

public class ReadWrite9_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "E:/temp/Auftrag.xxx";

        Kunde ersterKunde = new Kunde("Hansen");
        Kunde zweiterKunde = new Kunde("Maier");

        Auftrag ersterAuftrag = new Auftrag(ersterKunde, "Laptop");
        Auftrag zweiterAuftrag = new Auftrag(zweiterKunde, "Desktop-PC");

        System.out.println(ersterAuftrag);
        System.out.println(zweiterAuftrag);

        //Serialisierung
        ObjectOutputStream serialisieren = new ObjectOutputStream(new FileOutputStream(path));
        serialisieren.writeObject(ersterKunde);
        serialisieren.writeObject(zweiterKunde);
        serialisieren.writeObject(ersterAuftrag);
        serialisieren.writeObject(zweiterAuftrag);
        serialisieren.close();

        //Deresialisierung
        Kunde dummyKunde1;
        Kunde dummyKunde2;
        Auftrag dummyAuftrag1;
        Auftrag dummyAuftrag2;

        ObjectInputStream einlesen = new ObjectInputStream(new FileInputStream(path));
        dummyKunde1 = (Kunde) einlesen.readObject();
        dummyKunde2 = (Kunde) einlesen.readObject();

        dummyAuftrag1 = (Auftrag) einlesen.readObject();
        dummyAuftrag2 = (Auftrag) einlesen.readObject();

        einlesen.close();

        System.out.println(dummyAuftrag1);
        System.out.println(dummyAuftrag2);
    }
}
