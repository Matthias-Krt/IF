/*Kapitel 72 Aufgabe 2
  Matthias Korte

  Nehmen Sie an das weibliche Hasen nur 4 Monate leben. Modifizieren Sie die Fibonacci Serie fuer die sterbenden Hasen.
  Implementieren Sie die neue Serie in einer Java Methode.

  Zeichnen Sie zuerst einen Graphen der die Population jeden Monat zeigt.
*/

//TODO

class rabbitFibonacci{

    public int fib(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
}

class rabbitTester{

    public static void main(String args[]){

        int arg = Integer.parseInt(args[0]);    //get n from the command line

        rabbitFibonacci rf = new rabbitFibonacci();
        int result = rf.fib(arg);

        System.out.println("fib(" + arg + ") is " + result);

    }
}
