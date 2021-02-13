package E_commerce;

import java.util.HashMap;
import java.util.Scanner;

import POO_Lista4E.Produto;

public class MainEcommerce {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		HashMap<Integer, Produto1> prod = new HashMap<Integer, Produto1>(); 
		StringBuilder debito = new StringBuilder();
		int idProdutoRepitido = 0;
		Cliente ca = new Cliente();
		double recebeValor = 0.00;
		
		int opcaoMenu = 0;
		
		prod.put(1, new Produto1(1,"FinalFantasy",10,20.00));
		prod.put(2, new Produto1(2,"CS",10,10.00));
		prod.put(3, new Produto1(3,"Call of Duty",10,30.00));
		prod.put(4, new Produto1(4,"Pokemon",10,40.00));
		prod.put(5, new Produto1(5,"Castlevania",10,50.00));
		prod.put(6, new Produto1(6,"League of Legends",10,60.00));
		prod.put(7, new Produto1(7,"MU- Online",10,60.00));
		prod.put(8, new Produto1(8,"GTAV",10,60.00));
		prod.put(9, new Produto1(9,"Mortal Kombat",10,60.00));
		prod.put(10, new Produto1(10,"Free Fire",10,60.00));
		
		
		System.out.println("*********************** Loja Boa ************************************************");
		System.out.println("Bem Vindo a Loja Boa"
				+ "Escolha a opção que deseja: \n"
				+ "1 - Cadastro \n"
				+ "2 - Carinho \n "
				+ "3 - Sair");
		opcaoMenu = ler.nextInt();
		
		
		System.out.println(opcaoMenu);
		switch (opcaoMenu){
		
		case 1:		
			ca.Cadastro();
		break;
		
		case 2: 
			
			System.out.print("─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄\r\n"
                    + "█░░░█░░░░░░░░░░▄▄░██░█\r\n"
                    + "█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█\r\n"
                    + "█░░░▀░░░▄▄▄▄▄░░██░▀▀░█\r\n"
                    + "─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀\r\n"
                    + "");
			System.out.println("CODIGO \t   ESTOQUE\t  PREÇO\t\t    NOME DO PRODUTO");
			  for(int i = 1; i<=10; i++)
		        {
		            System.out.println(" ▌" + prod.get(i).getIdProduto() + "\t  ▌" +"\t" + prod.get(i).getQuantidade() + " ▌" + "\t\t" + "R$" +prod.get(i).getValor()+  " ▌"+"\t\t" + prod.get(i).getProduto() );
		        }
			  
			  System.out.println();
			  ler.nextLine();
			  System.out.println("Degeja comprar algum produto: S-Sim e N-Não");
			  char opcaoCarrinho = ler.nextLine().toUpperCase().charAt(0);
			  if(opcaoCarrinho == 'S') {
				  do {
					  
					  System.out.println("Informe o codigo do produto que deseja comprar: ");
					  int idProdutoEscolhido = ler.nextInt();
					  if(idProdutoEscolhido == idProdutoRepitido) {
						  
						  System.out.println("O produto já foi selecionado uma vez, não podendo se selecionado uma segunda");
						  
					  }else {
					System.out.println("Informe a quantidade do produto na qual deseja comprar: ");
					double quantidadeDoProduto = ler.nextDouble();
					while (quantidadeDoProduto>10) {
						System.out.println("A quantidade informado não é aceita!!");
						System.out.println("Informe a quantidade do produto na qual deseja comprar: ");
						quantidadeDoProduto = ler.nextDouble();
					}
					double quantidadeAtual = prod.get(idProdutoEscolhido).BaixaProduto(quantidadeDoProduto);
					idProdutoRepitido  =  idProdutoEscolhido; 
					debito.append(prod.get(idProdutoEscolhido).getProduto()+"\t\t"+prod.get(idProdutoEscolhido).MostrarQuantidade());
					ler.nextLine();
					System.out.println("Deseja comprar algum produto da loja novamente : S-sim/ N - não ");
					opcaoCarrinho = ler.nextLine().toLowerCase().charAt(0);
					System.out.println("Deseja visualizar os produtos : S-sim/ N - não ");
					char opcaoVisualizar = ler.nextLine().toUpperCase().charAt(0);
					if(opcaoVisualizar=='S') {
						System.out.println("Ola "+ ca.getNome() + " esse é seu carrinho: ");
						System.out.println("[DESCRICAO]"+"\t\t"+"[QTDE]");
						System.out.println(debito.toString());
					}
					
					System.out.println("Deseja retirar produtos do carrinho : S-sim/ N - não ");
					char opcaoDebito = ler.nextLine().toUpperCase().charAt(0);
					if(opcaoDebito == 'S') {
						
						System.out.println("Informe o codigo do produto que deseja devolver: ");
						int idProdutoEscolhidoDebito = ler.nextInt();
						System.out.println("Informe o codigo do produto que deseja devolver: ");
						double quantidadeDevolver = ler.nextDouble();
						ler.nextLine();
						double quantidadeAtualDebito = prod.get(idProdutoEscolhidoDebito).CreditoProduto(quantidadeDevolver);
					}
					
					  }
					  
					  
				  }while(opcaoCarrinho == 'S');
				  
			  }else {FimDoSystema();}
			  
			
			break;
			
		case 3: 
			System.out.println(" Obrigado por utilizar nossos serviços!!");
			FimDoSystema();
		default: 
			
			System.out.println("Loja Boa");
		}
		
		
	}
	
public static void FimDoSystema() {
	System.out.println("__██████████████\r\n"
            + "-__██▓▓▓▓▓▓▓▓▓ M ▓████\r\n"
            + "-██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██\r\n"
            + "-██████░░░░██░░██████\r\n"
            + "██░░░░████░░██░░░░░░░░██\r\n"
            + "██░░░░████░░░░██░░░░░░██\r\n"
            + "-████░░░░░░██████████\r\n"
            + "-██░░░░░░░░░░░░░██\r\n"
            + "___██░░░░░░░░░██\r\n"
            + "-__██░░░░░░██\r\n"
            + "-_██▓▓████▓▓▓█      ╔═.✵.══════════╗ \r\n"
            + "-██▓▓▓▓▓▓████▓▓█     VOLTE SEMPRE  \r\n"
            + "██▓▓▓▓▓▓███░░███░   ╚══════════.✵.═╝ \r\n"
            + "-██░░░░░░███████\r\n"
            + "-██░░░░███████\r\n"
            + "-__██████████\r\n"
            + "-██▓▓▓▓▓▓▓▓▓██\r\n"
            + "-█████████████");
}

}
