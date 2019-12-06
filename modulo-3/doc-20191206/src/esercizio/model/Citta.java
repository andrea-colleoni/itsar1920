package esercizio.model;

public class Citta {
	
	private Integer id;
	private String nome;
	private String regione;
	
	
	public Citta() {
	}
	
	
	public Citta(Integer id, String nome, String regione) {
		super();
		this.id = id;
		this.nome = nome;
		this.regione = regione;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
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
	 * @return the regione
	 */
	public String getRegione() {
		return regione;
	}
	/**
	 * @param regione the regione to set
	 */
	public void setRegione(String regione) {
		this.regione = regione;
	}


	@Override
	public String toString() {
		return "Citta [id=" + id + ", nome=" + nome + ", regione=" + regione + "]";
	}
	
	

}
