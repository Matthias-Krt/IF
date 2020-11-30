/*Kapitel 49 Teil B Aufgabe 3
  Matthias Korte

  Modifizieren Sie das Programm so das es mit einem Array umgehen kann
  das null in einigen Zellen hat.
  Das Programm soll dem Benutzer jetzt drei Auswahlmoeglichkeiten hat.
    1. Search (suche nach einem Namen)
    2. Add (fuege einen neuen Namen und Nummer dem Array hinzu)
    3. Delete (loesche einen Namen (und die Nummer) von dem Array)

  Um einen neuen Namen und Nummer dem Array hinzufuegen, suche zuerst nach einer Zelle,
  welche null enthaelt.
  Dann konstruiere ein neues PhoneEntry Objekt und ordne es der Zelle zu.
  Wenn keine Zelle null enthaelt gebe einen error (aber schliesse das Programm nicht).

  (Einfache Methode:) Um einen Namen und Nummer aus dem Array zu loeschen, finde zuerst die Zelle,
  dann ordne der Zelle null zu.

  (Bessere Methode:) Das Array kann jetzt mit einem Array umgehen, welches null enthaelt,
  diese koennen durch das Array verteilt sein.
  Es ist besser das Array zu organisieren, so das alle nulls zusammen am Ende stehen.
  Dann signalisiert die erste null das Ende der nutzvollen Werte und beendet die Suche.
  Um einen Namen und Nummer zu loeschen von so einem Array zu loeschen, finde zuerst die Namenszelle.
  Wenn keine Zelle den Namen enthaelt gebe einen Error aus.
  Dann kopiere die Referenz in die letzte non-null Zelle und loesche die Namenszelle.
  Setze die letzte non-null Zelle auf null.
*/

//TODO: 

import java.util.Scanner;

class PhoneEntry{

    String FirstName;
    String LastName;
    String phone;

    PhoneEntry(String firstN, String lastN, String p){
        FirstName = firstN;
        LastName = lastN;
        phone = p;
    }
}

class PhoneBook{

    //PhoneBook size
    final int PBSIZE = 5;

    PhoneEntry[] phoneBook;

    //Konstruktor
    PhoneBook(){
        phoneBook = new PhoneEntry[PBSIZE] ;
/*
        for(int i = 0; i < phoneBook.length; i++){
            phoneBook[i] = new PhoneEntry(null,null,null);
        }
*/
        phoneBook[0] = new PhoneEntry("James", "Barclay", "(418)665-1223");
        phoneBook[1] = new PhoneEntry("Grace", "Dunbar", "(860)399-3044");
        phoneBook[2] = new PhoneEntry("Paul", "Kratides", "(815)439-9271");
        phoneBook[3] = new PhoneEntry("Violet", "Smith", "(312)223-1937");
        phoneBook[4] = new PhoneEntry("John", "Wood", "(913)883-2874");
    }

    //linear search
    PhoneEntry search(String targetFirstName, String targetLastName){

        if(!targetFirstName.isEmpty() && !targetLastName.isEmpty()){
            for(int i = 0; i < phoneBook.length; i++){
                if(phoneBook != null && phoneBook[i].FirstName.toUpperCase().equals(targetFirstName.toUpperCase()) && phoneBook[i].LastName.toUpperCase().equals(targetLastName.toUpperCase())){
                    return phoneBook[i];
                }
            }

            return null;

        }else if(!targetFirstName.isEmpty()){
            for(int i = 0; i < phoneBook.length; i++){
                if(phoneBook[i].FirstName.toUpperCase().equals(targetFirstName.toUpperCase())){
                    return phoneBook[i];
                }
            }

            return null;

        }else if(!targetLastName.isEmpty()){
            for(int i = 0; i < phoneBook.length; i++){
                if(phoneBook[i].LastName.toUpperCase().equals(targetLastName.toUpperCase())){
                    return phoneBook[i];
                }
            }

            return null;

        }

        return null;
    }

    PhoneEntry add(String FirstName, String LastName, String Number){

        boolean emptyCell = false;

        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i] == null){
                emptyCell = true;
                break;
            }
        }

        if(emptyCell == true){
            for(int i = 0; i < phoneBook.length; i++){
                if(phoneBook[i] == null){
                    phoneBook[i] = new PhoneEntry(FirstName, LastName, Number);
                }
            }
        }else{
            System.out.println("\nERROR: NO EMPTY CELL\n");
        }

        return null;
    }

    PhoneEntry del(String FirstName, String LastName){

        int indexDel = 0;
        int indexMov = 0;

        //index vom Kontakt bekommen
        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i].FirstName.toUpperCase().equals(FirstName.toUpperCase()) && phoneBook[i].LastName.toUpperCase().equals(LastName.toUpperCase())){
                indexDel = i;
            }else{
                System.out.println("\nERROR: CONTACT NOT FOUND");
            }
        }

        //index von letzter belegter Stelle bekommen
        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i].FirstName == null && phoneBook[i].LastName == null && phoneBook[i].phone == null){
                indexMov = i - 1;
            }else{
                indexMov = phoneBook.length;
            }
        }

        if(phoneBook[indexDel] != null){
            phoneBook[indexDel] = phoneBook[indexMov];
            phoneBook[indexMov] = null;
        }

        return null;
    }
}

class PhoneBookTesterAddDelNum{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        String userInput;
        String userInputFirstName;
        String userInputLastName;
        String userInputNumber;

        PhoneBook pb = new PhoneBook();
        PhoneEntry userEntry;

        System.out.println("+++++ Phonebook +++++");
        System.out.println("Menu: \n\t1. Search for a contact \n\t2. Add a new Contact \n\t3. Delete a contact\n\tquit");

        //wird solange wiederholt bis der Nutzer "quit" eingibt
        do {

            System.out.print("\nWhat do you want to do? ");
            userInput = s.nextLine();

            switch(userInput) {
                case "1":
                    System.out.println("\n+++ Search +++");

                    System.out.print("\tLast name? ");
                    userInputLastName = s.nextLine();
                    System.out.print("\tFirst name? ");
                    userInputFirstName = s.nextLine();

                    userEntry = pb.search(userInputFirstName, userInputLastName);

                    if(userEntry != null){
                        System.out.println(userEntry.FirstName + " " + userEntry.LastName + ": " + userEntry.phone);
                    }else{
                        System.out.println("ERROR: NAME NOT FOUND");
                    }

                break;
                case "2":
                    System.out.println("\n+++ Add Contact +++");

                    //wird solange wiederholt bis Benutzer zustimmt
                    do {
                        System.out.print("\tFirst name: ");
                        userInputFirstName = s.nextLine();
                        System.out.print("\tLast name: ");
                        userInputLastName = s.nextLine();
                        System.out.print("\tNumber: ");
                        userInputNumber = s.nextLine();

                        System.out.print("\n\nDo you want to add: " + userInputFirstName + " " + userInputLastName + " " + userInputNumber + " ? (y/n)");
                        userInput = s.nextLine();
                    } while (!userInput.equals("y"));

                    userEntry = pb.add(userInputFirstName, userInputLastName, userInputNumber);

                break;
                case "3":
                    System.out.println("\n+++ Delete Contact +++");

                    //wird solange wiederholt bis Benutzer zustimmt & bis ein Kontakt gefunden wurde
                    do {

                        do {
                            System.out.print("\tFirst name: ");
                            userInputFirstName = s.nextLine();
                            System.out.print("\tLast name: ");
                            userInputLastName = s.nextLine();

                            System.out.print("\n\nDo you want to delete: " + userInputFirstName + " " + userInputLastName + " " + " ? (y/n)");
                            userInput = s.nextLine();
                        } while (!userInput.equals("y"));

                        //pruefen ob Kontakt vorhanden ist
                        userEntry = pb.search(userInputFirstName, userInputLastName);

                        if(userEntry != null){
                            userEntry = pb.del(userInputFirstName, userInputLastName);
                        }else{
                            System.out.println("ERROR: CONTACT NOT FOUND");
                        }

                    } while (userEntry == null);



                break;
                case "quit":
                    System.out.println("\nGoodbye");
                break;

                default: System.out.println("ERROR: UNKNOWN COMMAND");
            }

        } while (!userInput.equals("quit"));

    }
}
