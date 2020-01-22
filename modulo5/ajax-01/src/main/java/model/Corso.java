package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "corso")
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_corso")
	private Integer id;
	
	private String titolo;
	
	private String docente;
	
	@Column(name = "durata_ore")
	private Integer durataOre;
	
	@Column(name = "data_inizio")
	@Temporal(TemporalType.DATE)
	private Date dataInizio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public Integer getDurataOre() {
		return durataOre;
	}

	public void setDurataOre(Integer durataOre) {
		this.durataOre = durataOre;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	
	

}
