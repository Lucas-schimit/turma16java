package POO_Lista2;

public class Operario extends Pessoa {

	/* Implemente a classe Operario como subclasse da classe Pessoa. Um determinado
	 * oper�rio tem como atributos da classe Pessoa e tamb�m os atributos pr�prios
	 * como valorProducao (que corresponde ao valor monet�rio dos artigos
	 * efetivamente produzidos pelo oper�rio) e comissao (que corresponde �
	 * porcentagem do valorProducao que ser� adicionado ao vencimento base do
	 * oper�rio).
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
