/*Kapitel 43 Aufgabe 1
  Matthias Korte

  Schreiben Sie eine Programm das die Anzahl an
  Konsonanten, Vokale, Punkte, Satzzeichen und Leerzeichen
  einer Eingabe bestimmt.
*/

import java.util.Scanner;

class CharacterCounter{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        char aktiv;

        int aKon = 0, aVok = 0; //Anzahl Konsonanten und Vokale
        int aPkt = 0, aSz = 0;  //Anzahl Punkte und Sonderzeichen
        int aLz = 0, aZ = 0;    //Anzahl Leerzeichen und Zahlen
        int aUk = 0;            //Anzahl undefinierte Zeichen

        String input;
        int inputLength;

        System.out.println("Geben Sie einen Satz ein.");
        input = s.nextLine();

        inputLength = input.length();

        //jeder Buchstabe des Strings wird durchlaufen
        for(int i = 0; i < inputLength; i++ ){

            aktiv = input.charAt(i);

            switch(aktiv){
            //Vokale
                case 'a' : case 'A' :
                case 'e' : case 'E' :
                case 'i' : case 'I' :
                case 'o' : case 'O' :
                case 'u' : case 'U' :
                //case '�' : case '�' :
                //case '�' : case '�' :
                //case '�' : case '�' :
                    aVok++;
                    break;
            //Konsonanten
                case 'b' : case 'B' :
                case 'c' : case 'C' :
                case 'd' : case 'D' :
                case 'f' : case 'F' :
                case 'g' : case 'G' :
                case 'h' : case 'H' :
                case 'j' : case 'J' :
                case 'k' : case 'K' :
                case 'l' : case 'L' :
                case 'm' : case 'M' :
                case 'n' : case 'N' :
                case 'p' : case 'P' :
                case 'q' : case 'Q' :
                case 'r' : case 'R' :
                case 's' : case 'S' :
                case 't' : case 'T' :
                case 'v' : case 'V' :
                case 'w' : case 'W' :
                case 'x' : case 'X' :
                case 'y' : case 'Y' :
                case 'z' : case 'Z' :
                //case 'ß' :
                    aKon++;
                    break;
            //Zahlen
                case '1' :
                case '2' :
                case '3' :
                case '4' :
                case '5' :
                case '6' :
                case '7' :
                case '8' :
                case '9' :
                case '0' :
                    aZ++;
                    break;
            //Punkt
                case '.' :
                    aPkt++;
                    break;
            //Sonderzeichen
                case ',' : case ';' :
                case ':' : case '-' :
                case '_' : case '#' :
                case '+' : case '*' :
                case '<' : case '>' :
                case '@' : case '"' :
                case '!' :
                case '$' : case '%' :
                case '&' : case '/' :
                case '(' : case ')' :
                case '=' : case '?' :
                    aSz++;
                    break;
            //Leerzeichen
                case ' ':
                    aLz++;
                    break;
            //nicht definierte Zeichen
                default:
                    aUk++;
            }

        }

        System.out.println("Konsonanten: " + aKon);
        System.out.println("Vokale: " + aVok);
        System.out.println("Punkte: " + aPkt);
        System.out.println("Satzzeichen: " + aSz);
        System.out.println("Leerzeichen: " + aLz);
        System.out.println("Zahlen: " + aZ);
        System.out.println("Unknown: " + aUk);

    }

}
