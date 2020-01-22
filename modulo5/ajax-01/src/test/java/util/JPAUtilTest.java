package util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.Test;

import model.Corso;


public class JPAUtilTest {

	@Test
	public void testGetInstance() {
		JPAUtil.getInstance();
	}

	@Test
	public void testGetEmf() {
		EntityManagerFactory emf = JPAUtil.getInstance().getEmf();
	}
	
	@Test
	public void testGetEm() {
		EntityManagerFactory emf = JPAUtil.getInstance().getEmf();
		EntityManager em = emf.createEntityManager();
		List<Corso> corsi = em.createQuery("select c from Corso c", Corso.class).getResultList();
	}

}
