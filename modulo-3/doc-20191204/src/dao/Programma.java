package dao;

import java.sql.SQLException;

public class Programma {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ContattoDao cd = new ContattoDao();
		for(Contatto cont : cd.elenco()) {
			System.out.println(cont.toString());
		}
		
		
		Contatto c = new Contatto();
		
		c.setNome("Java");
		c.setCognome("Base");
		c.setNazione("US");
		c.setNumeroTelefono("9834653498");
		c.setEmail("java@");
		
		cd.salva(c);
		
	}

}
