package DesafioEd;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainDaDenise {

	public static void main(String args[]) {
	
   Scanner leia = new Scanner(System.in);
	double salario = 0.0;
	//List <Empregado> lista = new ArrayList<>();
	//List é uma collection interface - pode chamar mas não pode instanciar como objeto
	
	System.out.printf("O colaborador é terceiro? [S/N] ");
	char opcao = leia.next().toUpperCase().charAt(0);
	
	while (opcao != 'S' && opcao != 'N') {
		System.out.println("O colaborador é terceiro? [S/N] ");
		opcao = leia.next().toUpperCase().charAt(0);
	}
	
	System.out.println("Informe a matricula do colaborador: ");
	int matricula = leia.nextInt();
	
	System.out.println("Informe o nome do colaborador: ");
	String nome = leia.next();
	
	System.out.println("Quantas horas trabalhadas?");
	int horas = leia.nextInt();
	
	System.out.println("Qual valor/hora?");
	double valorHora = leia.nextDouble();
	
	if (opcao == 'S') {
		System.out.println("Informe o acrescimo: ");
		double acrescimo = leia.nextDouble();
		//Empregado colaborador = new Terceiro(nome, matricula, horas, valorHora, acrescimo);
		//salario = colaborador.salario();
	} else if (opcao == 'N') {
		//Empregado colaborador = new Empregado(nome, matricula, horas, valorHora);
		//salario = colaborador.salario();
	}
	
	System.out.printf("O colaborador se chama %s, sua matricula é %d, seu salario total é de R$ %.2f",nome,matricula,salario);
	
}
}
