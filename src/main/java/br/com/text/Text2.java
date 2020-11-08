package br.com.text;

import java.sql.SQLException;

import br.com.agenda.dao.UsuarioDao;

public class Text2 {

	public static class UsuarioText {

		public static void main(String[] args) throws SQLException, ClassNotFoundException {

			/* UsuarioDao dao = new UsuarioDao(); dao.inserir("Billy"); */

			UsuarioDao dao = new UsuarioDao();
			System.out.print(dao.listarTudo());
			
			/*LocalDao daoupdate = new LocalDao();
			daoUpdate.alterar("Centrais eletricas de sc");
			System.out.println("Lista Atualizada");
			localDao pesq = new LocalDao();
			System.out.println(pesq.listarTudo());*/

		}
		

	}
}
