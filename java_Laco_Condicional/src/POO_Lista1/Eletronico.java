package POO_Lista1;

public class Eletronico {

	/*
	 * Crie uma classe produto eletrônico e apresente os atributos e métodos
	 * referentes esta classe, em seguida crie um objeto produto eletrônico, defina
	 * as instancias deste objeto e apresente as informações deste objeto no
	 * console.
	 */

	public String tipoDeEletronico;
	public double valor;
	public String origem;

	public void MostrarEletronico() {

		System.out.println("Os Produtos eletronicos informados são: ");
		System.out.println(" Tipo de eletronico: " + tipoDeEletronico + " Valor: " + valor + " Origem: " + origem);

	}
}
