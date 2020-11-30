import java.util.Scanner;

class Sterne{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int higrure = 1, higrure2 = 1;  //row i
        int n;
        int row = 1;

        System.out.println("Geben Sie die Sterne ein:");
        n = scan.nextInt();

        higrure = n;

        while(row < higrure){

            while(higrure2 <= n){
                System.out.print("*");
                higrure2++;
            }

			higrure2 = 0;
            n = n-1;
            row++;
            System.out.println();

        }

    }
}
