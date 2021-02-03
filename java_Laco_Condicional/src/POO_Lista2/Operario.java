package POO_Lista2;

public class Operario extends Pessoa {

	/* Implemente a classe Operario como subclasse da classe Pessoa. Um determinado
	 * operário tem como atributos da classe Pessoa e também os atributos próprios
	 * como valorProducao (que corresponde ao valor monetário dos artigos
	 * efetivamente produzidos pelo operário) e comissao (que corresponde à
	 * porcentagem do valorProducao que será adicionado ao vencimento base do
	 * operário).
	 * */
	
	private double valorProducao;
	private double comissao;
	
	
	
	public double VencimentoBaseDoOperario() {	
		double valorComissao;
		valorComissao = (valorProducao * comissao);
		return (valorProducao + valorComissao);
	}


	public double getValorProducao() {
		return valorProducao;
	}


	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
