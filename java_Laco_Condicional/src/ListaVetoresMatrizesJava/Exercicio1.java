package ListaVetoresMatrizesJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que crie um vetor por leitura com 5
		 *  valores de pontua��o de uma atividade e o escreva em 
		 *  seguida. Encontre ap�s a maior pontua��o e a apresente. 
		 * */
		
		Scanner ler = new Scanner(System.in);
		
		
		int Vet[] = new int[5];
		int pontoMaior = 0; 
		
		for(int i=0; i<5;i++)
		{
			System.out.printf("Entre com os valores de pontua��o: ");
			Vet[i] = ler.nextInt();
			
			if(Vet[i]>pontoMaior) {
				pontoMaior = Vet[i];
			}
		}
		
		System.out.printf("A maior pontua��o �: %d",pontoMaior);
		
	}

}
