package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
	
	@Id
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private String email;
	private Date dataRegistrazione;
	private boolean attivo;
	
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the dataRegistrazione
	 */
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}
	/**
	 * @param dataRegistrazione the dataRegistrazione to set
	 */
	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
	/**
	 * @return the attivo
	 */
	public boolean isAttivo() {
		return attivo;
	}
	/**
	 * @param attivo the attivo to set
	 */
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	
	

}
