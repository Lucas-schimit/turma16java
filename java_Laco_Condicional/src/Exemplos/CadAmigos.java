package Exemplos;

import Classes.Pessoa;
import java.util.Scanner; 


public class CadAmigos {

	public static void main(String[] args) {
		
		LojadeBebida loja = new LojadeBebida();
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Infome seu nome: ");
		loja.nome = leia.nextLine();
		System.out.println("Informe sua data de nascimento [aaaa] ");
		loja.anoDeNascimento = leia.nextInt();
		

	}

}
