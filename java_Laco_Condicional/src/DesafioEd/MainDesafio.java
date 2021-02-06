package DesafioEd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDesafio {

	public static void main(String[] args) {
		
		char terceiro; 
		Scanner ler = new Scanner(System.in);
		
		List<Empregado> lista = new ArrayList<>();
		
		lista.add(new Terceiro("Lucas",23));
		
		System.out.println("Você é tercerizado S/N");
		terceiro = ler.next().toUpperCase().charAt(0);
		
		if (terceiro == 'S') {
			
			
		}

	}

}
