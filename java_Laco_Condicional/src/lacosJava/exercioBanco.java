package lacosJava;

import java.util.Scanner; 

public class exercioBanco {

	public static void main(String[] args) {
		/*DESAFIO DA CONTAS

GRUPOS DE 4 A 5 ALUNOS


CONTAS POSS�VEIS

CONTA POUPAN�A - DATA DE ANIVERS�RIO CORRE��O DE 0.05%
CONTA CORRENTE - PODE EMITI TAL�O NO MAXIMO 3
CONTA ESPECIAL - TEM LIMITE DE CHEQUE ESPECIAL 
CONTA EMPRESA - PODE PEDI EMPRESTIMO
CONTA ESTUDANTIL - TEM LIMITE ESTUDANTE


STOREBOARD DE TELAS

[1/1]

NOME DO BANCO G#
//SLOGAN - FRASE


1 - CONTA POUPAN�A
2 - CONTA CORRENTE
3 - CONTA ESPECIAL 
4 - CONTA EMPRESA
5 - CONTA ESTUDANTIL
6 - SAIR

SELECIONE O TIPO DE CONTA:_

[1 / 2 ] - CONTA XXXXX


10 movimentos
SELECIONE O MOVIMENTO - D/C:
VALOR: _
DESCRI��O: 
SALDO ATUAL:_
CONTINUA S/N:
A CONTA N�O PODE FICA NEGATIVA

PEDIDO POR CONTA:
CONTA POUPAN�A - CORRE��O MONET�RIA S/N: (SALDO +  0.05%)
CC - DESEJA EMITI TAL�O S/N: SE SIM S� ACEITA ENTRE 1/3: 
C ESPECIAL - DESEJA USAR O LIMITE - SE SIM QUANTO: [1000] - SALDO
C EMPRESA - DESEJA FAZER UM EMPRESTIMO S/N: SE SIM O LIMITE �  10.000 - SALDO
C ESTUDANTIL - DESEJA USAR O LIMITE DE ESTUDANTE - S/N: SE SIM ELE TE PODE USAR 5 MIL - SALDO
AP�S MOSTRA O NOVO SALDO


VOLTA PARA O MENU INICIAL

		 * 
		 * */

		Banco_Conta_Poupanca();
		
	}
	public  static void Banco_Conta_Poupanca() {
		
		double saldoTotal = 0.00, saldo = 0.00; 
		char movimentacao = 't', continuacao = 'o', monetaria = 'o';
		String descricao = "";
		int conta = 0, saldoNegativo =0;
		
		Scanner ler = new Scanner(System.in);
		
		
		do {
		System.out.printf("\nSELECIONE O MOVIMENTO - D/C: ");
		movimentacao = ler.next().charAt(0);
		System.out.printf("\nEntre com o Valor: ");
		saldo = ler.nextFloat();
		
		if(saldoTotal>=0) {
	
		if(movimentacao == 'D'||movimentacao == 'd')
		{
			saldoTotal += - saldo; 
			
		}else if(movimentacao == 'C'||movimentacao == 'c') {
			
			saldoTotal += + saldo;	
		}
			
		}else if(saldoTotal<0 || saldoTotal<0 && conta==0 && movimentacao == 'D'){
			
			System.out.printf("N�o pode fazer movimenta��o com saldo negativo");		
			break;
			
		}
		
		System.out.println("\n Descri��o: ");
		descricao = ler.next();
		
		System.out.printf("\n CONTA POUPAN�A - CORRE��O MONET�RIA S/N: ");
		monetaria = ler.next().charAt(0);
		
		
		if(monetaria == 'S'||monetaria == 's')
		{
			saldoTotal += + saldo * 0.05; 
			
		}else if(monetaria == 'N'||monetaria == 's') {
			
			System.out.printf("\n Voc� escolheu a op��o sem corre��o monetaria");
			
		}
		
		System.out.printf("\n CONTINUA S/N: ");
		continuacao = ler.next().charAt(0);
		
		if(continuacao == 'S'||movimentacao == 's')
		{
			conta++;	 
			
		}else if(continuacao == 'N'||continuacao == 'n') {

			System.out.printf("Seu saldo �: %.2f",saldoTotal);
		}
		
		}while(continuacao == 'S' && conta<10 ||movimentacao == 's' && conta<10);
		
		if(conta==9) {
			System.out.println("\n Voc� ecedeu o numero de consulta!!");
		}
			
		
		System.out.printf("\nFim da Consulta!!!");
	}
	

}
