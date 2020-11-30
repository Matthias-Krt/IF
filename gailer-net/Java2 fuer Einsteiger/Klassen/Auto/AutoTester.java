class AutoTester{


    public static void main(String args[]){
        Auto merc = new Auto();
        Auto bmw = new Auto("schwarz");
        Auto vw = new Auto("silber", 786);

        bmw.fahren(76);

        merc.color = "gelb";
        merc.mfd = "04/1990";
        merc.ccm = 420;
        merc.doors = 5;
        merc.topspeed = 250.8;
        System.out.println("Farbe: " + merc.color + ", Herstellungsjahr: " + merc.mfd + ", Hubraum: " + merc.ccm + "ccm, Tueren: " + merc.doors + ", Hoechstgeschwindigkeit: " + merc.topspeed + "km/h");
        merc.fahren();

        System.out.println("---------------------");
        merc.autoOeffnen();

        Auto.showAnzahl();

    }
}
