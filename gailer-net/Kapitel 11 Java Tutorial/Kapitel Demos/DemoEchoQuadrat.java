import java.util.Scanner;

class EchoQuadrat
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int zahl, quadrat; // zwei int-Variablen deklarieren

    System.out.println("Geben Sie eine Ganzzahl ein:");
    zahl = scan.nextInt();
    quadrat = zahl * zahl ;  // das Quadrat berechnen

    System.out.println("Das Quadrat von " + zahl + " ist " + quadrat);
  }
}