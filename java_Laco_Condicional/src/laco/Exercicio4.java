package laco;

import java.util.Scanner; 

import java.lang.Math;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e
		 *  exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a 
		 *  raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 * 
		 * */
		
		double numero = 0, calculo = 0, calculo1 = 0;
		
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Entre com o numero ");
		numero = Ler.nextDouble();
		
		if ((numero % 2) == 0)
		{
			calculo = Math.sqrt(numero);
			System.out.printf("\nO numero � par: %f",calculo);
			
		} else if((numero % 2) == 1) {
			
			calculo1 = Math.pow(numero, 2);
			System.out.printf("\n O numero � impar: %f ", calculo1);
			
		}else {
			
			System.out.println("\n O numero n�o se aplica !!!");
		}
		
	}

}
