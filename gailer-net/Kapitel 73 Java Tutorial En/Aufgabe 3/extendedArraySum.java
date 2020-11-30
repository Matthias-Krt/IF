/*Kapitel 73 Aufgabe 3
  Matthias Korte

  Verbessern Sie das vorherige Programm, indem Sie die Definition der Summe erweitern.
    sum(array)  =   sum(array, 0)
    sum(array, index) = 0, if index == array.length
    sum(array, index) = array[index] + sum(array, index+1), if index < array.length

  Um dies zu implimentieren, schreiben Sie eine zweite Methode: sum(int[] array) die die erste Methode ueberlaedt.
  Das Testprogramm ruft: sum(testArray) auf.
*/

class extendedArraySum{

    int sum(int[] arr){
        return sum(arr, 0);
    }

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

        extendedArraySum as = new extendedArraySum();
        int result = as.sum(testArray);

        System.out.println("Result: " + result);

    }

}
