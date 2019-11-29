package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrimoEsempio {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// caricare il driver
		Class.forName("org.mariadb.jdbc.Driver");
		// creare una connessione
		// localhost: è l'host a cuimi voglio connettere (in questo caso il mio PC)
		// 3306: è la porta su cui sta funzionando il DB server
		// esempi1129: è il nome del DB che voglio aprire sul server
		Connection conn  = DriverManager.getConnection("jdbc:mariadb://172.17.245.241:3306/esempi1129", "root", "password");
		
		// inviare comandi (SQL)
		Statement st = conn.createStatement();
		ResultSet dati = st.executeQuery("select * from tabella");
		
		// leggere i risultati
		while(dati.next()) {
			System.out.println(dati.getString("campo2"));
		}
		
		conn.close();
	}

}
