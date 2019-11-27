package esercizi;

public class Potenza {

	private int base;

	public Potenza(int base) {
		this.base = base;
	}
	
	
	public void pow() {
		System.out.println(base * base);
	}
	
	public void cambioBase(int nuovaBase) {
		this.base = nuovaBase;
	}
}
