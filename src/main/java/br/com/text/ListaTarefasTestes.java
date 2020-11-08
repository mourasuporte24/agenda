package br.com.text;

import java.sql.SQLException;

import br.com.agenda.dao.LocalUsuario;

public class ListaTarefasTestes {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		LocalUsuario local = new LocalUsuario();
		ListaTarefas dao = new ListaTarefas();
		System.out.println(local.listarTudo());

	}

}
