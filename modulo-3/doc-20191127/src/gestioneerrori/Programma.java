package gestioneerrori;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programma {

	public static void main(String[] args) throws NumeroTroppoGrandeException {
		int n = 0;
		while (n <= 0 && n > 100) {
			try {
				Scanner s = new Scanner(System.in);
				System.out.print("Inserisci un numero: ");
				String letta = s.nextLine();
				n = Integer.valueOf(letta);

				if (n > 100)
					throw new NumeroTroppoGrandeException();

			} catch (InputMismatchException ex) {
				System.out.println("si è verificato un errore");
			} catch (NumberFormatException ex) {
				System.out.println("il numero inserito è sbagliato");
			} catch (NumeroTroppoGrandeException ex) {
				System.out.println("il numero è grande, quindi il risultato sarà impreciso");
			}
		}
		System.out.println("Hai scelto il numero " + n);
		try {
			System.out.println("10 diviso per " + n + " fa: " + (10 / n));
		} catch (ArithmeticException ex) {
			System.out.println("problemi con la divisione");
		}

		System.out.println("finito");
	}

}
