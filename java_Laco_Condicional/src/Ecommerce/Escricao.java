package Ecommerce;

import java.util.Scanner;

public class Escricao {
	
	
	
	public static void Genero() {
	Scanner Ler = new Scanner(System.in);	
	
	String nome; 
	char sexo;
	
	System.out.println("Por favor informe seu nome: ");
	nome= Ler.nextLine();
    
	System.out.println("Informe seu sexo: ");
	sexo = Ler.nextLine().toUpperCase().charAt(0);
	}
}
