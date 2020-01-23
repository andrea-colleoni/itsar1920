package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Utente {

	@Id
	private String username;
	
	@JsonIgnore // non serializza questo valore
	private String password;
	@Column(length = 100)
	private String email;
	@Column(length = 50)
	private String nome;
	@Column(length = 50)
	private String cognome;
	@Temporal(TemporalType.DATE)
	private Date dataRegistrazione;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataOraUltimoLogin;
	private boolean attivo;
	@Column(length = 50)
	private String numeroTelefono;
	
	/**
	 * 
	 */
	public Utente() {
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataRegistrazione() {
		return dataRegistrazione;
	}
	public void setDataRegistrazione(Date dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
	public Date getDataOraUltimoLogin() {
		return dataOraUltimoLogin;
	}
	public void setDataOraUltimoLogin(Date dataOraUltimoLogin) {
		this.dataOraUltimoLogin = dataOraUltimoLogin;
	}
	public boolean isAttivo() {
		return attivo;
	}
	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	@Override
	public String toString() {
		return "Utente [username=" + username + ", email=" + email + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataRegistrazione=" + dataRegistrazione + ", dataOraUltimoLogin=" + dataOraUltimoLogin
				+ ", attivo=" + attivo + ", numeroTelefono=" + numeroTelefono + "]";
	}
	
}
