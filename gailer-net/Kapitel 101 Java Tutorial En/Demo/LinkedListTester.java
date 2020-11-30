/*Kapitel 101 Seite 8
  Matthias Korte
*/

//TODO

import java.util.*;

public class LinkedListTester{

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        Random rnd = new Random();

        LinkedList list = new LinkedList();

        System.out.println("How many nodes?");
        int numNodes = s.nextInt();

        f(int i = 0; i < numNodes; i++){
            list.insertFirst(rand.nextInt(100));
        }

        list.traverse();

    }

}
