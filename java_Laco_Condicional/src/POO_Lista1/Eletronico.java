package POO_Lista1;

public class Eletronico {

	/*
	 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	 * referentes esta classe, em seguida crie um objeto produto eletr�nico, defina
	 * as instancias deste objeto e apresente as informa��es deste objeto no
	 * console.
	 */

	public String tipoDeEletronico;
	public double valor;
	public String origem;

	public void MostrarEletronico() {

		System.out.println("Os Produtos eletronicos informados s�o: ");
		System.out.println(" Tipo de eletronico: " + tipoDeEletronico + " Valor: " + valor + " Origem: " + origem);

	}
}
