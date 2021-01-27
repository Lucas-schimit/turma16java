package laco;

import java.util.Scanner; 

import java.lang.Math;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * Faça um programa em que permita a entrada de um número qualquer e
		 *  exiba se este número é par ou ímpar. Se for par exiba também a 
		 *  raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 * 
		 * */
		
		double numero = 0, calculo = 0, calculo1 = 0;
		
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Entre com o numero ");
		numero = Ler.nextDouble();
		
		if ((numero % 2) == 0)
		{
			calculo = Math.sqrt(numero);
			System.out.printf("\nO numero é par: %f",calculo);
			
		} else if((numero % 2) == 1) {
			
			calculo1 = Math.pow(numero, 2);
			System.out.printf("\n O numero é impar: %f ", calculo1);
			
		}else {
			
			System.out.println("\n O numero não se aplica !!!");
		}
		
	}

}
