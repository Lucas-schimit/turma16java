package ListaVetoresMatrizesJava;

import java.util.Scanner;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Um dado � lan�ado 10 vezes e o valor correspondente � 
		 * anotado. Fa�a um programa que gere um vetor com os 
		 * lan�amentos, escreva esse vetor. A seguir determine 
		 * e imprima a m�dia aritm�tica dos lan�amentos, contabilize
		 *  e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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
			System.out.println("\nA posi��o do vetor "+ x+1 +"do lan�amento :"+lancamentos[x]+"\n");
		}
		
		System.out.println("\nA m�dia dos lan�amentos �:"+mediaVetor+"\n");
		System.out.println("\nO maior vetor � " + lancamentoMaior + " ele apresenta "+ contaMaior + "\n");
		System.out.println("\nFim do programa!!");
		
	}

}
