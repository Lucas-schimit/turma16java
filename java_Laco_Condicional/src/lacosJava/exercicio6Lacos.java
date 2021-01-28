package lacosJava;

import java.util.Scanner;

public class exercicio6Lacos {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários 
		 * números inteiros no teclado. E no final 
		 * imprimir a média dos números múltiplos de 3.
		 *  Para sair digitar 0(zero).(DO...WHILE)
		 * */
		Scanner ler = new Scanner(System.in);
		
		int numeros = 0, somaNumeros = 0, cont =-1;
	
		
		do {
			System.out.println("Digite uma tecla: ");
			numeros = ler.nextInt();
			
			if((numeros % 3)==0) {
				cont++;
				somaNumeros+= +numeros;	
			}
			
		}while(numeros != 0);
		
		System.out.printf("A media múltipla de 3 é: %d",(somaNumeros/cont));

	}

}
