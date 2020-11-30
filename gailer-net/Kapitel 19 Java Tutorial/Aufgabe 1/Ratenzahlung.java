/*Kapitel 19 Aufgabe 1
 *Matthias Korte
 *
 *Angenommen Sie schulden Ihrer Kreditkartengesellschaft 1000.00$.
 *Die Gesellschaft berechnet Ihnen monatlich 1.5% Zinsen fuer den gewaehrten Kredit.
 *Sie entscheiden sich die Kreditkarte nicht mehr zu verwenden
 *und Ihren Kredit monatlich mit einem bestimmten Betrag n zurueckzuzahlen.
 *
 *Schreiben Sie ein Programm,
 *das nach dem monatlichen Rueckzahlungsbetrag fragt,
 *dann den Saldo und den Gesamtbetrag der Zahlungen fuer jeden Monat ausgibt,
 *bis der Saldo Null oder weniger betraegt.
 *
 *Berechnen Sie die monatlichen Zinsen auf Grund des Saldos.
 *Berechnen Sie dann den neuen Saldo,
 *indem Sie die Zinsen addieren und den zurueckgezahlten Betrag subtrahieren
 *
 *Verbessertes Programm:
 *Lassen Sie das Programm nach dem Anfangssaldo,
 *dem monatlichen Zinssatz und dem Rueckzahlungsbetrag fragen.
 *Wenn der Saldo unter dem Rueckzahlungsbetrag liegt,
 *gibt das Programm die letzte Rate aus, die den Saldo exakt auf 0 bringt.*/

 import java.util.Scanner;

 class Ratenzahlung{

 	public static void main(String[] args){

     	int monat = 1;
     	double n;
        double Saldo = 1000, Zinsen;

     	final double ZINSSATZ = 0.15;

     	Scanner s = new Scanner(System.in);

     	System.out.println("Geben Sie den monatlichen Betrag ein:");
        n = s.nextDouble();;

     	while(Saldo > 0 && monat < 12){
     		Zinsen = Saldo * ZINSSATZ/100;
     		Saldo = Saldo+Zinsen-n;
     		System.out.println("Monat: " + monat + "\t Saldo: " + Saldo + "\t \t Gesamtbetrag: " + n * monat);
     		monat++;
     	}

 	}
 }
