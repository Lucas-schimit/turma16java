package lacosJava;


import java.util.Scanner;

public class exercicio5Lacos {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que 
		 * encontre um n�mero igual a zero. No final, mostre a soma 
		 * dos n�meros digitados.(DO...WHILE)
		 * */
		
		Scanner ler = new Scanner(System.in);
		
		int numeros = 0, somaNumeros = 0;
		
		do {
			System.out.println("Digite uma tecla: ");
			numeros = ler.nextInt();
			
			somaNumeros+=+numeros;
			
		}while(numeros != 0);
			
		System.out.printf("A soma dos numeros digitado � %d",somaNumeros);
	}

}
