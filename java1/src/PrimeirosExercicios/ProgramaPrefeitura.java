package PrimeirosExercicios;

import java.util.Scanner; 

public class ProgramaPrefeitura {

	public static void main(String[] args) {
		/*
		 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
          a) média do salário da população; 
          b) média do número de filhos; 
          c) maior salário; 
          d) percentual de pessoas com salário até R$100,00. 
		 * */
		
		double MediaSalario = 0.0, MediaFilho = 0.0, MaiorSalario = 0.0, salario = 0.0, Filho = 0.0;
		int Cont = 0, TamanhoPopulacao = 3; 
		String nomes[] = null;
		
		Scanner ler = new Scanner(System.in); 
		
		

		
		for (int i=0; i<TamanhoPopulacao; i++)
		{
			System.out.println("Informe seu nome: ");
			nomes[i]= ler.nextLine();
			
			System.out.println("Informe seu salario: ");
			salario = ler.nextDouble();
			MediaSalario += salario;
			
			System.out.println("Informe seus filhos: ");
			Filho = ler.nextDouble();
			MediaFilho += Filho;
			
			if(salario>MaiorSalario)
			{
				MaiorSalario = salario;
			}else if(salario==100) {
				Cont += +1;
			}
					
		}
		
		System.out.printf("Média do salário da população: %f", (MediaSalario/TamanhoPopulacao));
		System.out.printf("\nMédia de filhos da populaçao: %f", (MediaFilho/TamanhoPopulacao));
		System.out.printf("\nO maior Salario é: %f",MaiorSalario);
		System.out.printf("\nO numero de pessoas com salario 100 é de: %d",Cont);

		

	}

	
	public static void pula(){
		System.out.println();
	}
}
