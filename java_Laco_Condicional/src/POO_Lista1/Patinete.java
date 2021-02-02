package POO_Lista1;

public class Patinete {

	/*
	 * Crie uma classe patinete e apresente os atributos e métodos referentes esta
	 * classe, em seguida crie um objeto patinete, defina as instancias deste objeto
	 * e apresente as informações deste objeto no console.
	 */

	public String cor;
	public String modelo;
	public double numeroDeSerie;

	public void DesricaoPatinete() {

		System.out.println(" A cor é: " + cor + " Modelo: " + modelo + " Numero de Serie: " + numeroDeSerie);
	}
	
	public Patinete() {
		
	}

	public Patinete(String cor, String modelo, double numeroDeSerie) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.numeroDeSerie = numeroDeSerie;
	}
	

}
