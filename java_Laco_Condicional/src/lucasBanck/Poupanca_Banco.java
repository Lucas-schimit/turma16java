package lucasBanck;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;

public class Poupanca_Banco {

	public static void main(String[] args) {
	}
	
	public static void Poupanca_Banco_Fim_Semana() throws ParseException {

		DateFormat arrumaData = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter formartar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime data1;
		LocalDateTime dataAtual;
		Scanner ler = new Scanner(System.in);
		String dataRecebida;
		Date data;
		String descricao[] = new String[10];
		double saldo[] = new double[10], saldoTotal = 0.00;
		char opcaoDC;
		double credito = 0.00, debito = 0.00;
		char opcaoSN =0;
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
					if(saldoTotal>0) {
						
						while(saldoTotal<debito) {
							
							System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
							System.out.print("Digite o valor para débito :");
							debito = ler.nextDouble();		
						}
					System.out.print("Informe a descrição do débito :\n");
					descricao[i] = ler.nextLine();
					saldoTotal = saldoTotal-debito;
					saldo[i] = -debito;
					System.out.printf("Seu saldo atual é R$ %.2f \n", saldoTotal);	
					}else if(saldoTotal==0) {
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
				  descricao[i] = ler.nextLine();
				  saldoTotal+=+credito;
				  saldo[i] = credito;
				  System.out.printf("Seu saldo atual é R$ %.2f \n", saldoTotal);
				}else {
					
					System.out.println("Você não escolheu Debito ou Crédito!!!");
					
				}
				
				System.out.print("Continua S/N :");
				opcaoSN = ler.nextLine().toUpperCase().charAt(0);
			    
				if(opcaoSN == 'N') {				
					break;
				}				
		}
		
		
		System.out.printf("Innforme a data do seu nascimento em dd/MM/yyyy\n");
		dataRecebida = ler.nextLine();
		Date data2 = new SimpleDateFormat("dd/MM/yyyy").parse(dataRecebida);
	
		data1 = convertToLocalDateTimeViaInstant(data2);
		
		dataAtual = LocalDateTime.now();
		
		
		System.out.println("Deseja fazer a correção hoje sim ou não? S/N");
		correcaoMonetaria = ler.nextLine().toUpperCase().charAt(0);
		if (correcaoMonetaria == 'S') 
		{	
			if(data1==dataAtual) {
				
				System.out.println("Parabés seu aniversário ganha mais 0.05%");
				saldoTotal= saldoTotal+(saldoTotal * 0.001);
				
				
			} else {
				
				saldoTotal += (saldoTotal * 0.0005);
			
			}
		}	
		


		System.out.println("Segue abaixo o extrato da movimentação: ");
		
		for(int y=0;y<10;y++)
		{
			if(descricao[y]!= null)
				
				System.out.printf("Você movimentou %.2f com a descricao %S \n", saldo[y],descricao[y]);
               
		}

		
		    System.out.printf("O valor total é de %f\n: ",saldoTotal);
			System.out.println("Obrigado Por utilizar o serviço de poupança");	
		
	}
	
	public static void linha(int tamanho) 
	{
		for (int x=1;x<tamanho; x++)
		{
			System.out.print("═");
		}
		System.out.println();
	}
	public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDateTime();
	}	
}
