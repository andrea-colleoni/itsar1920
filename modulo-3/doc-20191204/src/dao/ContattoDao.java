package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Questa classe ha il compito di rappresentare in Java record della tabella
 * contatto presenti sul DB
 * 
 * @author andre
 *
 */
public class ContattoDao {

	public void salva(Contatto c) throws SQLException, ClassNotFoundException {
		// INSERT INTO `rubrica_ifts_1920`.`contatto` (`nome`, `cognome`, `numero_telefono`, `email`, `nazione`, `data_nascita`) VALUES ('Andrea', 'Colleoni', '345678', 'andrea@', 'IT', '1973-12-04');
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rubrica_ifts_1920", "root",
				"password");

		String sql = "INSERT INTO contatto (nome, cognome, numero_telefono, email, nazione, data_nascita) "
				+ " VALUES (?, ?, ?, ?, ?, ?);";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, c.getNome());
		st.setString(2, c.getCognome());
		st.setString(3, c.getNumeroTelefono());
		st.setString(4, c.getEmail());
		st.setString(5, c.getNazione());
		if (c.getDataNascita() != null) {
			st.setDate(6, new Date(c.getDataNascita().getTime()));
		} else {
			st.setDate(6, null);
		}
		
		st.executeUpdate();

		st.close();
		conn.close();
	}

	public List<Contatto> elenco() throws ClassNotFoundException, SQLException {
		// select * from contatto
		List<Contatto> elenco = new ArrayList<>();
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/rubrica_ifts_1920", "root",
				"password");

		Statement st = conn.createStatement();
		ResultSet contatti = st.executeQuery("select * from contatto");
		while (contatti.next()) {
			Contatto c = new Contatto();
			c.setNome(contatti.getString("nome"));
			c.setCognome(contatti.getString("cognome"));
			c.setDataNascita(contatti.getDate("data_nascita"));
			c.setEmail(contatti.getString("email"));
			c.setNazione(contatti.getString("nazione"));
			c.setNumeroTelefono(contatti.getString("numero_telefono"));
			elenco.add(c);
		}

		contatti.close();
		st.close();
		conn.close();

		return elenco;
	}

}
