package esercizio.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import esercizio.model.Citta;

public class CittaDao {

	//CRUD operations on Citta
	
	public List<Citta> list() throws ClassNotFoundException, SQLException {
		List<Citta> _return = new ArrayList<>();
		PreparedStatement st = DaoUtils.statement("select * from citta");
		ResultSet contatti = st.executeQuery();
		while(contatti.next()) {
			_return.add(map(contatti));
		}
		return _return;
	}
	
	public Citta byId(Integer id) throws ClassNotFoundException, SQLException {
		Citta _return = null;
		PreparedStatement st = DaoUtils.statement("select * from citta where id = ?");
		st.setInt(1, id);
		ResultSet contatti = st.executeQuery();
		if(contatti.next()) {
			_return = map(contatti);
		}
		return _return;		
	}
	
	
	
	public void create(Citta c) throws ClassNotFoundException, SQLException {
		PreparedStatement st = DaoUtils.statement("insert into citta (nome, regione) VALUES (?, ?)");
		map(c, st);
		st.executeUpdate();
	}
	
	public void update (Citta c) throws SQLException, ClassNotFoundException {
		PreparedStatement st = DaoUtils.statement("update citta set nome = ?, regione = ? where id = ?");
		map(c, st);
		st.setInt(3, c.getId());
		st.executeUpdate();		
	}
	
	public void delete(Integer id) throws ClassNotFoundException, SQLException {
		PreparedStatement st = DaoUtils.statement("delete from citta where id = ?");
		st.setInt(1, id);
		st.executeUpdate();		
	}

	/**
	 * @param contatti
	 * @return
	 * @throws SQLException
	 */
	private Citta map(ResultSet contatti) throws SQLException {
		Citta _return;
		_return = new Citta();
		_return.setId(contatti.getInt("id"));
		_return.setNome(contatti.getString("nome"));
		_return.setRegione(contatti.getString("regione"));
		return _return;
	}
	
	/**
	 * @param c
	 * @param st
	 * @throws SQLException
	 */
	private void map(Citta c, PreparedStatement st) throws SQLException {
		st.setString(1, c.getNome());
		st.setString(2, c.getRegione());
	}	
}
