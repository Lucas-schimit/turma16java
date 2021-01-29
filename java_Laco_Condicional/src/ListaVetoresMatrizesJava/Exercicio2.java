package ListaVetoresMatrizesJava;

import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Um dado é lançado 10 vezes e o valor correspondente é 
		 * anotado. Faça um programa que gere um vetor com os 
		 * lançamentos, escreva esse vetor. A seguir determine 
		 * e imprima a média aritmética dos lançamentos, contabilize
		 *  e apresente também quantas foram as ocorrências da maior pontuação.
		 * */

		int lancamentos[] = new int[10];
		
		int contaMaior =0, somaVet = 0, lancamentoMaior=0;
		
		double mediaVetor =0.00;
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		for(int i = 0; i<10;i++)
		{
			lancamentos[i] = random.nextInt(10);
			somaVet += lancamentos[i];
			
				if(lancamentos[i]>=lancamentoMaior) {
					
					if(lancamentos[i]==lancamentoMaior)
					{
						contaMaior ++;
					}else {
						
						contaMaior = 1;
						
					}
					
					lancamentoMaior = lancamentos[i]; 
				}
		}
		
		mediaVetor = somaVet/10;
		
		for(int x=0;x<10;x++)
		{
			System.out.println("\nA posição do vetor "+ x+1 +"do lançamento :"+lancamentos[x]+"\n");
		}
		
		System.out.println("\nA média dos lançamentos é:"+mediaVetor+"\n");
		System.out.println("\nO maior vetor é " + lancamentoMaior + " ele apresenta "+ contaMaior + "\n");
		System.out.println("\nFim do programa!!");
		
	}

}
