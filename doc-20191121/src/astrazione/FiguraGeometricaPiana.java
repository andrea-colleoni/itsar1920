package astrazione;

public abstract class FiguraGeometricaPiana implements FiguraConAreaCalcolabile {
	
	private String nome;
	private int numeroLati;
	
	// public abstract float area();
	public abstract float perimetro();

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the numeroLati
	 */
	public int getNumeroLati() {
		return numeroLati;
	}

	/**
	 * @param numeroLati the numeroLati to set
	 */
	public void setNumeroLati(int numeroLati) {
		this.numeroLati = numeroLati;
	}
	
	

}
