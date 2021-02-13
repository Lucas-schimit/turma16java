package E_commerce;

import java.util.Scanner;

public class FormaDePagamento {
	
	Scanner ler = new Scanner(System.in);

	private double valorTotal; 
	private double imposto = 0.09;
	
	
	public FormaDePagamento() {
		
	}
	
	public FormaDePagamento(double valorTotal, double imposto) {
		super();
		this.valorTotal = valorTotal;
		this.imposto = imposto;
	}

	public FormaDePagamento(Scanner ler, double valorTotal, double imposto) {
		super();
		this.ler = ler;
		this.valorTotal = valorTotal;
		this.imposto = imposto;
	}

	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
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
	
	

}
