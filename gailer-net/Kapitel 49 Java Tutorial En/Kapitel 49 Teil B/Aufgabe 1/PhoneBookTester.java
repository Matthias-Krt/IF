/*Kapitel 49 Teil B Aufgabe 1
  Matthias Korte

  Modifizieren Sie das Programm so das es den Nutzer fragt, welche Person er nachschlagen moechte.
    Name? Violet Smith
    The number is: (312) 223-1937

    Name? quit
    good-by

  Natuerlich muss der Benutzer den Namen exakt eingeben um die zusammenpassende Nummer zu finden.
  Um es etwas einfacher zu machen, nutze die toUpperCase() Methode der String Klasse um den Zielnamen
  und jeden Array Namen zu Grossbuchstaben zu konvertieren, wenn die Gleichheit getestet wird.
*/

import java.util.Scanner;

class PhoneEntry{

    String name;
    String phone;

    PhoneEntry(String n, String p){
        name = n;
        phone = p;
    }
}

class PhoneBook{

    PhoneEntry[] phoneBook;

    //Konstruktor
    PhoneBook(){
        phoneBook = new PhoneEntry[ 5 ] ;
        phoneBook[0] = new PhoneEntry("James Barclay", "(418)665-1223");
        phoneBook[1] = new PhoneEntry("Grace Dunbar", "(860)399-3044");
        phoneBook[2] = new PhoneEntry("Paul Kratides", "(815)439-9271");
        phoneBook[3] = new PhoneEntry("Violet Smith", "(312)223-1937");
        phoneBook[4] = new PhoneEntry("John Wood", "(913)883-2874");
    }

    //linear search
    PhoneEntry search(String targetName){

        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i].name.toUpperCase().equals(targetName.toUpperCase())){
                return phoneBook[i];
            }
        }

        return null;

    }
}

class PhoneBookTester{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        String userInput;

        PhoneBook pb = new PhoneBook();
        PhoneEntry userEntry;

        //suche nach userInput
        do {
            System.out.print("Name? ");
            userInput = s.nextLine();
            userEntry= pb.search(userInput);

            //TODO: Textausgabe bei quit eingabe
            if(userEntry != null){
                System.out.println(userEntry.name + ": " + userEntry.phone);
            }else{
                    System.out.println("Name not found");
            }

        } while (!userInput.equals("quit"));

        System.out.println("Goodbye");

    }
}
