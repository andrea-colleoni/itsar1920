package esercizio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Domanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String testo;
	private String suggerimento;
	@ManyToOne
	private Autore autore;
	
	@OneToMany
	private List<Risposta> risposte;
	
	
	/**
	 * 
	 */
	public Domanda() {
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
	 * @return the suggerimento
	 */
	public String getSuggerimento() {
		return suggerimento;
	}

	/**
	 * @param suggerimento the suggerimento to set
	 */
	public void setSuggerimento(String suggerimento) {
		this.suggerimento = suggerimento;
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

	/**
	 * @return the risposte
	 */
	public List<Risposta> getRisposte() {
		return risposte;
	}

	/**
	 * @param risposte the risposte to set
	 */
	public void setRisposte(List<Risposta> risposte) {
		this.risposte = risposte;
	}
	
	

}
