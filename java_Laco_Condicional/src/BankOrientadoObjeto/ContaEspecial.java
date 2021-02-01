package BankOrientadoObjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaEspecial {

	// Declara��o de atributos
		private double saldo;
		private double limiteDisponivel;
		private List<Extrato> extrato = new ArrayList<Extrato>();

		// Fun��o construtor
		public ContaEspecial() { 
			this.setSaldo(0);
			this.setLimiteDisponivel(1000);
		}

		public ContaEspecial(double saldo, double limiteDisponivel) {
			this.setSaldo(saldo);
			this.setLimiteDisponivel(limiteDisponivel);
		}

		// Saldo
		public double getSaldo() {
			return this.saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		// Emprestimo disponivel
		public double getLimiteDisponivel() {
			return this.limiteDisponivel;
		}

		public void setLimiteDisponivel(double limiteDisponivel) {
			this.limiteDisponivel = limiteDisponivel;
		}
		
		 // Extrato
			public List<Extrato> getExtrato(){
				return this.extrato;
			}
			
			public void setExtrato(Extrato itemExtrato){
				this.extrato.add(itemExtrato);
			}

		// --------------------------------------------------------------------------
		// FUN��O LIMITE
		public void limite() {
			double valorLimite = 0.00;
			boolean isValid;
			String descricao, transacao = "Limite";
			Scanner scan = new Scanner(System.in);
			
			System.out.println("**********************************************");
			System.out.println("\nMENU DE LIMITE\n");

				do {
					isValid = true;
					if (this.limiteDisponivel > 0) {
						System.out.printf("Insira o valor do limite at� R$ %.2f \n", this.limiteDisponivel);
						valorLimite = scan.nextDouble();

						if (valorLimite > this.limiteDisponivel) {
							System.out.printf("\nVoc� possui apenas %.2f de limite dispon�nel",
									this.limiteDisponivel);
							isValid = false;
						} else {
							this.saldo += valorLimite;
							this.limiteDisponivel -= valorLimite;
							
							System.out.println("Digite A descri��o da solicita��o: ");
							descricao = scan.nextLine();
							
							Extrato itemExtrato = new Extrato(); 
							itemExtrato.setValor(valorLimite);
							itemExtrato.setTransacao(transacao);
							itemExtrato.setDescricao(descricao);
							
							this.setExtrato(itemExtrato);
			
						}

					} else {
						System.out.println("Voc� n�o possui valor dispon�vel para empr�stimo\n");
						break;
					}

				} while (isValid == false);		
		}
		// --------------------------------------------------------------------------------

		// FUN��O DEBITO

		public void debitar() {
			Scanner scan = new Scanner(System.in);
			double debito;
			String descricao, transacao = "D�bito";
			
			System.out.println("**********************************************");
			System.out.println("MENU DEBITO\n\n");
			System.out.printf("Saldo atual: R$ %.2f", this.saldo);

			do {
				System.out.println("\nDigite o valor que quer debitar: ");
				debito = scan.nextDouble();

				if (debito < this.saldo) {
					this.saldo -= debito;
					
					System.out.println("Digite A descri��o da solicita��o: ");
					descricao = scan.nextLine();
					
					Extrato itemExtrato = new Extrato(); 
					itemExtrato.setValor(debito);
					itemExtrato.setTransacao(transacao);
					itemExtrato.setDescricao(descricao);
					
					this.setExtrato(itemExtrato);
					
					break;
				} else {
					System.out.println("\nValor maior que o dispon�vel em conta");
				}
					
			} while (debito > this.saldo);
			
			
		}
		// --------------------------------------------------------------------------------

		// FUN��O CR�DITO

		public void creditar() {
			Scanner scan = new Scanner(System.in);
			double credito;
			String descricao, transacao = "Cr�dito";
			
			System.out.println("\n**********************************************");
			System.out.println("MENU CREDITO\n\n");
			System.out.printf("Saldo atual: R$ %.2f", this.saldo);

			System.out.println("\nDigite o valor que quer creditar: ");
			credito = scan.nextDouble();

			this.saldo += credito;
			
			System.out.println("Digite A descri��o da solicita��o: ");
			descricao = scan.nextLine();
			
			Extrato itemExtrato = new Extrato(); 
			itemExtrato.setValor(credito);
			itemExtrato.setTransacao(transacao);
			itemExtrato.setDescricao(descricao);
			
			this.setExtrato(itemExtrato);

			// addExtrato(descricao, saldo);

		}

		// --------------------------------------------------------------------------------

		// FUN��O EXTRATO

		public void showExtrato() {
			 System.out.println ("\n**********************************************");
			 System.out.println ("Extrato da Conta Empresa\n");
			for (Extrato obj : this.extrato) {
			    System.out.printf ("\nData: %s\t Transa��o: %s\t Descri��o: %s\t Valor: %.2f " , obj.getData() ,  obj.getTransacao() , obj.getDescricao() , obj.getValor());
			}
		}
	
	
}
