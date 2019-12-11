package esercizio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Risposta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Domanda domanda;
	private String testo;
	private Autore autore;
	
	/**
	 * 
	 */
	public Risposta() {
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the domanda
	 */
	public Domanda getDomanda() {
		return domanda;
	}
	/**
	 * @param domanda the domanda to set
	 */
	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}
	/**
	 * @return the testo
	 */
	public String getTesto() {
		return testo;
	}
	/**
	 * @param testo the testo to set
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}
	/**
	 * @return the autore
	 */
	public Autore getAutore() {
		return autore;
	}
	/**
	 * @param autore the autore to set
	 */
	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	
	

}
