package esercizio;

import javax.persistence.EntityManager;

import esercizio.utils.JPAUtils;

public class Programma {

	public static void main(String[] args) {
		EntityManager em = JPAUtils.getInstance().getEmf().createEntityManager();
	}

}
