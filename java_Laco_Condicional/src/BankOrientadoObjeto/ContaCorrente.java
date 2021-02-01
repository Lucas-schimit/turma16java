package BankOrientadoObjeto;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaCorrente {
	
	// Declara��o de atributos
		private double saldo;
		private int taloesDisponiveis;
		private List<Extrato> extrato = new ArrayList<Extrato>();

		// Fun��o construtor
		public ContaCorrente() { 
			this.setSaldo(0);
			this.setTaloesDisponiveis(3);
		}

		public ContaCorrente(double saldo, int taloesDisponiveis) {
			this.setSaldo(saldo);
			this.setTaloesDisponiveis(taloesDisponiveis);
		}

		// Saldo
		public double getSaldo() {
			return this.saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		// Emprestimo disponivel
		public int getTaloesDisponiveis() {
			return this.taloesDisponiveis;
		}

		public void setTaloesDisponiveis(int taloesDisponiveis) {
			this.taloesDisponiveis = taloesDisponiveis;
		}
		
		 // Extrato
			public List<Extrato> getExtrato(){
				return this.extrato;
			}
			
			public void setExtrato(Extrato itemExtrato){
				this.extrato.add(itemExtrato);
			}

		// --------------------------------------------------------------------------
		// FUN��O EMPRESTIMO
		public void taloesCheque() {
			int qtdTaloes = 0;
			boolean isValid;
			String descricao, transacao = "Tal�o de Cheque";
			Scanner scan = new Scanner(System.in);
			
			System.out.println("**********************************************");
			System.out.println("\n\tMENU TAL�ES DE CHEQUE\n");

				do {
					isValid = true;
					if (this.taloesDisponiveis > 0) {
						System.out.printf("Quantos tal�es voc� deseja emitir? %d dispon�veis\n", this.taloesDisponiveis);
						qtdTaloes = scan.nextInt();

						if (qtdTaloes > this.taloesDisponiveis) {
							System.out.printf("\nVoc� possui apenas %d de tal�es dispon�veis",
									this.taloesDisponiveis);
							isValid = false;
						} else {
							this.taloesDisponiveis -= qtdTaloes;
							
							System.out.println("Digite A descri��o da solicita��o: ");
							descricao = scan.nextLine();
							
							Extrato itemExtrato = new Extrato(); 
							itemExtrato.setValor((int) qtdTaloes);
							itemExtrato.setTransacao(transacao);
							itemExtrato.setDescricao(descricao);
							
							this.setExtrato(itemExtrato);
						}

					} else {
						System.out.println("Voc� j� atingiu o limite de tal�es para a sua conta\n");
						break;
					}

				} while (isValid == false);		
		}
		// --------------------------------------------------------------------------------

		// FUN��O DEBITO

		public void debitar() {
			Scanner scan = new Scanner(System.in);
			double debito;
			String descricao, transacao ="D�bito";
			System.out.println("**********************************************");
			System.out.println("\tMENU DEBITO\n\n");
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
			System.out.println("\tMENU CREDITO\n\n");
			System.out.printf("Saldo atual: R$ %.2f", this.saldo);

			System.out.println("\nDigite o valor que quer debitar: ");
			credito = scan.nextDouble();

			this.saldo += credito;
			
			System.out.println("Digite A descri��o da solicita��o: ");
			descricao = scan.nextLine();
			
			Extrato itemExtrato = new Extrato(); 
			itemExtrato.setValor(credito);
			itemExtrato.setTransacao(transacao);
			itemExtrato.setDescricao(descricao);
			
			this.setExtrato(itemExtrato);

		}

		// --------------------------------------------------------------------------------

		// FUN��O EXTRATO

		public void showExtrato() {
			 System.out.println ("\n**********************************************");
			 System.out.println ("\tExtrato da Conta Empresa\n");
			for (Extrato obj : this.extrato) {
			    System.out.printf ("\nData: %s\t Transa��o: %s\t Descri��o: %s\t Valor: %.2f " , obj.getData() ,  obj.getTransacao() , obj.getDescricao() , obj.getValor());
			}
		}

}
