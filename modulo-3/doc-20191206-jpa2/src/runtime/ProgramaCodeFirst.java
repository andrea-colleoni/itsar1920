package runtime;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Appartamento;
import model.Condominio;
import model.Persona;

public class ProgramaCodeFirst {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("condominio");
		EntityManager em = emf.createEntityManager();
		
		Persona p = new Persona();
		p.setNome("Mario");
		p.setCodiceFiscale("MRARSS");
		p.setCognome("Rossi");
		
		Condominio c = new Condominio();
		c.setNome("Leonardo Da Vinci");
		c.setIndirizzo("Via Milano, 1");
		
		Appartamento a = new Appartamento();
		a.setMetriQuadri(150);
		a.setPiano(10);
		a.setProprietario(p);
		
		List<Appartamento> lista = new ArrayList<>();
		lista.add(a);
		c.setAppartamenti(lista);
		
		em.getTransaction().begin();
		em.persist(c);
		em.persist(p);
		em.persist(a);
		em.getTransaction().commit();
		
	}

}
