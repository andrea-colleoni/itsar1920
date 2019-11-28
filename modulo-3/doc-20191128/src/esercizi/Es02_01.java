package esercizi;

public class Es02_01 {

	public static void main(String[] args) {
		String b = "-black-";
		String w = "-white-";
		
		for(int riga = 0; riga < 8; riga++) {
			for(int colonna = 0; colonna < 8; colonna++) {
				System.out.print((riga % 2 == colonna % 2) ? w : b);
			}
			System.out.println();
		}

	}

}
