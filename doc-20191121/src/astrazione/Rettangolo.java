package astrazione;

public class Rettangolo extends Poligono {
	
	private float base;
	private float altezza;

	public Rettangolo(float base, float altezza) {
		super();
		setNumeroLati(4);
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public float area() {
		return base * altezza;
	}

	@Override
	public float perimetro() {
		return 2 * ( base + altezza );
	}

	/**
	 * @return the base
	 */
	public float getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(float base) {
		this.base = base;
	}

	/**
	 * @return the altezza
	 */
	public float getAltezza() {
		return altezza;
	}

	/**
	 * @param altezza the altezza to set
	 */
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

}
