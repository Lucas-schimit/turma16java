package DesafioEd;

public class Pessoa {

	public String nome;
	public char sexo;
	public int anoNascimento;
	public boolean estaVivo;

	public String Nome(String nome) {
		return nome;
	}

	public String Nome(String nome, boolean estaVivo) {
		String mensagem = null;
		if (estaVivo == true) {
			 mensagem = "Você esta vivo";
		} else if (estaVivo == false) {
			mensagem = "Moreeuuuu";
		}
		return mensagem;
	}

}

/*
 * public class Pessoa { //OBJETIVO DA CLASSE -
 * 
 * //ATRIBUTOS public String nome; public char sexo; public int anoNascimento;
 * public boolean estaViva;
 * 
 * //CONSTRUTORES - pedreiros da classe /* public Pessoa(String nome) {
 * this.nome = nome; }
 * 
 * 
 * public Pessoa(String nome) { this.nome = nome; }
 * 
 * 
 * 
 * //*SOBRECARGAS
 * 
 * //ENCAPSULAMENTO
 * 
 * 
 * //METODOS //*SOBRECARGAS
 * 
 * //OVERHIDE - PARECE NOME DE TRANSFORMER //SOBRECARGA DA SOBRECARGA - SHIT NO
 * LIMITS
 * 
 * }
 */
