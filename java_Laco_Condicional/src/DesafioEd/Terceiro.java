package DesafioEd;

public class Terceiro extends Empregado implements Salario {

	private double acrescimo;

	public Terceiro(String nome, double acrescimo) {
		super(nome);
		this.acrescimo = acrescimo;
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

//	public void salario() {
//		
//	}


	
	public double Salario(int horas, double valorHora, double acrescimo) {
		return horas*(valorHora+(valorHora*(acrescimo/100)));
	}
}
