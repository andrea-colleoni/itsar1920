package astrazione;

public class Cerchio implements FiguraConAreaCalcolabile {

	private float raggio;
	
	public Cerchio(float raggio) {
		super();
		this.raggio = raggio;
	}

	@Override
	public float area() {
		return(float)( Math.pow(raggio, 2) * Math.PI );
	}

	/**
	 * @return the raggio
	 */
	public float getRaggio() {
		return raggio;
	}



	/**
	 * @param raggio the raggio to set
	 */
	public void setRaggio(float raggio) {
		this.raggio = raggio;
	}

}
