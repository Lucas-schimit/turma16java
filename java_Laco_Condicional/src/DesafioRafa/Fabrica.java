package DesafioRafa;

public class Fabrica {

	private String Nome;
	private String Endereco;
	private int quantidadeDeFuncionarios;

	public Fabrica(String nome, String endereco, int quantidadeDeFuncionarios) {
		super();
		Nome = nome;
		Endereco = endereco;
		this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
	}

	public Fabrica() {

	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public int getQuantidadeDeFuncionarios() {
		return quantidadeDeFuncionarios;
	}

	public void setQuantidadeDeFuncionarios(int quantidadeDeFuncionarios) {
		this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
	}
	
	
	
}
