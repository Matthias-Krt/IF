/*Kapitel 50 Aufgabe 1
  Matthias Korte
  Erzeugen Sie in der Klasse ArtikelTester zwei Artikelobjekte und testen Sie die Methode.

  Die Ausgabe des Programms sieht dann z.B. folgerndermassen aus:
    SC123-F "DUFFY MALT Whisky" EK: 10.0 VK: 19 Euro Lagerzeit: 3 Monate
    SC347-A "GLEN MORANGIE MALT Whisky" EK: 55.0 VK: 104 Euro Lagerzeit: 15 Monate
 */
class ArtikelTester{

    public static void main(String args[]){

        Artikel artikelA = new Artikel("SC123-F","DUFFY MALT Whisky", 10, 3);
        Artikel artikelB = new Artikel("SC347-A", "GLEN MORANGIE MALT Whisky", 55, 15);

        artikelA.anzeigen();
        artikelB.anzeigen();

    }

}
