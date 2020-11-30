class StringDemo3 {
	
	public static void main(String[] args) {
		
		String erster = new String("	In einem Loch	in der Erde, da lebte ein Hobbit.	");
		String zweiter;
		
		zweiter = erster.trim();
		
		System.out.println("Original:");
		System.out.println(erster);
		System.out.println("Trim-Version:");
		System.out.println(zweiter);
		
		/*Schreiben Sie ein Programm (oder modifizieren Sie das vorherige), 
		 *das einen String erzeugt, indem es trim() eines ursprünglichen Strings aufruft. 
		 *Geben Sie beide Strings auf den Bildschirm aus. 
		 *Experimentieren Sie mit Leer- und Tab-Zeichen, um festzustellen, was vom Original entfernt wird. */
		
	}
	
}