package br.com.model;

public class Usuario {

	private Long id;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char[] listarTudo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + "]";
	}
	

}
