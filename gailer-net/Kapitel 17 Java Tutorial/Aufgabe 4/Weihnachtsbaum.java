/*Kapitel 17 Aufgabe 4
 *Matthias Korte
 *
 *Schreiben Sie ein Programm,
 *das einen Baum aus Sternen auf den Bildschirm ausgibt:
 *     	   *
	      ***
	     *****
	    *******
	   *********
	  ***********
	 *************
	***************
	      ***
	      ***
	      ***				*/

class Weihnachtsbaum{

	public static void main(String[] args){

	int lz,i = 1, anzahlRows, row = 1, Sterne = 1, j = 1;

	 	lz = 7;		//Leerzeichen

	 	anzahlRows = lz;

	 	//Tanne (Dreieck)
	 	while(row <= anzahlRows){
	 		//Leerzeichen
	 		while(i<=lz){
	 			System.out.print(" ");
	 			i++;
	 		}
	 		//Sterne
	 		while(j<=Sterne){
	 			System.out.print("*");
	 			j++;
	 		}
	 		//neue Reihe
	 		System.out.println();
	 		i=1;	
	 		j=1;
	 		lz = lz -1;
	 		Sterne = Sterne+2;
	 		row++;

	 	}

	 	//Stamm
	 	row = 1;
	 	anzahlRows = 3;
	 	lz = 6;
	 	i = 1;
	 	Sterne = 3;
	 	j = 1;

	 	while(row <= anzahlRows){
	 		//Leerzeichen
	 		while(i<=lz){
	 			System.out.print(" ");
	 			i++;
	 		}
	 		//Sterne
	 		while(j<=Sterne){
	 			System.out.print("*");
	 			j++;
	 		}
	 		//neue Reihe
	 		System.out.println();
	 		i=1;
	 		j=1;
	 		row++;

	 	}

	}
}
