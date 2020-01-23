package business;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Utente;
import util.JPAUtils;

public class LoginManagerTest {
	
	private static final String USERNAME_OK = "test_ok";
	private static final String PASSWORD_OK = "pwd_ok";

	@Before
	public void setUp() {
		EntityManager em = JPAUtils.getInstance().createEntityManager();
		em.getTransaction().begin();
		Utente u = new Utente();
		u.setUsername(USERNAME_OK);
		u.setPassword(PASSWORD_OK);
		u.setAttivo(true);
		em.persist(u);
		em.getTransaction().commit();
	}
	@After
	public void tearDown() {
		EntityManager em = JPAUtils.getInstance().createEntityManager();
		em.getTransaction().begin();
		Utente u = em.find(Utente.class, USERNAME_OK);
		em.remove(u);
		em.getTransaction().commit();
	}

	@Test
	public void testLogin() {
		LoginManager lm = new LoginManager();
		Utente u = lm.login(USERNAME_OK, PASSWORD_OK);
		assertNotNull("utente ok non ha fatto login", u);
		
		u = lm.login("errato", "errata");
		assertNull("utente inesistente riesce ad accedere", u);
		
		u = lm.login(USERNAME_OK, "errata");
		assertNull("utente esistente con pwd errata riesce ad accedere", u);
		
	}

}
