class Bsp{

    public static void main(String args[]){

        System.out.println("while-Schleife");
        int i = 0;
        int j = 8;

        while(i < j){
            System.out.println("i: " + i);
            i++;
        }

        System.out.println("\nfor-Schleife");
        for(i = 0; i < j; i++){
            System.out.println("i: " + i);
        }

        System.out.println("\ndoWhile-Schleife");
        i = 0;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < j);

    }
}
