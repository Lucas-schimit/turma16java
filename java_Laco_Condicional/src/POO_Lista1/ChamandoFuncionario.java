package POO_Lista1;

import java.util.Scanner;

public class ChamandoFuncionario {

	public static void main(String[] args) {
		/*
		 * Crie uma classe funcionário e apresente os atributos e métodos referentes
		 * esta classe, em seguida crie um objeto funcionário, defina as instancias
		 * deste objeto e apresente as informações deste objeto no console.
		 */
		Scanner ler = new Scanner(System.in);
		Funcionario Fun1 = new Funcionario();

		System.out.println("Informe o nome do funcionario: ");
		Fun1.nome = ler.nextLine();
		System.out.println("Informe o Registro do Funcionario: ");
		Fun1.registro = ler.nextLine();

		System.out.println("Informe o função do mesmo: ");
		Fun1.setFuncao(ler.nextLine());

		Fun1.MostrarFuncionario();
		System.out.println("A função do seu funcionario é : " + Fun1.getFuncao());

	}

}
