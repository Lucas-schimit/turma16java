package POO_Lista3;

public class Cachorro extends Animal implements EmitirSon, Correr {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public String tipoSomCachorro;
	
	public Cachorro(String nome, int idade, String tipoSomCachorro) {
		super(nome,idade);
		this.tipoSomCachorro = tipoSomCachorro;
	}
	


	public String getTipoSomCachorro() {
		return tipoSomCachorro;
	}

	public void setTipoSomCachorro(String tipoSomCachorro) {
		this.tipoSomCachorro = tipoSomCachorro;
	}

	public String getPoli() {
		return "Nome do cachorro: " + super.getNome() + "Tipo de latido: " + this.tipoSomCachorro;
	}

	public void Som() {

	}

	public void correr() {

	}

}
