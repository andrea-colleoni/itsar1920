package model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persona")
public class Persona {

	private String nome;
	private String cognome;
	private Date dataNascita;
	private String indirizzo;
	private int altezzaInCm;
	private float pesoInKg;
	
	/**
	 * 
	 */
	public Persona() {
	}
	/**
	 * @param nome
	 * @param cognome
	 * @param altezzaInCm
	 * @param pesoInKg
	 */
	public Persona(String nome, String cognome, int altezzaInCm, float pesoInKg) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.altezzaInCm = altezzaInCm;
		this.pesoInKg = pesoInKg;
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
	 * @return the dataNascita
	 */
	public Date getDataNascita() {
		return dataNascita;
	}
	/**
	 * @param dataNascita the dataNascita to set
	 */
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
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
	 * @return the altezzaInCm
	 */
	public int getAltezzaInCm() {
		return altezzaInCm;
	}
	/**
	 * @param altezzaInCm the altezzaInCm to set
	 */
	public void setAltezzaInCm(int altezzaInCm) {
		this.altezzaInCm = altezzaInCm;
	}
	/**
	 * @return the pesoInKg
	 */
	public float getPesoInKg() {
		return pesoInKg;
	}
	/**
	 * @param pesoInKg the pesoInKg to set
	 */
	public void setPesoInKg(float pesoInKg) {
		this.pesoInKg = pesoInKg;
	}
	
	
}
