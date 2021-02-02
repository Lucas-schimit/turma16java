package POO_Lista1;

import java.util.Scanner;

public class ChamandoPatinete {

	public static void main(String[] args) {
		/*
		 * Crie uma classe patinete e apresente os atributos e métodos referentes esta
		 * classe, em seguida crie um objeto patinete, defina as instancias deste objeto
		 * e apresente as informações deste objeto no console.
		 */
		
		Scanner ler = new Scanner(System.in);
		Patinete Patinete1 = new Patinete();
		
		System.out.println("Informe a Cor do patinete: ");
		Patinete1.cor = ler.nextLine();
		System.out.println("Informe o Modelo: ");
		Patinete1.modelo = ler.nextLine();
		System.out.println("Informe o numero de serie: ");
		Patinete1.numeroDeSerie = ler.nextDouble();
		
		Patinete1.DesricaoPatinete();
		
	}

}
