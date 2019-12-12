package esercizio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autore {
	
	private String nome;
	private String cognome;
	
	@Id
	private String email;
	
	@OneToMany
	private List<Risposta> risposte;
	@OneToMany
	private List<Domanda> domande;
	
	/**
	 * 
	 */
	public Autore() {
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
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

	/**
	 * @return the domande
	 */
	public List<Domanda> getDomande() {
		return domande;
	}

	/**
	 * @param domande the domande to set
	 */
	public void setDomande(List<Domanda> domande) {
		this.domande = domande;
	}
	
	

}
