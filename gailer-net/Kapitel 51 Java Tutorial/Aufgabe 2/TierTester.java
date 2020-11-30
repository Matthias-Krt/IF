class TierTester{

    public static void main(String args[]){

        Hund bello = new Hund("Bello", 2);
        Katze miss = new Katze("Miss", 4);

        bello.spricht();
        bello.futtern();
        bello.anzeigen();

        miss.spricht();
        miss.futtern();
        miss.anzeigen();

    }

}
