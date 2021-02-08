package POO_Lista4E;

public class Produto {
	
	private String descricao; 
	private long idproduto;
	private double valor; 
	
	
	
	public Produto() {
		
	}
	public Produto(String descricao, long idproduto, double valor) {
		super();
		this.descricao = descricao;
		this.idproduto = idproduto;
		this.valor = valor;
	}
	

	public String getDescricao() {
		return descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(long idproduto) {
		this.idproduto = idproduto;
	} 
	
	

}
