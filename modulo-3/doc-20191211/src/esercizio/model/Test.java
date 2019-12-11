package esercizio.model;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Test
 *
 */
@Entity

public class Test implements Serializable {

	   
	@Id
	private Integer numero;
	private static final long serialVersionUID = 1L;

	public Test() {
		super();
	}   
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
   
}
