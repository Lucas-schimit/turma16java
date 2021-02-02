package POO_Lista1;

import java.util.Scanner;

public class ChamandoAviao {

	public static void main(String[] args) {
		/*Crie uma classe avião e apresente os atributos e métodos 
		 * referentes esta classe, em seguida crie um objeto avião, 
		 * defina as instancias deste objeto e apresente as informações 
		 * deste objeto no console.
		 * */
		Scanner ler = new Scanner(System.in);
		Aviao Aviao1 = new Aviao();
			
		System.out.println("Informe a Cor do avião: ");
		Aviao1.Cor = ler.nextLine();
		System.out.println("Informe o Modelo: ");
		Aviao1.Modelo = ler.nextLine();
		System.out.println("Informe seu telefone: ");
		Aviao1.numeroDeSerie = ler.nextDouble();
		

		
		Aviao1.MostrarAviao();
	}

}
