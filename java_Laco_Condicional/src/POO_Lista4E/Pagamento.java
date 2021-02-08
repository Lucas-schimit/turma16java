package POO_Lista4E;

import java.util.*;

public class Pagamento {
	
	Scanner ler = new Scanner(System.in);

	private double valorTotal; 
	private double imposto = 0.09;
	
	Estoque est = new Estoque();
	
    
	
	public double PagamentoAvista(double valorTotal) {
		this.valorTotal = valorTotal; 
		double desconto =(valorTotal * 0.1);
		 valorTotal = (valorTotal - desconto);
		 return valorTotal; 
	}
	
	public double PagamentoCartao1(double valorTotal) {
		this.valorTotal = valorTotal;
		return valorTotal; 
	}
	
	public double PagamentoCartao2(double valorTotal) {
		this.valorTotal = valorTotal;
		double juros =(valorTotal * 0.1);
		double valorTotalComJuros = (valorTotal+juros);
		return (valorTotalComJuros/2);
	}
	
	public double PagamentoCartao3(double valorTotal) {
		this.valorTotal = valorTotal;
		double juros =(valorTotal * 0.15);
		double valorTotalComJuros = (valorTotal+juros);
		return (valorTotalComJuros/3);
	}
	
	
	public void FinalizarPagamento() {
		System.out.println("Obrigado por utilizar nossos serviços!!!");
	}
	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public double getImposto() {
		return imposto;
	}


	public void setImposto(double imposto) {
		this.imposto = imposto;
	}


	public Pagamento(double valorTotal, double imposto) {
		super();
		this.valorTotal = valorTotal;
		this.imposto = imposto;
	}
	
	public Pagamento() {
		
	}

}
