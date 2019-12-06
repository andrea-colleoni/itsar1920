package esercizio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoUtils {
	
	private static final String DB_PASSWORD = "password";
	private static final String DB_USER = "root";
	private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/20191206-ifts";

	static PreparedStatement statement(String sql) throws ClassNotFoundException, SQLException {
		Class.forName(JDBC_DRIVER);
		Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
		PreparedStatement _return = conn.prepareStatement(sql);
		return _return;
	}
}
