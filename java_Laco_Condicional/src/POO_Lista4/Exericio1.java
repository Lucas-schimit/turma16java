package POO_Lista4;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Exericio1 {
	
	public static void main(String args[]) {
		
		/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		  trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		  programa deverá atender as seguintes funcionalidades:
	      Armazenar dados da List ok
		  Remover dados da list; ok
		  Atualizar dados da list. ok
		  Apresentar todos os dados da list. 
		 * */
		
	    List <Estoque> estoque = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		String nome, descricao;
		long id;
		double quantidade;
		char opcao = 'S'; 
		
		do {
		System.out.println("Estoque de produtos de Restaurante");
		System.out.println("Informe o nome do produto");
		nome = ler.nextLine();
		System.out.println("Informe o id do produto");
		id = ler.nextLong();
		System.out.println("Informe o descrição do produto");
		descricao = ler.nextLine();
		ler.nextLine();
		System.out.println("Informe a quantidade do produto");
		quantidade = ler.nextDouble();
		estoque.add(new Estoque(nome,id,descricao,quantidade));
		ler.nextLine();
		System.out.println("Deseja informar outro produto: S- Sim /N - Não");
		opcao = ler.nextLine().toUpperCase().charAt(0);
		}while(opcao == 'S');
		
		System.out.println("Deseja informar um produto para ser removido: S- Sim /N - Não");
		opcao = ler.nextLine().toUpperCase().charAt(0);
		ler.nextLine();
		
		while(opcao == 'S'){
			
			System.out.println("Deseja remover qual produto do estoque, por favor informe a descricao: ");
			nome = ler.nextLine();
			ler.nextLine();
			
			
			
			for (int i = 0; i < estoque.size(); i++) 
            {
                    if (estoque.get(i).getProduto().equals(nome)) 
                    {
                      estoque.remove(i);
                    }
            }
			
			System.out.println("Deseja informar outro produto para ser removido: S- Sim /N - Não");
			opcao = ler.nextLine().toUpperCase().charAt(0);
			ler.nextLine();
		}
				
		ler.nextLine();
		
		System.out.println("Segue o resultado da sua consulta!!!");
		ler.nextLine();
		
		for(Estoque est : estoque) {
			
			System.out.println(" A quantidade do poduto " +est.getProduto()+"\t\t"+ est.getQuantidade());
			
		}
		
	}

}
