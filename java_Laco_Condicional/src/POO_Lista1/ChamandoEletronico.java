package POO_Lista1;

import java.util.Scanner;

class ChamandoEletronico {

	public static void main(String[] args) {
		/*
		 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
		 * referentes esta classe, em seguida crie um objeto produto eletr�nico, defina
		 * as instancias deste objeto e apresente as informa��es deste objeto no
		 * console. */
		
		Scanner ler = new Scanner(System.in);
		Eletronico celular = new Eletronico(); 
		
		System.out.println("Informe o tipo de seu eletronico: ");
		celular.tipoDeEletronico = ler.nextLine();
		System.out.println("Informe o valor do eletronico: ");
		celular.valor = ler.nextDouble();
		ler.nextLine();
		System.out.println("Origem do produto: ");
		celular.origem = ler.nextLine();
		System.out.println();
		ler.nextLine();
		celular.MostrarEletronico();
		System.out.println("Fim do programa !!!");
		
	}

}
