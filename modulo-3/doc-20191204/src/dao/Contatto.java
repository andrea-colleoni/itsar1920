package dao;

import java.util.Date;

public class Contatto {
	private String nome;
	private String cognome;
	private String numeroTelefono;
	private String email;
	private String nazione;
	private Date dataNascita;
	
	
	public Contatto() {
	}
	
	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", cognome=" + cognome + ", numeroTelefono=" + numeroTelefono + ", email="
				+ email + ", nazione=" + nazione + ", dataNascita=" + dataNascita + "]";
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
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	
}
