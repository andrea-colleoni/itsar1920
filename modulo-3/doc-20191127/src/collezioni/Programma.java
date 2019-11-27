package collezioni;

import java.util.concurrent.locks.StampedLock;

public class Programma {

	public static void main(String[] args) {
		//int[] interi = new int[5];
		int[] interi = { 5, 8, 12, 34, 19, 12, 17, 21, 4, 49, 22 };
		
		stampaMedia(interi);
		stampaNumeriInOrdine(interi);
		aggiungiNumero(27, interi);
		
		rimuoviNumero(19, interi);
	}
	
	private static void rimuoviNumero(int numeroDaRimuovere, int[] interi) {
		// prima controllo se c'è, salvo la posiz, ??
		int[] appoggio = new int[interi.length];
		int posizione = 0;
		for(int i = 0; i < interi.length; i++) {
			if(interi[i] != numeroDaRimuovere) {
				appoggio[posizione++] = interi[i];
			}
		}
		interi = new int[posizione];
		for(int i = 0; i < interi.length; i++) {
			interi[i] = appoggio[i];
		}
	}

	private static void aggiungiNumero(int nuovo, int[] interi) {
		int[] appoggio = new int[interi.length + 1];
		for(int i = 0; i < interi.length; i++) 
			appoggio[i] = interi[i];
		
		appoggio[interi.length] = nuovo;
		
		for(int n : appoggio)
			System.out.println(n);
	}

	private static void stampaNumeriInOrdine(int[] interi) {
		// bubble sort
		for(int i = 0; i < interi.length - 1; i++) {
			for(int j = i + 1; j < interi.length; j++) {
				if(interi[i] > interi[j]) {
					int appoggio = interi[i];
					interi[i] = interi[j];
					interi[j] = appoggio;
				}
			}
		}
		for(int n : interi)
			System.out.println(n);
	}

	public static void stampaMedia(int[] interi) {
		int somma = 0;	
		for(int n : interi)
			somma += n;
		System.out.println("la media è :" + (somma / interi.length));
	}
}
