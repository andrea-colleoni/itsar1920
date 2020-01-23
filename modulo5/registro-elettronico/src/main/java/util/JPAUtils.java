package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	
	private static final String PERSISTENCE_UNIT_REGISTRO = "registro";

	private static JPAUtils instance;
	
	private EntityManagerFactory emf;
	
	private JPAUtils() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_REGISTRO);
	}
	
	public static JPAUtils getInstance() {
		if (instance == null)
			instance = new JPAUtils();
		return instance;
	}
	
	public EntityManager createEntityManager() {
		return this.emf.createEntityManager();		
	}

}
