import java.util.Scanner;

class EchoDemo {
	
  public static void main (String[] args) {
    
    String inData;
    Scanner scan = new Scanner( System.in );

    System.out.println("Geben Sie die Daten ein:");
    inData = scan.nextLine();

    System.out.println("Sie haben eingegeben :" + inData );
    
  }
}