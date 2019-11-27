package esercizi;

public class Potenza {

	public int numeroIntero;
	
	public Potenza(int numero) {
		this.numeroIntero = numero;
	}
	
	public void pow() {
		System.out.println(numeroIntero * numeroIntero);
	}
	
	public void cambioBase(int nuovoNumero) {
		this.numeroIntero = nuovoNumero;
	}
}
