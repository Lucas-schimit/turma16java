package DesafioEd;

public class Empregado implements Salario {
	private String nome;
	private int matricula;
	public int horas;
	public double valorHoras;
	double SalarioTotal;
	
	
	public Empregado(String nome) {
		this.nome = nome;

	}

	public Empregado(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double salario(double salario) {
		salario = this.valorHoras * this.horas;
		return salario;
	}

	public double Salario(int horas, double valorHora) {
		return (horas*valorHora);
	}
}
