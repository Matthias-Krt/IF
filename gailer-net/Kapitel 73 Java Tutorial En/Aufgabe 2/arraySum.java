/*Kapitel 73 Aufgabe 2
  Matthias Korte

  Defenition der Summe der Elemente in einem Integer Array:
    sum(array, index) = 0, if index == array.length
    sum(array, index) = array[index] + sum(array, index+1), if index < array.length

  Schreiben Sie eine Java Methode die diese Definition implimentiert und ein Programm, welches die Mehtode testet.
  Die Methode sollte so aussehen:
    int sum(int[] array, int index){...}
*/

class arraySum{

    int sum(int[] arr, int i){
        if(i == arr.length){
            return 0;
        }else{
            return arr[i] + sum(arr, i + 1);
        }
    }

}

class arrayTester{

    public static void main(String args[]){

        int[] testArray = {1, 4, 5, 10, 3, 3, 5};   //sum = 31

        arraySum as = new arraySum();
        int result = as.sum(testArray, 0);

        System.out.println("Result: " + result);

    }

}
