import java.util.*;

class Test{

    public static void main(String[] args){


            String input = "eins zwei";

            String[] parts = input.split(" ");
            System.out.println(parts[1]);

            int index = input.indexOf(" ");
            System.out.println(input.substring(index+1, input.length()));

    }
}
