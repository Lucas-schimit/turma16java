package E_commerce;

public class Produto1 {
	
	private int idProduto;
	private String produto; 
	private double quantidade;
	private double Valor;
	
	
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}
	
	public Produto1() {
		
	}
	
	public double BaixaProduto(double debito) {
		if(this.quantidade<=0 && this.quantidade>=10) {
			this.quantidade = quantidade; 
		}else {
			quantidade = (quantidade - debito);	
		}
		return quantidade;
	}
	
	public double CreditoProduto(double credito) {
		if(this.quantidade<=0 && this.quantidade>=10) {
			this.quantidade = quantidade; 
		}else {
			quantidade = (quantidade + credito);	
    	}
		return quantidade;
	}
	
	public double MostrarQuantidade() {
		 double mostrar = (10-quantidade);
		 return mostrar;
	}
	
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public Produto1(int idProduto,String produto, long quantidade, double Valor) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.idProduto = idProduto;
		this.Valor = Valor;
	}
	
}
