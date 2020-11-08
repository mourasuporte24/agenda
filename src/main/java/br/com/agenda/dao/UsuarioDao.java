package br.com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.data.Conexao;
import br.com.data.ConexaoMysql;
import br.com.model.Local;

public class UsuarioDao {
	private final Conexao conexao;

	public UsuarioDao() throws SQLException, ClassNotFoundException {
		this.conexao = new ConexaoMysql();
	}

	// create
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
	}

	// read
	public List<Local> listarTudo() throws SQLException, ClassNotFoundException {

		String sql = "select id, nome from local order by id";
		try {
			PreparedStatement st = this.conexao.getConection().prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			List<Local> listaPesquisada = new ArrayList<Local>();

			while (rs.next()) {
				Local local = new Local(rs.getLong("id"), rs.getString("nome"));
				listaPesquisada.add(local);
			}
			return listaPesquisada;
		    } catch (SQLException exception) {
			throw exception;

		}
		
		public void update (String nomeAtualizado) throws SQLException {
			String query = "update local set nome ? where id= ? ";

			try {
				PreparedStatement stmt = this.conexao.getConection().prepareStatement(query);
				stmt.setString(5, nomeUsuario);
				stmt.execute();

				this.conexao.commit();

			} catch (SQLException e) {
				this.conexao.rollback();
				throw e;
			}
	  	}
		
	}
}
