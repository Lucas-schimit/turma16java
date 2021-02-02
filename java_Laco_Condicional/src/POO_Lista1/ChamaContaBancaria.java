package POO_Lista1;

import java.util.Scanner;

public class ChamaContaBancaria {

	public static void main(String[] args) {

		/*
		 * Crie uma classe conta bancaria e apresente os atributos e métodos referentes
		 * esta classe, em seguida crie um objeto conta bancaria, defina as instancias
		 * deste objeto e apresente as informações deste objeto no console.
		 * 
		 */

		ContaBancaria cont1 = new ContaBancaria();
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		cont1.setNome(ler.nextLine());
		System.out.println("Informe o numero da conta: ");
		cont1.setConta(ler.nextLine());
		System.out.println("Informe sua Agencia: ");
		cont1.setAgencia(ler.nextLine());

		System.out.println(" O Nome: " + cont1.getNome() + " Conta " + cont1.getConta() + " Agencia " + cont1.getAgencia());
	}

}
