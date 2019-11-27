package esempi.rettangoli;

// rispetto a quanto fatto nella lezione predente, qui applico
// la tecnica dell'incapsulamento per nascondere lo stato
public class Rettangolo {
	private float base;
	private float altezza;
	
	// questo è un costruttore
	public Rettangolo() { // nessun argomento => costruttore vuoto
		this.base = 2;
		this.altezza = 2;
	}
	// NB: se volessi costruire con questa classe oggetti IMMUTABILI
	// non dovrei avere il costruttore vuoto e non dovrei avere alcun SETTER
	
	// costruttore con argomenti
	public Rettangolo(float base, float altezza) { // costrutore che usa i campi come argomenti (inizializzatore)
		this.base = base;
		this.altezza = altezza;
	}
	
	// accessor del campo base
	public float getBase() {
		return base;
	}
	// mutator del campo base
	public void setBase(float nuovaBase) {
		this.base = nuovaBase;
	}
	// gli accessors in Java si chiamano anche getters
	public float getAltezza() {
		return this.altezza;
	}
	// i mutator in Java si chiamano anche setters
	public void setAltezza(float nuovaAltezza) {
		this.altezza = nuovaAltezza;
	}
	
	
	public float getArea() {
		return base * altezza;
	}
	
	public float getCostoDiColorazione(Pittura pittura) {
		return getArea() * pittura.getResaInLitriAlMetroQuadro() * pittura.getCostoInEuroAlLitro();
	}
}
