package lacosJava;


import java.util.Scanner;

public class exercicio5Lacos {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que 
		 * encontre um número igual a zero. No final, mostre a soma 
		 * dos números digitados.(DO...WHILE)
		 * */
		
		Scanner ler = new Scanner(System.in);
		
		int numeros = 0, somaNumeros = 0;
		
		do {
			System.out.println("Digite uma tecla: ");
			numeros = ler.nextInt();
			
			somaNumeros+=+numeros;
			
		}while(numeros != 0);
			
		System.out.printf("A soma dos numeros digitado é %d",somaNumeros);
	}

}
