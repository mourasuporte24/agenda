package br.com.agenda.dao;
import java.sql.SQLException;
import br.com.data.Conexao;
import br.com.data.ConexaoMysql;

public class ListaTarefaDao {

	private final Conexao conexao;

	public ListaTarefaDao() throws ClassNotFoundException, SQLException {

		this.conexao = new ConexaoMysql();

	}

	public void insert(String descricao, String observacao, int local_id, int usuario_id) {

		String sql = "insert into lista_tarefa (descricao, observacao,local_id,usuario_id) values (?, ?, ?, ?)";
		try {
			stmt.setString(1, descricao);
			stmt.setString(2, observacao);
			stmt.setLong(3, local_id);
			stmt.setLong(4, usuario_id);
			stmt.execute();

			this.conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}

	}

}
