package esempi.ereditarieta;

public class Animale {
	
	private String specie;
	private String habitat;
	
	public void mangia() {
		System.out.println(specie + " dice: GNAM GNAM!");
	}
	
	// la method signature (firma di metodo) è composta da:
	// <modificatore di visibilità> <tipo restituito> <nome del metodo>([<numero e tipo degli argomenti>])
	// es: qui sotto il metodo muoviti ha queste caratteristiche:
	// <modificatore di visibilità>: public
	// <tipo restituito>: void
	// <nome del metodo>: muoviti
	// <numero e tipo degli argomenti>: nessun argomento
	// NB: in una classe non si possono ripetere due metodo con gli stessi:
	// - nome
	// - numero e tipo di argomenti
	// NB: quando la stessa firma di metodo compare sia in una sottoclasse che nella sua superclasse
	// si dice che il metodo della sottoclasse è OVERRIDE del metodo della superclasse
	public void muoviti() {
		System.out.println(getSpecie() + " dice: PUFF, PANT...");
	}
	
	/**
	 * @return the habitat
	 */
	public String getHabitat() {
		return habitat;
	}
	/**
	 * @param habitat the habitat to set
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	/**
	 * @return the specie
	 */
	public String getSpecie() {
		return specie.toUpperCase();
	}
	/**
	 * @param specie the specie to set
	 */
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
	

}
