 import java.util.Scanner;
 import java.util.Random;

 class FantasySpielVers2{

 	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double staerke, Leben, glueck;
        String CharakterName = " ";

        boolean w = false;
        String input;

        while(w == false){
            System.out.println("Geben Sie Ihren Charakternamen ein: ");
            CharakterName = s.nextLine();
            System.out.println("Moechten Sie wirklich " + CharakterName + " genannt werden? [ja = j | nein = n] ");
            input = s.nextLine();

            if(input.equals("j")) {
                w = true;
                System.out.println("Gut, ich nenne dich jetzt " + CharakterName);
            }else{
                w = false;
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Seid gegruesst " + CharakterName + " gut das ich dich treffe, es ist ein neuer Ganove aufgetaucht und moechte die Stadt zerstoeren.");
        System.out.println("Moechtest du ueberhaupt gegen ihn kaempfen? [ja = j | nein = n] ");
        input = s.nextLine();

        if(input.equals("j")){

            Random rnd = new Random();

            double EnemyStaerke, EnemyLeben, EnemyGlueck;
            String[] EnemyNames = {"Kevin", "Guenther", "Werner", "Manfred"};

            int i = rnd.nextInt(EnemyNames.length);

            System.out.println();
            System.out.println("Gut, du kaempst gegen " + EnemyNames[i]);

			

        }else{
            System.out.println("Lass dich nie wieder hier blicken du ehrenloser Gnom!");
        }

 	}
 }
