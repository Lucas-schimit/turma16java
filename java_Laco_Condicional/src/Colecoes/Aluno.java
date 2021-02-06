package Colecoes;

public class Aluno {

	private String nome; 
	private String curso;
	private int telefone; 
	
	
	public Aluno(String nome, String curso,int telefone ) {
		this.nome = nome; 
		this.curso = curso;
		this.telefone = telefone; 
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
