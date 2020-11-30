class HaustierFuettern{

    public static void main(String args[]){

        Hund bello = new Hund("Bello", 2, 1);
        Hund brutus = new Hund("Brutus", 8, 3);
        Katze miss = new Katze("Miss", 4, 1);
        Katze mika = new Katze("Mika", 3, 2);

        //Ausgabe
        bello.futtern();
        bello.anzeigen();

        System.out.println("-----------");

        brutus.futtern();
        brutus.anzeigen();

        System.out.println("-----------");

        miss.futtern();
        miss.anzeigen();

        System.out.println("-----------");

        mika.futtern();
        mika.anzeigen();

    }
}
