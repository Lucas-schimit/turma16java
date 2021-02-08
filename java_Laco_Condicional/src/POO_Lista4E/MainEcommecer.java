package POO_Lista4E;

import java.util.*;


public class MainEcommecer {

	public static void main(String[] args) {
		
		Extrato ext = new Extrato();
		Carinho ca = new Carinho();
		Pagamento pa = new Pagamento();
		Pessoas pe = new Pessoas();
		
		Scanner ler = new Scanner(System.in);
		char opcao = 'S';
		int opcaoPagamento = 0, opcaoPagamento1 = 0;
		int idprodutoSelecionado =0;
		double valorTotal = 0.00;
		double recebeValor = 0.00;
		int x=0;
		double valorFormaPagamento = 0.00;
		double valorComImposto = 0.00;
		
		List<Extrato>  listaDebito = new ArrayList<Extrato>();
		
		
		System.out.println("Loja Boa");
		System.out.println("Aqui realmente a loja é Boa!!!");
		
		HashMap<Integer, Produto> prod = new HashMap<Integer, Produto>(); 
		HashMap<Integer, Estoque> Est = new HashMap<Integer, Estoque>(); 
		HashMap<Integer, Extrato> Ext = new HashMap<Integer, Extrato>(); 
		List<Pessoas>  pessoasC = new ArrayList<Pessoas>();
		StringBuilder debito = new StringBuilder();
		

		prod.put(1, new Produto("FinalFantasy",1,30.00));
		prod.put(2, new Produto("CS",2,10.00));
		prod.put(3, new Produto("Call of Duty",3,20.00));
		prod.put(4, new Produto("Pokemon",4,20.00));
		prod.put(5, new Produto("Castlevania",5,50.00));
		prod.put(6, new Produto("League of Legends",6,10.00));
		prod.put(7, new Produto("MU- Online",7,10.00));
		prod.put(8, new Produto("GTAV",8,30.00));
		prod.put(9, new Produto("Mortal Kombat",9,50.00));
		prod.put(10, new Produto("Free Fire",10,10.00));
		
		Est.put(1, new Estoque("FinalFantasy",10));
		Est.put(2, new Estoque("CS",10));
		Est.put(3, new Estoque("Call of Duty",10));
		Est.put(4, new Estoque("Pokemon",10));
		Est.put(5, new Estoque("Castlevania",10));
		Est.put(6, new Estoque("League of Legends",10));
		Est.put(7, new Estoque("MU- Online",10));
		Est.put(8, new Estoque("GTAV",10));
		Est.put(9, new Estoque("Mortal Kombat",10));
		Est.put(10, new Estoque("Free Fire",10));

		System.out.println(
				"**************************************************************************************************************************************************");
		
		System.out.print("─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄\r\n"
		                    + "█░░░█░░░░░░░░░░▄▄░██░█\r\n"
		                    + "█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█\r\n"
		                    + "█░░░▀░░░▄▄▄▄▄░░██░▀▀░█\r\n"
		                    + "─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀\r\n"
		                    + "");

		//usar uma interface
		 System.out.println("+-+   +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+\r\n"
		 		+ "   |É|   |b| |o| |a|   |m| |e| |s| |m| |o|\r\n"
		 		+ "   +-+   +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+");
				
        System.out.println("CODIGO \t   ESTOQUE\t  PREÇO\t\t    NOME DO PRODUTO");
        for(int i = 1; i<=10; i++)
        {
            System.out.println(" ▌" + prod.get(i).getIdproduto() + "\t  ▌" +"\t" + Est.get(i).getQuantidade() + " ▌" + "\t\t" + "R$" +prod.get(i).getValor()+  " ▌"+"\t\t" + Est.get(i).getDescricao() );
        }
		
		//do {

           // if(decisao == 1)
          //  {
            System.out.println("Escreva seu nome: ");
            ler.nextLine();
            String nome = ler.nextLine();
            System.out.println("Escreva seu genero:  ");
            char genero = ler.next().toUpperCase().charAt(0);
                pe.setSexo(genero);
                pe.setNomePessoa(nome);
                ler.nextLine();
           System.out.println(pe.tratamentoGenero(genero)+ " "+ pe.getNomePessoa()+ " cadastro concluido..."); 
           /* }
            else if(decisao ==2) {
                   //Carrinho();
          
        		
            }else if(decisao == 3) {
                System.exit(0);
            }
            System.out.println("Deseja ir ao menu inicial: ");
            opcao = ler.next().toUpperCase().charAt(0);
            }while(opcao == 'S'); */
		
		
	//	System.out.println("[COD PRODUTO]"+"\t"+"[NOME DO PRODUTO]"+"\t\t\t"+"[ESTOQUE]"+"\t\t\t"+"[VALOR UNITARIO]");
		
		/*for(int i = 1; i<=10; i++) {
	
		System.out.print(prod.get(i).getIdproduto()+"\t\t"+Est.get(i).getDescricao()+"\t\t\t\t\t"+Est.get(i).getQuantidade()+"\t\t\t\t"+prod.get(i).getValor()+"\n");
		
	     } */
		 
		System.out.println("Deseja comprar algum produto da loja: S-sim/ N - não ");
      	opcao = ler.nextLine().toUpperCase().charAt(0);
		
		while(opcao=='S'){

		System.out.println("Informe o ID do produto na qual deseja comprar: ");
		int idproduto = ler.nextInt(); 
		if(idprodutoSelecionado == idproduto) {
			
			System.out.println("O produto já foi selecionado uma vez, não podendo se selecionado uma segunda");
			
		}else{
		System.out.println("Informe a quantidade do produto na qual deseja comprar: ");
		double quantidade = ler.nextDouble();
		System.out.println("Informe a quantidade do produto na qual deseja devolver: ");
		double quantidade1 = ler.nextDouble();
		//if (quantidade<=0 && quantidade>=10) {System.out.println(" Não é permitido selecionar maior ou menor"
			//	+ "do que o estoque");}
		double quantidadeAtual = Est.get(idproduto).BaixaProduto(quantidade);
		double quantidadeCreditra = Est.get(idproduto).CreditoProduto(quantidade1);
		recebeValor +=  (quantidade* prod.get(idproduto).getValor());
	    debito.append(Est.get(idproduto).getDescricao()+"\t\t"+Est.get(idproduto).MostrarQuantidade()+"\n");
		ler.nextLine();
		System.out.println("Deseja comprar algum produto da loja novamente : S-sim/ N - não ");
		opcao = ler.nextLine().toUpperCase().charAt(0);
		idprodutoSelecionado = idproduto; 
		System.out.println("Deseja visualizar os produtos : S-sim/ N - não ");
		char opcaoVisualizar = ler.nextLine().toUpperCase().charAt(0);
		if(opcaoVisualizar=='S') {
			
			System.out.println(debito.toString());
		}
		}
		}
		
		
		
	   // System.out.println(recebeValor);
   do {
		System.out.println("Escolha a forma na qual deseja pagar: \n"
				+ "1 - A VISTA - 10% DESCONTO\n"
				+ "2 - CARTÃO - 1 VEZ (VALOR NORMAL - SEM DESCONTO)\n"
				+ "3 - CARTÃO - 2 VEZES(COM 10% DE JUROS SOBRE O VALOR TOTAL)\n"
				+ "4 - CARTÃO - 3 VEZES (COM 15% DE JUROS SOBRE O VALOR TOTAL)\n ");
		opcaoPagamento = ler.nextInt();
		
		if(opcaoPagamento==1) {
			
			valorFormaPagamento = pa.PagamentoAvista(recebeValor);
			
			System.out.println("O Valor total é de "+ recebeValor+" você teve o desconto de 10%: "+valorFormaPagamento);
		
		opcaoPagamento1 =2;
		
		}else if(opcaoPagamento==2) {
			
			valorFormaPagamento=pa.PagamentoCartao1(recebeValor);
			
			System.out.println("O Valor total é de "+ recebeValor+" você pagara o valor normal da compra: "+pa.PagamentoCartao1(recebeValor));
			
			opcaoPagamento1 =2;
			
		}else if(opcaoPagamento==3) {
			
			valorFormaPagamento = (pa.PagamentoCartao2(recebeValor) *2);
			System.out.println("O Valor total é de "+ recebeValor+" você pagara juros de 10% no valor total, e a Primeira parcela é de: "+pa.PagamentoCartao2(recebeValor));
			System.out.println("O Valor total é de "+ recebeValor+" você pagara juros de 10% no valor total, e a Segunda parcela é de: "+pa.PagamentoCartao2(recebeValor));
			opcaoPagamento1 =2;
			
		}else if(opcaoPagamento==4) {
			
			valorFormaPagamento = (pa.PagamentoCartao3(recebeValor)*3);
			System.out.println("O Valor total é de  "+ recebeValor+" você pagara juros de 15% no valor total, e a Primeira parcela é de: "+pa.PagamentoCartao3(recebeValor));
			System.out.println("O Valor total é de "+ recebeValor+" você pagara juros de 15% no valor total, e a Segunda parcela é de: "+pa.PagamentoCartao3(recebeValor));
			System.out.println("O Valor total é de "+ recebeValor+" você pagara juros de 15% no valor total, e a Terceira parcela é de: "+pa.PagamentoCartao3(recebeValor));
			
			opcaoPagamento1 =2;
			
		}else {
			 
				System.out.println("A opção escolhida não se aplica!!");
				System.out.println("Deseja voltar ao começo se 1 - Sim 2 - Não");
				opcaoPagamento1 = ler.nextInt();	
		}
	}while(opcaoPagamento1==1);
		
   			valorComImposto = (recebeValor*0.09);
   			System.out.println();
			linha(60);
			System.out.println("*****************Cupom Fiscal **********************");
			System.out.println("[COD PRODUTO]"+"\t\t"+"[QTDE]"+"\t\t"+"[VALOR FINAL]");
			System.out.println("Com imposto de 9% " + valorComImposto);
			System.out.println("CNPJ: 171.1777.171");
			linha(60);
			
			
			System.out.println(debito.toString()+"\t\t\t\t\t\t"+valorFormaPagamento);
			
			
			
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
	public static void linha(int tamanho) {
		for (int x = 1; x < tamanho; x++) {
			System.out.print("═");
		}
		System.out.println();
	}
   
	
}
