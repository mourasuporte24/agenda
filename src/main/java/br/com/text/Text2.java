package br.com.text;

import java.sql.SQLException;

import br.com.agenda.dao.UsuarioLocal;

public class Text2 {

	public static class UsuarioText {

		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			UsuarioLocal dao = new UsuarioLocal();
			dao.inserir("Otavio");
		}
	}
}
