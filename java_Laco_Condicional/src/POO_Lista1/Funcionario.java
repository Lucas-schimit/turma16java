package POO_Lista1;

public class Funcionario {

	/*
	 * Crie uma classe funcionário e apresente os atributos e métodos referentes
	 * esta classe, em seguida crie um objeto funcionário, defina as instancias
	 * deste objeto e apresente as informações deste objeto no console.
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
