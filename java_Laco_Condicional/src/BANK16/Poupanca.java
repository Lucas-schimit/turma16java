package BANK16;

public class Poupanca extends Conta {

	private int diaAniversario = 10;

	public Poupanca() {
		super();
	}

	public Poupanca(String numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;

	}

	public void Aniversario(int dia) {

		double acrescimo;

		if (diaAniversario == dia) {
			acrescimo = super.getSaldo() * 0.0005;
			super.Creditar(acrescimo);
			System.out.println("O Saldo é: " + this.getSaldo());
		}
	}
}
