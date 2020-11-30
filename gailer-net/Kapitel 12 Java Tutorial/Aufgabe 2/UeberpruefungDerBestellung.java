/*Schreiben Sie ein Programm,
 *das den Anwender nach der Anzahl der Schrauben, Muttern und Unterlegscheiben fragt
 *und dann den Gesamtbetrag berechnet und ausgibt.
 *
 *Zusaetzlich ueberprueft das Programm die Bestellung.
 *Es ist normalerweise ein Fehler, wenn mehr Schrauben als Muttern bestellt werden.
 *In diesem Fall gibt das Programm die Meldung aus "Kontrollieren Sie Ihre Bestellung!".
 *Andernfalls gibt das Programm aus "Die Bestellung ist okay."
 *In jedem Fall wird der Gesamtbetrag ausgegeben.
 *
 *Verwenden Sie fuer die Artikelpreise Konstanten.
 *Deklarieren Sie in Ihrem Programm etwas wie final int SCHRAUBENPREIS = 5; usw..
 *
 *Wenn mehr Schrauben als Mutter -> Fehler
 *Wenn nicht -> "Die Bestelung ist okay"
 *Der Gesamtbetrag wird immer ausgegeben*/

 import java.util.Scanner;

 class UeberpruefungDerBestellung {

 	public static void main(String[] args) {

 		final int SCHRAUBEPREIS = 5;
 		final int MUTTERPREIS = 3;
 		final int UNTERLEGSCHEIBEPREIS = 1;

 		int Schrauben, Muttern, Unterlegscheiben, Gesamtbetrag;

 		Scanner s = new Scanner(System.in);

 		System.out.println("Anzahl der Schrauben:");
 		Schrauben = s.nextInt();
 		System.out.println("Anzahl der Muttern:");
 		Muttern = s.nextInt();
 		System.out.println("Anzahl der Unterlegscheiben:");
 		Unterlegscheiben = s.nextInt();

 		System.out.println();

 		if(Schrauben > Muttern){
 			System.out.println("Kontrollieren Sie Ihre Bestellung!");
 			System.out.println("Sie haben mehr Schrauben als Muttern bestellt. Ist das gewollt?");
 		} else {
 			System.out.println("Die Bestellung ist okay.");
 		}

 		System.out.println();

 		Gesamtbetrag = (Schrauben * SCHRAUBEPREIS) + (Muttern * MUTTERPREIS) + (Unterlegscheiben * UNTERLEGSCHEIBEPREIS);
 		System.out.println("Gesamtbetrag: " + Gesamtbetrag);
 	}
 }
