/*Kapitel 81 Aufgabe 2
  Matthias Korte

  Modifizieren Sie den Code der vorherigen Aufgabe so das Sie eine TestTrace Klasse
  und 3 Klassen CallEgA, CallEgB, CallEgC haben. Klasse CallEgA hat eine Methode
  die ein CallEgB Objekt erstellt und dessen Methode aufruft.
  Klasse CallEgB hat eine Methode die ein CallEgC Objekt erstellt und dessen Methode aufruft.
  Die Methode CallEgC dividiert durch 0.
*/

//TODO

class CallEgA{

    method(){
        CallEgB egB = new CallEgB();

        egB.method();
    }

}

class CallEgB{

    method(){
        CallEgC egC = new CallEgC();

        egC.method();
    }

}

class CallEgC{

    method(){
        CallEgC egC = new CallEgC();

        egC.method();
    }

}

public static void main(String args[]){

    CallEgA eg = new CallAgA(); //use default constructor

    try {
        eg.method();
    } catch(ArithmeticException aEx) {
        aEx.printStackTrace();
    }

}
