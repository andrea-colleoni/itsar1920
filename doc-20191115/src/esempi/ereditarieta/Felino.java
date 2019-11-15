package esempi.ereditarieta;

public class Felino extends Mammifero {

	private String tipoPelo;
	
	public void graffia() {
		System.out.println(getSpecie() + " dice: GRATT GRATT...");
	}

	/**
	 * @return the tipoPelo
	 */
	public String getTipoPelo() {
		return tipoPelo;
	}

	/**
	 * @param tipoPelo the tipoPelo to set
	 */
	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
}
