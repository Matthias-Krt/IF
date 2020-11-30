/*Kapitel 81 Aufgabe 1
  Matthias Korte

  Schreiben Sie eine Test Klasse "TestTrace" die die static main() Methode,
  und eine andere Klasse "CallEg" die drei Methoden beinhaltet.
  Die main() Methode erstellt ein CallEg Objekt und ruft die MethodeA auf().

  Der catch{}-Block in der main() gibt die Fehlermeldung aus.

    1.  Teilen Sie in methodA() durch 0, so das es eine ArithmeticException. ausgibt.
        Beobachten Sie die Ausgabe.
    2.  Entfernen Sie nun wieder das teilen durch 0.
        Ersetzen Sie die methodA() so das die methodB() aufruft und diese dann methodC().
        Schreiben Sie in methodC() wieder ein Statement, welches durch 0 teilt.
        Beobachten Sie die Ausgabe.
    3.  Fuegen Sie dem Code hinzu das methodA() methodB() im try{}-Block aufruft,
        und methodB() ruft methodC() im try{}-Block auf.
        In methodC() schreiben sie das durch 0 teilen Statement in ein try[]-Block
        und ein catch{}-Block der den Fehler faengt und den stack trace ausgibt,
        und an seinen Caller zurueck gibt.
        Beobachten Sie die Ausgabe.
*/

//TODO 3

class CallEg{

    public void methodA() throws ArithmeticException{
        /* ### 1 ###
        int num = 671;
        int div = 0;    //divide by 0

        int result = num / div;

        System.out.println(result);
        */

        /* ### 2 ###
        methodB();
        */

        try {
            methodB();
        } catch(Exception e) {

        }
    }

    public void methodB() throws ArithmeticException{
        /* ### 2 ###
        methodC();
        */

        try {
            methodC();
        } catch(Exception e) {

        }
    }

    public void methodC() throws ArithmeticException{
        /* ### 2 ###
        int num = 671;
        int div = 0;    //divide by 0

        int result = num / div;

        System.out.println(result);
        */

        try {
            int num = 671;
            int div = 0;    //divide by 0

            int result = num / div;

            System.out.println(result);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}

class TestTrace{

    public static void main(String args[]){

        CallEg eg = new CallEg();

        try {
            eg.methodA();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
