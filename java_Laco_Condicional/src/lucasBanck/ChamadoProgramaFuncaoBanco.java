package lucasBanck;

import java.text.ParseException;
import java.util.Scanner;

public class ChamadoProgramaFuncaoBanco {

	public static void main(String[] args) throws ParseException {
		
		Scanner ler = new Scanner(System.in);
		char opcao; 
		
		Poupanca_Banco Poupanca_Banco = new Poupanca_Banco();
		ContaCorrente ContaCorrente = new ContaCorrente();
		
		
		System.out.println("Banco Final de Semana");

		do 
		{
				
			System.out.println("1 - CONTA POUPANÇA\r\n"
					+ "2 - CONTA CORRENTE\r\n"
					+ "3 - CONTA ESPECIAL \r\n"
					+ "4 - CONTA EMPRESA\r\n"
					+ "5 - CONTA ESTUDANTIL\r\n"
					+ "6 - SAIR\r\n"
					+ "");
			System.out.print("Digite o numero de sua opção: ");
			opcao = ler.next().charAt(0);
			
			if (opcao == '6')
			{
				break;
			}
			else if (opcao == '1') 
			{
				lucasBanck.Poupanca_Banco.Poupanca_Banco_Fim_Semana();
				
			}else if(opcao == '2') {
				
				ContaCorrente.Conta_Corrente_Banco_Fim_Semana();
	
			}
			
			
		} while (true);
		//saida
		System.out.println("Obrigado, volte sempre!!!");
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
