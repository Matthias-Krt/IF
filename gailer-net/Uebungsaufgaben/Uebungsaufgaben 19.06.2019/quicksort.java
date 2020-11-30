class quicksort{

    public static void quick(int[] feld, int l, int r){
        int i = l;
        int j = r;
        int vgl;

        vgl = feld[(l+r) >> 1];

        do {
            while(feld[i] < vgl){
                i++;
            }
            while(vgl < feld[j]){
                j--;
            }

            if(i <= j){
                int temp = feld[j];
                feld[j] = feld[i];
                feld[i] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if(l < j){
            quick(feld, l, j);
        }
        if(i < r){
            quick(feld, i, r);
        }
    }

    //print function
    static void print(int[] data){
        for(int i = 0; i < data.length; i++){
                System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        int[] arr = {7, 3, 99, 1, 6, 9};

        quick(arr, 0, arr.length - 1);

    }
}
