package esercizio.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	
	private EntityManagerFactory emf;
	
	private static JPAUtils instance;

	/**
	 * 
	 */
	private JPAUtils() {
		emf = Persistence.createEntityManagerFactory("domande_risposte");
	}
	
	public static JPAUtils getInstance() {
		if (instance == null)
			instance = new JPAUtils();
		return instance;
	}

	/**
	 * @return the emf
	 */
	public EntityManagerFactory getEmf() {
		return emf;
	}

}
