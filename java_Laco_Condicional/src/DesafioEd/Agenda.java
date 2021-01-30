package DesafioEd;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		/*rograma
{
	
	funcao inicio()
	{
		//variaveis
		cadeia agenda[24][31] // 0-23 e 0-30
		cadeia nome
		inteiro dia=0, hora=0
		caracter opcao
		// aqui vai ter o inicio do loop
		escreva("Digite o seu nome: ")
		leia(nome)
	
		faca
		{
			
			escreva("\nESCOLHA UM DIA PARA CADASTRO [1/31] :") // usuario digitou entre 1 e 31*
			leia(dia)
			enquanto (dia <=0 ou dia > 31)
			{
				escreva("\nData informada incorreta, escolha uma data entre 1 e 31:")
				leia(dia) //saida do loop
			}
			//dia = dia - 1 //
			dia -= 1 //ajuste para evitar o estouro da matriz
			escreva("SELECIONE A HORA DO EVENTO[0-23]: ") //usuario digitou entre 0 e 23
			leia(hora)
			enquanto( hora < 0 ou hora > 23 )
			{
				escreva("\nHora informada incorreta, escolha entre 0 e 23 h: ")
				leia(hora)
			}
			escreva("\nInforme a tarefa nesta data e hora:")
			leia(agenda[hora][dia])
			escreva("Continua 1-sim ou 2-não:")
			leia(opcao)
			
		} enquanto(opcao=='1')
		para (inteiro x= 0; x<31; x++)
		{
			para(inteiro y=0; y<24;y++)
			{
				se (agenda[y][x] != "")
				{
					escreva("\nDia :",x+1," hora: ",y," : ",agenda[y][x])	
				}
				
			}
		}
	}
}
		 * */
		
		Scanner ler = new Scanner(System.in);
		
		String agenda[][]= new String[24][31];
		String nome; 
		int dia=0, hora=0;
		char opcao = 'i'; 
		
		System.out.println("Informe seu nome: ");
		nome = ler.nextLine();
		
		
		do { 
			
			System.out.printf("\nESCOLHA UM DIA PARA CADASTRO [1/31]");
			dia = ler.nextInt();
			
			while(dia<=0 || dia>31) {
				
				System.out.println("\nData informada incorreta, escolha uma data entre 1 e 31:");
				dia = ler.nextInt();
			}
			
			dia = dia -1;
			
			System.out.printf("\nSELECIONE A HORA DO EVENTO[0-23]:");
			hora = ler.nextInt();
			
			while(hora<0 || hora>23) {
				
				System.out.println("\nHora informada incorreta, escolha uma hora entre 0 e 23:");
				hora = ler.nextInt();
			}
			
			ler.nextLine();
			System.out.printf("\\nInforme a tarefa nesta data e hora:");
			agenda[hora][dia] = ler.nextLine();
			
			System.out.printf("\nContinua 1-sim ou 2-não: ");
			opcao = ler.nextLine().charAt(0);			
			
		}while(opcao=='1');
		
		
		for(int l=0; l<31; l++) {
			for(int c=0;c<24;c++) {
				
				if(agenda[c][l]!=null) {
				
					System.out.printf("[ %d ]",agenda[c][l]);
				}		
			}
			System.out.println("");
			
		}
		
		/*Eu tenho que finalizar */

	}

}
