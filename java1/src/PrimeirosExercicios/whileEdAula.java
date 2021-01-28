package PrimeirosExercicios;

import java.util.Scanner; 

public class whileEdAula {

	public static void main(String[] args) {
		/* * Faça um programa que pegue um número do teclado e calcule a 
		 * soma de todos os números  de 1 até ele. Ex.: o usuário entra 7,
		 * o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28
		 * */

		Scanner ler = new Scanner(System.in);
		
		double numero = 0.0, soma = 0.0; 
		
		
		System.out.println("Entre com o valor do numero: ");
		numero  = ler.nextDouble();
		soma = numero;
		
		do {
			
			System.out.printf(" %.2f +: ",soma);
			numero = numero +(soma -1);
			soma --;
			
		
			
		}while(soma>=1);
		
		System.out.printf("\nA soma de todos os numeros é: %.2f ", numero);
		
	}

}
