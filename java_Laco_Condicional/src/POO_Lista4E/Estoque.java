package POO_Lista4E;

public class Estoque {

	
	private String descricao;
	private double quantidade;
	
	
	public Estoque(String descricao, double quantidade) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
