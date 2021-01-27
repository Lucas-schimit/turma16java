package laco;

import java.util.Scanner;

public class Exercicio1 {
	
	/*
	 * Faça um programa que receba três inteiros e diga qual deles é o maior.
	 * */
	
	public static void main(String[] arg)
	{
		
		Scanner Ler = new Scanner(System.in);
		
		int Numero1=0, Numero2=0, Numero3=0;
		
		System.out.println("Entre com o primeiro numero: ");
		Numero1 = Ler.nextInt();
		System.out.println("Entre com o segundo numero: ");
		Numero2 = Ler.nextInt();
		System.out.println("Entre com o terceiro numero: ");
		Numero3 = Ler.nextInt();
		
		if (Numero1>Numero3 && Numero1>Numero2)
		{
			System.out.printf("\n O Primeiro numero é o maior: %d",Numero1);
		}else if(Numero2>Numero1 && Numero2>Numero3) {
			System.out.printf("\n O Segundo numero é o maior: %d",Numero2);
		}else if(Numero3>Numero1 && Numero3>Numero2) {
			System.out.printf("\n O Terceiro numero é o maior: %d",Numero3);
		}
	}

}
