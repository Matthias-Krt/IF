/*Kapitel 72 Aufgabe 3
  Matthias Korte

  Der groesste gemeinsame Teile (greatest common divisor: GCD) von zwei Integern a und b ist der groesste Integer k,
  der a und b teilt.

  Zum Beispiel:
    GCD(6, 9) == 3, weil 3 beide Zahlen glatt teilt und keine groessere Zahl das tut.
    GCD(25, 55) == 5

  Mathematische Definition:
    GCD(0, n) = n
    GCD(a, b) = GCD(b%a, a)

  Zum Beispiel:
    GCD(6, 9) = GCD(9%6, 6) = GCD(3, 6)
    GCD(3, 6) = GCD(6%3, 3) = GCD(0, 3)
    GCD(0, 3) = 3
*/

class gcd{

    public int GCDCalc(int a, int b){
        if(a == 0){
            return b;
        }else{
            if(a == 0){
                return b;
            }else{
                return GCDCalc(a%b, b);
            }
        }
    }

}

class gcdTester{

    public static void main(String args[]){

        gcd g = new gcd();
        int result = g.GCDCalc(6, 9);

        System.out.println(result);

    }

}
