package POO_Lista1;

public class Cliente {

	/* Crie uma classe cliente e apresente os atributos
	 *  e métodos referentes esta classe, em seguida crie 
	 *  um objeto cliente, defina as instancias deste objeto 
	 *  e apresente as informações deste objeto no console.
	 * */
	
	public String nome;
	public int idade;
	public int numeroDeTelefone;

	public void MostraDadosCliente() {

		System.out.println("Segue abaixo os dados da cliente: ");
		System.out.println(
				"Nome: " + nome + " Idade: " + idade + " O numero do telefone é : Sem o DD " + numeroDeTelefone + "\n");
	}

	public String InciraDadosCliente(String nome) {
		return this.nome = nome;
	}

	public int InciraDadosCliente(int idade) {
		return this.idade = idade;
	}

	public int InciraDadosTelefone(int numeroDeTelefone) {
		return this.numeroDeTelefone = numeroDeTelefone;
	}

}

