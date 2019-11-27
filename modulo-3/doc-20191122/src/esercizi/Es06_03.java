package esercizi;

public class Es06_03 {

	public static void main(String[] args) {
		int[] interi = { 5, 15, 45, 79, 125 };
		int sesto = 7;
		
		for(int n : interi) {
			if (String.valueOf(n).indexOf(String.valueOf(sesto)) == 0) {
				System.out.println(n);
			}
		}
		
	}

}
