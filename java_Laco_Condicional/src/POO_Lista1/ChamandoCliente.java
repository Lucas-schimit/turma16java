package POO_Lista1;

import java.util.Scanner;

public class ChamandoCliente {

	public static void main(String[] args) {
		/* Crie uma classe cliente e apresente os atributos
		 *  e métodos referentes esta classe, em seguida crie 
		 *  um objeto cliente, defina as instancias deste objeto 
		 *  e apresente as informações deste objeto no console.
		 * */

		Cliente cliente1 = new Cliente();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		cliente1.nome = ler.nextLine();
		System.out.println("Informe sua idade: ");
		cliente1.idade = ler.nextInt();
		System.out.println("Informe seu telefone: ");
		cliente1.numeroDeTelefone = ler.nextInt();
		
		cliente1.MostraDadosCliente();
	}

}
