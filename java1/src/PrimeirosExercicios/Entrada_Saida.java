package PrimeirosExercicios;

import java.util.Scanner;

public class Entrada_Saida {

	public static void main(String args[])
	{
		
		Scanner ler =  new Scanner(System.in);
		int a,b,soma;
		System.out.println("Entre com o valor para A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor para B: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println(soma);
		
	}
}
