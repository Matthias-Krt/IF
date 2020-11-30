class bubbleSort{

    public static void bubble (int[] feld){
        for(int i = 1; i < feld.length; i++){
            for(int j = feld.length-1; j >= i; j--){
                if(feld[j] < feld[j-1]){
                    int temp = feld[j];
                    feld[j] = feld[j-1];
                    feld[j-1] = temp;
                }
            }
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

        int[] arr = {5, 2, 14, 14, 6, 8, 3, 75};

        print(arr);
        bubble(arr);
        print(arr);

    }
}
