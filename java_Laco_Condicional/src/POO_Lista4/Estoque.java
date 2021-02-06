package POO_Lista4;

public class Estoque {
	
	private String produto; 
	private long idProduto;
	private String Descricao;
	public double quantidade;
	
	
	
	public Estoque(String produto, long idProduto, String descricao, double quantidade) {
		super();
		this.produto = produto;
		this.idProduto = idProduto;
		Descricao = descricao;
		this.quantidade = quantidade; 
	}
	
	public String getProduto() {
		return produto;
	}
	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Estoque setProduto(String produto) {
		this.produto = produto;
		return null;
	}
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	

}
