package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the contatto database table.
 * 
 */
@Entity
@NamedQuery(name="Contatto.findAll", query="SELECT c FROM Contatto c")
public class Contatto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String cognome;

	private String email;

	private String nome;

	private String telefono;

	public Contatto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contatto [id=" + id + ", cognome=" + cognome + ", email=" + email + ", nome=" + nome + ", telefono="
				+ telefono + "]";
	}

}