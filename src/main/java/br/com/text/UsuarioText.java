package br.com.text;

import java.sql.SQLException;

import br.com.agenda.dao.UsuarioDao;

public class UsuarioText {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		UsuarioDao dao = new UsuarioDao();
		dao.inserir("Paula");
	}
}


