package br.com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.data.Conexao;
import br.com.data.ConexaoMysql;

public class UsuarioLocal {
	private final Conexao conexao;

	public UsuarioLocal() throws SQLException, ClassNotFoundException {
		this.conexao = new ConexaoMysql();
	}

	public void inserir(String nomeUsuario) throws SQLException {
		String query = "insert into usuario(nome) values (?);";

		try {
			PreparedStatement stmt = this.conexao.getConection().prepareStatement(query);
			stmt.setString(1, nomeUsuario);
			stmt.execute();

			this.conexao.commit();

		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}
		//update
		public void update(String nomeAtualizado,Long id) {			
			String query = "update local set nome = '?' where id=  ? ";
		

				try {
					PreparedStatement stmt = this.conexao.getConection().prepareStatement(sql);
					stmt.setString(1, nomeAtualizado);
					stmt.execute();
					this.conexao.commit();
		}
		
	}
	 	
}
