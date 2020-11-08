package br.com.data;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conexao {

	Connection getConection();

	void close();

	void commit() throws SQLException;

	void rollback();

}
