package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the citta database table.
 * 
 */
@Entity
@NamedQuery(name="Citta.findAll", query="SELECT c FROM Citta c")
public class Citta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String nome;

	private String regione;

	public Citta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegione() {
		return this.regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

}