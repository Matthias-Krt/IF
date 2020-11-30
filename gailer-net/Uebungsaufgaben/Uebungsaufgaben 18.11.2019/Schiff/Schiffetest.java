public class Schiffetest
{
	public static void main(String args[]){

		//Schiff
		Schiff boot_1 = new Schiff();
		boot_1.fahren(80);

		Schiff boot_2 = new Schiff("Orange");
		boot_2.fahren(30);

		Schiff boot_3 = new Schiff("Rot", 50);
		boot_3.fahren();
		System.out.println("Das Schiff hat die Farbe "+ boot_3.Farbe +".");

		//Motorboot
		Motorboot moboot_1 = new Motorboot();
		moboot_1.fahren(60);

		Motorboot moboot_2 = new Motorboot("Schwarz");
		moboot_2.fahren(40);

		Motorboot moboot_3 = new Motorboot("Blau", 60);
		moboot_3.fahren();
		
	}
}
