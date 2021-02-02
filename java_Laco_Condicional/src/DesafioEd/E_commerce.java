package DesafioEd;

import java.util.Scanner;

public class E_commerce {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String codigo[] = new String[10];
		String produtosnaloja[] = { "FinalFantasy", "CS", "Call of Duty", "Pokemon", "Castlevania", "League of Legends",
				"MU- Online", "GTAV", "Mortal Kombat", "Free Fire" };
		double preconoproduto[] = { 30.00, 10.00, 20.00, 20.00, 50.00, 10.00, 10.00, 30.00, 50.00, 10.00 };
		int estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		String nomedoUsuario = " ", sexo = " ";
		char sexodoUsuario;
		char opcao1 = 'S';
		char opcaoCarrinho ='N';
		char opcaoFormaDePagamento = 'S';

		System.out.println(
				"**************************************************************************************************************************************************");
		System.out.println("LOJA BOA");
		System.out.println("É BOA MESMO");
		System.out.println(
				"**************************************************************************************************************************************************");
		System.out.println("Obrigada pela escolha da loja");
		
		System.out.print("\n");

		System.out.println("Qual seu nome? ");
		nomedoUsuario = leia.nextLine();
		System.out.println("Digite seu sexo? F - Feminino,  M - Masculino, O - Outros)");
		sexodoUsuario = leia.nextLine().toUpperCase().charAt(0);
		while (sexodoUsuario != 'F' && sexodoUsuario != 'M' && sexodoUsuario != 'O') {
			System.out.println("Voce digitou errado ");
			System.out.println("Digite seu sexo? F - Feminino,  M - Masculino, O - Outros)");
			sexodoUsuario = leia.nextLine().toUpperCase().charAt(0);
		}
		if (sexodoUsuario == 'M') {
			System.out.println("Olá Sr  " + nomedoUsuario + "\nNossa Loja de Games, confira nossos produtos ");
			sexo = "Sr";
		} else if (sexodoUsuario == 'F') {
			System.out.println("Olá Sra  " + nomedoUsuario + "\nNossa Loja de Games, confira nossos produtos ");
			sexo = "Sra";
		} else if (sexodoUsuario == 'O') {
			System.out.println("Olá especial  " + nomedoUsuario + "\nNossa Loja de Games, confira nossos produtos ");
			sexo = "Srx";
		}
		//System.out.println("Volte sempre!!");
		System.out.println(
				"**************************************************************************************************************************************************");
		System.out.println("Codigo\t\t\t\t Estoque\t\t\t\t Valor \t\t\t\t Descriçao do Produto");
		System.out.println(
				"**************************************************************************************************************************************************");
		for (int i = 0; i < 10; i++) {
			codigo[i] = "LB-" + (i + 1);
			System.out.println(codigo[i] + "\t\t\t\t\t" + estoque[i] + "\t\t\t\t\t" + "R$" + preconoproduto[i]
					+ "\t\t\t\t\t" + produtosnaloja[i]);
		}
		// funcao adicionar ou sair
		// Falar Lucas Loiola
		// funcao do carrinho ()
		// regra 10 produtos
		// metodo carrinho(preconoprodutos, produtosnaloja, escolhaquantidade, codigo
		// ,charcomprarMaisouN)
		// funcao extrato()
		// funcao recarregar()

		char opcaoCupom = 'S';
		String codigos = " ", mesmoCodigo[] = { "", "", "", "", "", "", "", "", "", "" };
		int quantidadeEstoque = 0;
		double somaTotal = 0, imposto;
		int quantidadeEstoqueM = 0;
		int novoEstoque[] = new int[10];
		int saindoFora = 0;

		do {
			System.out.println("\n");
			for (int i = 0; i < 10; i++) {
				novoEstoque[i] = estoque[i];
			}
           
			while (opcao1 == 'S') {
				//leia.nextLine();
				System.out.println("Informe o codigo do produto desejado :");
				codigos = leia.nextLine().toUpperCase();
				for (int i = 0; i < 10; i++) {
					while (estoque[i] <= 0 && codigos.equals(codigo[i])) {
						System.out.println("Produto indisponivel, deseja continuar? [S/N]");
						opcao1 = leia.nextLine().toUpperCase().charAt(0);
						if (opcao1 == 'N') {
							saindoFora = 1;
							break;
						} else if (opcao1 == 'S') {
							break;
						}
					}
					
					if(saindoFora == 1) {
						break; 
					}
					if (codigos.equals(codigo[i]) && mesmoCodigo[i].equals("") && estoque[i] > 0) {
						System.out.println("Voce selecionou " + produtosnaloja[i]);
						System.out.println("Digite a quantidade do produto selecionado nos temos " + estoque[i]);
						quantidadeEstoque = leia.nextInt();
						while (quantidadeEstoque > estoque[i]) {
							System.out.println("Quantidade insuficiente");
							System.out.println("Digite a quantidade do produto selecionado nos temos " + estoque[i]);
							quantidadeEstoque = leia.nextInt();
						}
						estoque[i] -= quantidadeEstoque;
						mesmoCodigo[i] = codigos;
						somaTotal += preconoproduto[i] * quantidadeEstoque;
					} else if (codigos.equals(mesmoCodigo[i])) {
						System.out.println("Esse item ja foi selecionadom deseja altera-lo para?");
						quantidadeEstoqueM = leia.nextInt();
						estoque[i] += quantidadeEstoque;
						estoque[i] -= quantidadeEstoqueM;
						somaTotal -= preconoproduto[i] * quantidadeEstoque;
						somaTotal += preconoproduto[i] * quantidadeEstoqueM;
					}
				}
//			for (int i = 0; i < 10; i++) {
//				System.out.println(codigo[i] + "\t\t\t\t\t" + estoque[i] + "\t\t\t\t\t" + "R$" + preconoproduto[i]
//						+ "\t\t\t\t\t" + produtosnaloja[i]);
//			}
				leia.nextLine();
				System.out.println("Deseja comprar mais [s/n]");
				opcao1 = leia.nextLine().toUpperCase().charAt(0);
				leia.nextLine();
			}
			System.out.println("Deseja ver seu carrinho? [S/N]");
			opcaoCarrinho = leia.nextLine().toUpperCase().charAt(0);
			if (opcaoCarrinho == 'S') {
				System.out.println("Os itens selecionados foram :");
				for (int i = 0; i < 10; i++) {
					if (codigo[i].equals(mesmoCodigo[i])) {
						System.out.println(produtosnaloja[i] + "\t \t" + (novoEstoque[i] - estoque[i]) + "\t \t"
								+ preconoproduto[i]);
					}
				}
				 System.out.println("O valor total é R$ " + somaTotal);
			}
			System.out.println("Qual a forma de pagamento desejada?" + "\n1 - A vista (10% de desconto)"
					+ "\n2 - Cartão de crédito (1x)" + "\n3 - Cartão de crédito (2x com 10% de juros) "
					+ "\n4 - Cartão de crédito (3x com 15% de juros) ");
			opcaoFormaDePagamento = leia.nextLine().toUpperCase().charAt(0);
			while (opcaoFormaDePagamento < 0 && opcaoFormaDePagamento > 4) {
				System.out.println("Digite uma opção de pagamento válida: ");
				opcaoFormaDePagamento = leia.nextLine().toUpperCase().charAt(0);
			}
			imposto = somaTotal * 0.09;
			if (opcaoFormaDePagamento == '1') {
				somaTotal = somaTotal * 0.9;
				System.out.println("O valor da sua compra foi de R$ " + (somaTotal + imposto));
			} else if (opcaoFormaDePagamento == '2') {
				System.out.println("O valor da sua compra foi de R$ " + (somaTotal + imposto));
			} else if (opcaoFormaDePagamento == '3') {
				somaTotal = somaTotal * 1.1;
				System.out.println("O valor da sua compra foi de R$ " + (somaTotal + imposto) + ", com parcelas de R$ "
						+ (somaTotal + imposto) / 2);
			} else if (opcaoFormaDePagamento == '4') {
				somaTotal = somaTotal * 1.15;
				System.out.println("O valor da sua compra foi de R$ " + (somaTotal + imposto) + ", com parcelas de R$ "
						+ (somaTotal + imposto) / 3);
			}

			System.out.println("Deseja imprimir o cupom fiscal? [S/N]");
			opcaoCupom = leia.nextLine().toUpperCase().charAt(0);
			if (opcaoCupom == 'S') {
				linha(40);
				System.out.println(
						"**************************************************************************************************************************************************");
				System.out.println("LOJA BOA");
				System.out.println("É BOA MESMO");
				System.out.println(
						"**************************************************************************************************************************************************");
				System.out.println("Obrigada pela escolha da loja");

				for (int i = 0; i < 10; i++) {
					if (codigo[i].equals(mesmoCodigo[i])) {
						System.out.println(produtosnaloja[i] + "\t \t" + (novoEstoque[i] - estoque[i]) + "\t \t"
								+ preconoproduto[i]);
					}
				}
				System.out.println("O total a ser pago é R$" + (somaTotal + imposto));
				System.out.println("O valor total em impostos é R$ " + imposto);
				if (opcaoFormaDePagamento == '1') {
					System.out.println("Pagamento a vista");
				} else if (opcaoFormaDePagamento == '2') {
					System.out.println("Pagamento a vista no cartão de crédito");
				} else if (opcaoFormaDePagamento == '3') {
					System.out.println("Pagamento em 2x no cartão de crédito ");
				} else if (opcaoFormaDePagamento == '4') {
					System.out.println("Pagamento em 3x no cartão de crédito ");
				}

			}
			
			System.out.println("Obrigado por utilizar nosso codigo !!");
			//System.out.println("Você deseja sair para o menu inicial? [S/N]");
			//opcao1 = leia.nextLine().toUpperCase().charAt(0);
		} while (opcao1 != 'S');
	}

	public static void linha(int tamanho) {
		for (int x = 1; x < tamanho; x++) {
			System.out.print("═");
		}
		System.out.println();
	}
}
