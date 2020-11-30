class StringDemo4{

	public static void main(String[] args) {

		String str = new String( "Golf is a good walk spoiled." ); // erzeuge das originale Stringobjekt

    	String sub = str.substring(8); // erzeuge ein neues Objekt aus dem Original ab dem 8 Zeichen
		String sub0 = str.substring(8, 19); //erzeuge ein neues Objekt aus dem Original von dem 8 Zeichen bis zum 19 Zeichen

		System.out.println(str);
    	System.out.println( sub );
    	System.out.println(sub0);
    	System.out.println();

    	//1. Geben sie beiden Parameter den gleichen Wert
    	String sub1 = str.substring(5, 5);
    	System.out.println(sub1);
    		//Gibt nichts aus

    	//2. Geben Sie dem ersten Parameter den Wert 0 und dem zweitem Parameter den Index des letzten Zeichens
    	String sub2 = str.substring(0, 27);
    	System.out.println(sub2);
    		//Gibt "Gold is a good walk spoiled" aus
    	//3. Anstatt wie oben das Literal zu verwenden, verwenden Sie str.length()-1
    	String sub3 = str.substring(0, str.length()-1);
    	System.out.println(sub3);
    		//Gibt das selbe aus wie 2.

    	//4. verwenden Sie als zweiten Parameter str.length() um einen Substring vom startIndex bis zum Ende zu bekommen
    	String sub4 = str.substring(0, str.length());
    	System.out.println(sub4);
    		//Gibt den ganzen String aus

    	//5. Geben Sie dem ersten Parameter einen negativen Wert
    	//String sub5 = str.substring(-3, 19);
    	//System.out.println(sub5);
    		//String index out of Range

    	//6. Geben Sie dem zweiten Parameter einen Wert der gr��er ist als der String
    	String sub6 = str.substring(0, 38);
    	System.out.println(sub6);
    		//

    	//7. Kehren Sie die Reihenfolge der Parameter um
		String sub7 = str.substring(19, 9);
    	System.out.println(sub7);
	}

}
