package ListaVetoresMatrizesJava;

import java.util.Scanner;
import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		/* Crie um programa que receba valores do usuário 
		 * para preencher uma matriz 3X3, e em seguida, exiba
		 *  a soma dos valores dela e a soma dos valores da 
		 *  primeira diagonal, ou seja, diagonal principal.
		 * */

		Scanner ler = new Scanner(System.in);
		
		int matCubo[][] = new int[3][3], somoriaDiagonal = 0;
		

		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
		System.out.println("Informe um valor para a matriz 3X3: ");
		matCubo[l][c] = ler.nextInt();
			}
		}
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				

				if(l==c) {
					
					somoriaDiagonal += matCubo[l][c]; 
				}
				System.out.printf("[ %d ]",matCubo[l][c]);
			}
			System.out.println("");	
		}
		
		System.out.println("");	
		
		System.out.println("A soma do vetor na diagonal é:"+ somoriaDiagonal);
		
		
	}

}
