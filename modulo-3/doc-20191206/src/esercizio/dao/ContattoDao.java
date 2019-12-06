package esercizio.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import esercizio.model.Contatto;

public class ContattoDao {

	//CRUD operations on Contatto
	
	public List<Contatto> list() throws ClassNotFoundException, SQLException {
		List<Contatto> _return = new ArrayList<>();
		PreparedStatement st = DaoUtils.statement("select * from contatto");
		ResultSet contatti = st.executeQuery();
		while(contatti.next()) {
			_return.add(map(contatti));
		}
		return _return;
	}
	
	public Contatto byId(Integer id) throws ClassNotFoundException, SQLException {
		Contatto _return = null;
		PreparedStatement st = DaoUtils.statement("select * from contatto where id = ?");
		st.setInt(1, id);
		ResultSet contatti = st.executeQuery();
		if(contatti.next()) {
			_return = map(contatti);
		}
		return _return;		
	}
	
	
	
	public void create(Contatto c) throws ClassNotFoundException, SQLException {
		PreparedStatement st = DaoUtils.statement("insert into contatto (nome, cognome, email, telefono) VALUES (?, ?, ?, ?)");
		map(c, st);
		st.executeUpdate();
	}
	
	public void update (Contatto c) throws SQLException, ClassNotFoundException {
		PreparedStatement st = DaoUtils.statement("update contatto set nome = ?, cognome = ?, email = ?, telefono = ? where id = ?");
		map(c, st);
		st.setInt(5, c.getId());
		st.executeUpdate();		
	}
	
	public void delete(Integer id) throws ClassNotFoundException, SQLException {
		PreparedStatement st = DaoUtils.statement("delete from contatto where id = ?");
		st.setInt(1, id);
		st.executeUpdate();		
	}

	/**
	 * @param contatti
	 * @return
	 * @throws SQLException
	 */
	private Contatto map(ResultSet contatti) throws SQLException {
		Contatto _return;
		_return = new Contatto();
		_return.setId(contatti.getInt("id"));
		_return.setNome(contatti.getString("nome"));
		_return.setCognome(contatti.getString("cognome"));
		_return.setEmail(contatti.getString("email"));
		_return.setTelefono(contatti.getString("telefono"));
		return _return;
	}
	
	/**
	 * @param c
	 * @param st
	 * @throws SQLException
	 */
	private void map(Contatto c, PreparedStatement st) throws SQLException {
		st.setString(1, c.getNome());
		st.setString(2, c.getCognome());
		st.setString(3, c.getEmail());
		st.setString(4, c.getTelefono());
	}	
	
}
