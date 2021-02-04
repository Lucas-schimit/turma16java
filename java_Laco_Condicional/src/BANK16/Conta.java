package BANK16;

public class Conta {

	private String numero;
	private String cpf;
	private double saldo;
	
	
	public Conta() {
		
	}

	public Conta(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	
	
	public void Debitar(double debito) {
		
		if(this.saldo<=0) {
			
			System.out.println(" Valor informado não corresponde ao solicito");
			
		}else {
			
		this.saldo -= debito;	
		
		}
	}
	
	public void Creditar(double creditar) {
		
		this.saldo += creditar;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

}
