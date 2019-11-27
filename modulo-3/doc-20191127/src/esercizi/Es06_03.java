package esercizi;

import java.util.Scanner;

public class Es06_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dimensione = 5;
		Integer[] interi = new Integer[dimensione];
		
		for(int i = 0; i < dimensione; i++) {
			System.out.print("Inserisci il " + (i + 1) + "° numero: ");
			interi[i] = s.nextInt();
		}
		System.out.print("Inserisci il sesto numero: ");
		Integer sesto = s.nextInt();
		s.close();
		int conteggio = 0;
		for(int i = 0; i < dimensione; i++) {
			// boolean contenuto = interi[i].toString().contains(sesto.toString());
			if (interi[i].toString().indexOf(sesto.toString()) == 0) {
				System.out.println(interi[i] + " inizia con " +  sesto);
				conteggio++;
			}
		}
		System.out.println("Ho trovato " + conteggio  + " numeri che iniziano con " + sesto);
	}

}
