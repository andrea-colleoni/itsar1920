package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Condominio {
	
	@Id
	private String nome;
	private String indirizzo;
	
	private List<Appartamento> appartamenti;

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
	 * @return the indirizzo
	 */
	public String getIndirizzo() {
		return indirizzo;
	}

	/**
	 * @param indirizzo the indirizzo to set
	 */
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	/**
	 * @return the appartamenti
	 */
	public List<Appartamento> getAppartamenti() {
		return appartamenti;
	}

	/**
	 * @param appartamenti the appartamenti to set
	 */
	public void setAppartamenti(List<Appartamento> appartamenti) {
		this.appartamenti = appartamenti;
	}
	
	

}
