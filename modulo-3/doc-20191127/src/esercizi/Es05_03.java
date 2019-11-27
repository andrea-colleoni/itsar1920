package esercizi;


public class Es05_03 {

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int n = s.nextInt();
		
		// ogni iterazione stampo una riga del triangiolo di asterischi
		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
