/*Kapitel 26 Aufgabe 1
  Matthias Korte 

Erstellen Sie eine Klasse LiteralTester
und deklarieren Sie vier Stringvariablen str1, str2, str3 und str4.
Erzeugen Sie dann ein Stringliteral "Bo, die Katze"
und weisen Sie dieses Stringliteral den beiden Referenzvariablen str1 und str2 zu.
Erzeugen Sie danach fuer die beiden Referenzvariab1len str3 und str4 mit dem new-Operator
jeweils ein Stringobjekt mit dem Inhalt "Fred, der Hund".

Ueberpruefen Sie anschliessend mit dem == -Operator,
ob die Referenzvariablen str1 und str2 auf dasselbe Objekt verweisen.
Ueberpruefen Sie ebenfalls mit dem == -Operator,
ob die Referenzvariablen str3 und str4 auf dasselbe Objekt verweisen.

Ermitteln Sie die Anzahl der Stringobjekte und geben Sie das Ergebnis auf den Bildschirm aus.
Die Ausgabe des Programms sieht dann folgendermassen aus:
    Es wurden 3 Objekte erzeugt.*/

class LiteralTester{

	public static void main(String[] args){

	    String str1, str2, str3, str4;
	    int x = 0;                      //Objekt Summe

	    str1 = "Bo, die Katze";
	    str2 = "Bo, die Katze";

	    str3 = new String("Fred, der Hund");
	    str4 = new String("Fred, der Hund");

	    if(str1 == str2){
	        x += 1;
	    }else{
	        x += 2;
	    }

	    if(str3 == str4){
	        x += 1;
	    }else{
	        x += 2;
	    }

	    System.out.println("Es wurden " + x + " Objekte erzeugt.");

	}
}
