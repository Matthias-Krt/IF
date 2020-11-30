//Kapitel 9A Aufgabe 1 - Lohn Programm
 
class Lohn
{
  public static void main ( String[] args )
  {
    long   arbeitsstunden;
    double stundenlohn, steuersatz;
    
    arbeitsstunden = 40;
    stundenlohn = 10.0;
    steuersatz = 0.10;
    
    System.out.println("Arbeitszeit: " + arbeitsstunden );
    System.out.println("Bruttolohn: " + (arbeitsstunden * stundenlohn) );
    System.out.println("Steuerbetrag: " + (arbeitsstunden * stundenlohn * steuersatz) );
  }
}