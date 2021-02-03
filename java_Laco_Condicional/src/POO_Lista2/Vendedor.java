package POO_Lista2;

public class Vendedor extends Pessoa {

	/*
	 * Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado
	 * vendedor tem como atributos da classe Pessoa e também os atributos próprios
	 * como valorVendas (correspondente ao valor monetário dos artigos vendidos) e o
	 * atributo comissao (porcentagem do valorVendas que será adicionado ao
	 * vencimento base do Vendedor).
	 * 
	 */
    
	private double valorVendas; 
	private double comissao = 0.03;
	
	//Foi definido 3% para a comissao.
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	} 
	
}
