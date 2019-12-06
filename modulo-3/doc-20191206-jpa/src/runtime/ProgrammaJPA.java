package runtime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Contatto;

public class ProgrammaJPA {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nome-persistence-unit");
		EntityManager em = emf.createEntityManager();
		
//		Contatto c = new Contatto();
//		c.setNome("Da JPA");
//		c.setCognome("Da JPA");
//		c.setEmail("JPA@");
//		c.setTelefono("87696");
//		
//		em.getTransaction().begin();
//		em.persist(c);
//		em.getTransaction().commit();
		
		for(Contatto ct : em.createNamedQuery("Contatto.findAll", Contatto.class).getResultList()) {
			System.out.println(ct);
		}
		
		Contatto sl = em.find(Contatto.class, 10);
		em.getTransaction().begin();
		sl.setNumTelefono("999888777");
		em.getTransaction().commit();
	}

}
