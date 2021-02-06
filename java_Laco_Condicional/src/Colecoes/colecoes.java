package Colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import DesafioEd.Empregado;

public class colecoes {

	
	public static void main(String args[]) {
		
	Collection<String> nomes = new ArrayList();
	
	nomes.add("Lucas");
	nomes.add("Marcio");
	nomes.add("Maria");
	nomes.add("Juliana");
	nomes.remove("Lucas");
	
	if(nomes.isEmpty()) {
		System.out.println("Lista vazia");
	}else {
		System.out.println("Lista de nomes: "+nomes);
	}
	
	
	}	
}
