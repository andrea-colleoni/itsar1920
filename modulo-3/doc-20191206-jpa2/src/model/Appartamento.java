package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appartamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int piano;
	private float metriQuadri;
	private Persona proprietario;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the piano
	 */
	public int getPiano() {
		return piano;
	}
	/**
	 * @param piano the piano to set
	 */
	public void setPiano(int piano) {
		this.piano = piano;
	}
	/**
	 * @return the metriQuadri
	 */
	public float getMetriQuadri() {
		return metriQuadri;
	}
	/**
	 * @param metriQuadri the metriQuadri to set
	 */
	public void setMetriQuadri(float metriQuadri) {
		this.metriQuadri = metriQuadri;
	}
	/**
	 * @return the proprietario
	 */
	public Persona getProprietario() {
		return proprietario;
	}
	/**
	 * @param proprietario the proprietario to set
	 */
	public void setProprietario(Persona proprietario) {
		this.proprietario = proprietario;
	}
	
	

}
