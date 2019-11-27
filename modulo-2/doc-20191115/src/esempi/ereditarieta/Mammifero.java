package esempi.ereditarieta;

public class Mammifero extends Animale {

	private int tempoGestazione;
	private String sistemaCircolatorio;
	
	public void allatta() {
		System.out.println(getSpecie() + " sta allattando...");
	}
	
	public void muoviti() {
		System.out.println("Il mammifero " + getSpecie() + " dice: PUFF, PUFF, PUFF...");
	}
	
	/**
	 * @return the sistemaCircolatorio
	 */
	public String getSistemaCircolatorio() {
		return sistemaCircolatorio;
	}
	/**
	 * @param sistemaCircolatorio the sistemaCircolatorio to set
	 */
	public void setSistemaCircolatorio(String sistemaCircolatorio) {
		this.sistemaCircolatorio = sistemaCircolatorio;
	}
	/**
	 * @return the tempoGestazione
	 */
	public int getTempoGestazione() {
		return tempoGestazione;
	}
	/**
	 * @param tempoGestazione the tempoGestazione to set
	 */
	public void setTempoGestazione(int tempoGestazione) {
		this.tempoGestazione = tempoGestazione;
	}
	
	
}
