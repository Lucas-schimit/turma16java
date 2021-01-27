package PrimeirosExercicios;

import java.util.Scanner; 
import java.lang.Math;

public class ExemploSe {

	public static void main(String[] args) {
		
		int idade; 
		String nome; 
		
		Scanner Ler = new Scanner(System.in); 
		
		System.out.printf("\nPor favor me informe seu nome: ");
		nome = Ler.nextLine();
		System.out.printf("\nPor favor me informe sua Idade: ");
		idade = Ler.nextInt();
		System.out.printf("\nO Seu nome: %s",nome);
		System.out.printf("\nO Seu nome: %d",idade);
		
		if(idade>=18)
		{
			System.out.println("\nVocê é maior de Idade !!");
		}else if (idade>=1 && idade<18)
		{
			System.out.println("\nVocê é menor de idade !!!");
		}else
		{
			System.out.println("\nIdade invalida");
		}
		

	}

}
