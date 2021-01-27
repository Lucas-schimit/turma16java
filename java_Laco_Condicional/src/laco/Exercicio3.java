package laco;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
       
		/*
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
	    	18-25 adulto
		 * */
		
		Scanner Ler = new Scanner(System.in);

		int idade;
		String nome;
		
		System.out.println("Entre com o seu nome: ");
		nome = Ler.nextLine();
		System.out.println("Entre com a sua idade: ");
		idade = Ler.nextInt();

		
		if(idade<10) {
			
			System.out.println("A sua idade não se aplica !!");
			
		}else if(idade>=10 && idade<=14)
		{
			System.out.println("Sua idade se inquadra na categoria Infantil(10-14)");
			
		}else if(idade>=15 && idade<=17) {
			
			System.out.println("Sua idade se inquadra na categoria juvenil(15-17)");
			
		}else if(idade>=18 && idade<=25)
		{
			System.out.println("Sua idade se inquadra na categoria adulto(18-25)");
			
		} else {
			
			System.out.println("A sua idade não se aplica !!");
		}
		
	}

}
