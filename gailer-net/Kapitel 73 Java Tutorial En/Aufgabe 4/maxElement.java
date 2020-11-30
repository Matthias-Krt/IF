/*Kapitel 73 Aufgabe 4
  Matthias Korte

  Schreiben Sie Ihre eigene rekursive Definition fuer das maximum Element in einem Integer Array.
  Dann implimentieren Sie Ihre Definition in einer Java Methode
  und testen Sie es mit einem Testprogramm.
*/

class maxElement{

    int max(int[] arr){
        return max(arr, 1, arr[0]);
    }

    int max(int[] arr, int i, int maxVal){
        if(i == arr.length){
            return maxVal;
        }else{
            if(maxVal < arr[i]){
                maxVal = arr[i];
                return max(arr, i+1, maxVal);
            }else{
                return max(arr, i+1, maxVal);
            }
        }
    }

}

class maxTester{

    public static void main(String args[]){

        int[] testArr = {2, 4, 1, 7, 10, 5, 6};

        maxElement me = new maxElement();
        int maxVal = me.max(testArr);

        System.out.println("Max-Value: " + maxVal);

    }

}
