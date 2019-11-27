package esercizi;

import java.util.Scanner;

public class Es07_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci la base: ");
		int base = s.nextInt();
		System.out.print("Inserisci l'altezza: ");
		int altezza = s.nextInt();
		
		for(int riga = 1; riga <= altezza; riga++) {
			for(int colonna = 1; colonna <= base; colonna++) {
				if(riga == 1 || riga == altezza || colonna == 1 || colonna == base) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		s.close();
	}

}
