package br.com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMysql implements Conexao {

	private Connection connection = null;
	// USUARIO
	private static final String USERNAME = "root";
	// SENHA
	private static final String PASSWORD = "";

	// Dados de caminho, porta e nome da base de dados que irá ser feita a conexão
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3307/agenda?useTimezone=true&serverTimezone=UTC";

	// construtor
	public ConexaoMysql() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		this.connection.setAutoCommit(false);
	}

	public Connection getConection() {
		return connection;
	}

	// Fecha conexao (x da aplicacao)

	public void close() {
		if (this.connection != null) {
			try {
				this.connection.close();
			} catch (SQLException ex) {
				Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);

			}
		}

	}

	public void commit() throws SQLException {
		this.connection.commit();
		this.close();

	}

	public void rollback() {
		if (this.connection != null) {
			try {
				this.connection.rollback();

			} catch (SQLException ex) {
				Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
			} finally {
				this.close();
			}
		}
	}

}
