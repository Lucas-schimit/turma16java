package POO_Lista1;

public class Funcionario {

	/*
	 * Crie uma classe funcion�rio e apresente os atributos e m�todos referentes
	 * esta classe, em seguida crie um objeto funcion�rio, defina as instancias
	 * deste objeto e apresente as informa��es deste objeto no console.
	 */

	public String nome;
	public String registro;
	private String funcao;

	public void MostrarFuncionario() {

		System.out.println("O funcionario: " + nome + " registro: " + registro);
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
