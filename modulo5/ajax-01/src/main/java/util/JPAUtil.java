package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static JPAUtil instance;
	
	private EntityManagerFactory emf;
	
	private JPAUtil() {
		this.emf = Persistence.createEntityManagerFactory("ajax");
	}
	
	public static JPAUtil getInstance() {
		if (instance == null)
			instance = new JPAUtil();
		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

}
