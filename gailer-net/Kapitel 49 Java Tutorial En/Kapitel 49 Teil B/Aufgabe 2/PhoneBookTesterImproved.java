/*Kapitel 49 Teil B Aufgabe 2
  Matthias Korte

  Modifizieren Sie die PhoneEntry Klasse so das it firstName, lastName und phone beinhaltet.
  Jetzt fragt das Programm fuer beide Namen.
  Wenn der Benutzer nur den Nachnamen eingibt, gibt das Programm jeden aus der diesen Namen beinhaltet.
  Wenn der Benutzer Vor- und Nachnamen eingibt, gibt das Programm den ersten Treffer aus und stoppt dann.

  Fuege ausserdem weitere Namen und Nummern dem Array hinzu.
*/

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

    PhoneEntry[] phoneBook;

    //Konstruktor
    PhoneBook(){
        phoneBook = new PhoneEntry[ 6 ] ;
        phoneBook[0] = new PhoneEntry("James", "Barclay", "(418)665-1223");
        phoneBook[1] = new PhoneEntry("Grace", "Dunbar", "(860)399-3044");
        phoneBook[2] = new PhoneEntry("Paul", "Kratides", "(815)439-9271");
        phoneBook[3] = new PhoneEntry("Violet", "Smith", "(312)223-1937");
        phoneBook[4] = new PhoneEntry("John", "Wood", "(913)883-2874");
        phoneBook[5] = new PhoneEntry("Anna", "Wood", "(913)883-2874");
    }

    //linear search
    PhoneEntry search(String targetFirstName, String targetLastName){

        if(!targetFirstName.isEmpty() && !targetLastName.isEmpty()){
            System.out.println("Beide");
            for(int i = 0; i < phoneBook.length; i++){
                if(phoneBook[i].FirstName.toUpperCase().equals(targetFirstName.toUpperCase()) && phoneBook[i].LastName.toUpperCase().equals(targetLastName.toUpperCase())){
                    return phoneBook[i];
                }
            }

        return null;

        }else if(!targetFirstName.isEmpty()){
            System.out.println("Erste");
            for(int i = 0; i < phoneBook.length; i++){
                if(phoneBook[i].FirstName.toUpperCase().equals(targetFirstName.toUpperCase())){
                    return phoneBook[i];
                }
            }

            return null;

        }else if(!targetLastName.isEmpty()){
            System.out.println("Zweite");
            for(int i = 0; i < phoneBook.length; i++){
                if(phoneBook[i].LastName.toUpperCase().equals(targetLastName.toUpperCase())){
                    return phoneBook[i];
                }
            }

            return null;

        }

        return null;
    }
}

class PhoneBookTesterImproved{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        String userInputFirstN;
        String userInputLastN;

        PhoneBook pb = new PhoneBook();
        PhoneEntry userEntry;

        //suche nach userInput
        System.out.print("Last name? ");
        userInputLastN = s.nextLine();
        System.out.print("First name? ");
        userInputFirstN = s.nextLine();

        userEntry= pb.search(userInputFirstN, userInputLastN);

        //TODO : Textausgabe bei quit eingabe
        if(userEntry != null){
            System.out.println(userEntry.FirstName + " " + userEntry.LastName + ": " + userEntry.phone);
        }else{
            System.out.println("Name not found");
        }

        System.out.println("Goodbye");

    }
}
