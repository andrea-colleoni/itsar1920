package business;

import java.util.Date;

import javax.persistence.EntityManager;

import model.Utente;
import util.JPAUtils;

public class LoginManager {
	
	public static Utente login(String username, String password) {
		EntityManager em = JPAUtils.getInstance().createEntityManager();
		
		Utente u = em.find(Utente.class,  username);
		if (u == null)
			return null;
		
		em.getTransaction().begin();
		u.setDataOraUltimoLogin(new Date());
		em.getTransaction().commit();
		
		if (password.contentEquals(u.getPassword()) && u.isAttivo()) {
			return u;
		}
		
		return null;
	}

}
