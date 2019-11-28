package esercizi;

public class Es03_01 {

	public static void main(String[] args) {
		String s = "DIAGONALLY";
		
		int spazi = 0;
		for(char c : s.toCharArray()) {
			for(int i = 0; i < spazi; i++)
				System.out.print(" ");
			System.out.println(c);
			spazi++;
		}

	}

}
