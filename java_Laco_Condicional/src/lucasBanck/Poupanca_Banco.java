package lucasBanck;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Poupanca_Banco {

	public static void main(String[] args) {
	}
	
	public static void Poupanca_Banco_Fim_Semana() throws ParseException {

		DateFormat arrumaData = new SimpleDateFormat("dd/MM/yyyy");
		Scanner ler = new Scanner(System.in);
		String dataRecebida;
		Date data;
		String descricaoD[] = new String[10], descricaoC[] = new String[10];
		double saldo[] = new double[10];
		char opcaoDC;
		double credito = 0.00, debito = 0.00;
		char opcaoSN;
		char correcaoMonetaria;
		
		/*DESAFIO DA CONTAS GRUPOS DE 4 A 5 ALUNOS CONTAS POSSÍVEIS 
		 * CONTA POUPANÇA - DATA DE ANIVERSÁRIO CORREÇÃO DE 0.05% CONTA 
		 * CORRENTE - PODE EMITI TALÃO NO MAXIMO 3 CONTA ESPECIAL - TEM 
		 * LIMITE DE CHEQUE ESPECIAL CONTA EMPRESA - PODE PEDI EMPRESTIMO 
		 * CONTA ESTUDANTIL - TEM LIMITE ESTUDANTE STOREBO...
		 * 
		 * */
		
		linha(40);
		System.out.println("CONTA POUPANÇA");
		linha(40);
		
		for(int i=0;i<10;i++) {
			
			System.out.printf("Lançamento %d : [D-débito/C-crédito] :",i);
			opcaoDC = ler.nextLine().charAt(0);
				if(opcaoDC == 'D') {
					
					System.out.print("\nDigite o valor para débito :");
					debito = ler.nextDouble();
					if(saldo[i]>0) {
						
						while(saldo[i]<debito) {
							
							System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
							System.out.print("Digite o valor para débito :");
							debito = ler.nextDouble();		
						}
					ler.nextLine();
					System.out.print("Informe a descrição do débito :");
					descricaoD[i] = ler.nextLine();
					saldo[i]+=-debito;
					System.out.printf("Seu saldo atual é R$ %.2f \n", saldo[i]);	
					}else if(saldo[i]==0) {
						System.out.println("Você está sem saldo no momento, faça um crédito primeiro!!!");
					}		
				} else if(opcaoDC =='C') {
					
					System.out.print("\nDigite o valor do crédito: ");
					credito = ler.nextDouble();
					
					 	while(credito<=0) {
							System.out.print("Valor informado negativo ou zero, tente de novo:");
							System.out.print("Digite o valor do crédito: ");
							credito = ler.nextDouble();
					 	}
				  ler.nextLine();
				  System.out.print("Digite a descrição do crédito: ");
				  descricaoC[i] = ler.nextLine();
				  saldo[i]+=+credito;
				  System.out.printf("Seu saldo atual é R$ %.2f \n", saldo[i]);
				}else {
					
					System.out.println("Você não escolheu Debito ou Crédito!!!");
					
				}
				
				System.out.print("Continua S/N :");
				opcaoSN = ler.nextLine().toUpperCase().charAt(0);
			    
				if(opcaoSN == 'N') {				
					break;
				}				
		}
		
		System.out.println("Deseja fazer a correção hoje sim ou não? ");
		correcaoMonetaria = ler.nextLine().toUpperCase().charAt(0);

		System.out.printf("Innforme a data do seu nascimento em dd/MM/yyyy\n");
		dataRecebida = ler.nextLine();
		data = arrumaData.parse(dataRecebida);
		System.out.println(data);	
		
		
		
	}
	
	public static void linha(int tamanho) 
	{
		for (int x=1;x<tamanho; x++)
		{
			System.out.print("═");
		}
		System.out.println();
	}


}
