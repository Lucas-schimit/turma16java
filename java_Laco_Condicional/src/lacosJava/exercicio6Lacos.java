package lacosJava;

import java.util.Scanner;

public class exercicio6Lacos {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios 
		 * n�meros inteiros no teclado. E no final 
		 * imprimir a m�dia dos n�meros m�ltiplos de 3.
		 *  Para sair digitar 0(zero).(DO...WHILE)
		 * */
		Scanner ler = new Scanner(System.in);
		
		double numeros = 0.00, somaNumeros = 0.00, merdiaCalculo =0.00;
		int cont =-1; 
		
		do {
			System.out.println("Digite uma tecla: ");
			numeros = ler.nextInt();
			
			if((numeros % 3)==0) {
				cont++;
				somaNumeros+= +numeros;	
			}
			
		}while(numeros != 0);
		
		merdiaCalculo = somaNumeros/cont;
		


			System.out.printf("A media m�ltipla de 3 �: %.2f",merdiaCalculo);

				

		
		

	}

}
