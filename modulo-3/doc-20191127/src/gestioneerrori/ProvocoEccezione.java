package gestioneerrori;

public class ProvocoEccezione {

	public static void main(String[] args) {
		System.out.println("prima");
		
		if (System.currentTimeMillis() % 2 == 0) 
			throw new RuntimeException();
		
		System.out.println("dopo");
	}

}
