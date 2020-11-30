class CreateStringObj {
	public static void main(String[] args){

		String str1;
		int laenge;

		str1 = new String("Hello World!");
		System.out.println(str1);

		laenge = str1.length();
		System.out.println("Die Laenge betr�gt: " + laenge);

		String sub = str1.substring(8);	//Ab dem 9 Charakter wird der String bis zum Schluss ausgegeben | Die Chars werden ab 0 gez�hlt
		System.out.println(sub);
	}
}
