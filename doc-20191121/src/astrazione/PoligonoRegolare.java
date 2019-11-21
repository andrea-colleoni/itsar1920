package astrazione;

public class PoligonoRegolare extends Poligono {
	
	private float lato;
	
	public PoligonoRegolare(float lato, int numeroLati) {
		this.lato = lato;
		this.setNumeroLati(numeroLati);
	}

	@Override
	public float area() {
		return this.getNumeroLati() * lato;
	}
	
	@Override
	public float perimetro() {
		return getNumeroLati() * lato;
	}

	/**
	 * @return the lato
	 */
	public float getLato() {
		return lato;
	}

	/**
	 * @param lato the lato to set
	 */
	public void setLato(float lato) {
		this.lato = lato;
	}

}
