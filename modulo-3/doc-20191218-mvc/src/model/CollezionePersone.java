package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persone")
public class CollezionePersone {
	
	@XmlElement(name = "elenco")
	private List<Persona> persone;

	/**
	 * @return the persone
	 */
	public List<Persona> getPersone() {
		return persone;
	}

	/**
	 * @param persone the persone to set
	 */
	public void setPersone(List<Persona> persone) {
		this.persone = persone;
	}

}
