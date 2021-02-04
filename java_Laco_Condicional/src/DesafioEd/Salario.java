package DesafioEd;

public interface Salario {
	
	public default double Salario(int horas, double valorHora) {
		double SalarioTotal;
		
		SalarioTotal = (horas*valorHora);
		return SalarioTotal;
		
	}

}
