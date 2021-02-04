package POO_Lista3;

public class Cavalo extends Animal implements EmitirSon, Correr {

	public String tipoSomCavalo;
	
	public Cavalo(String nome, int idade, String tipoSomCavalo ) {
		super(nome, idade);
		this.tipoSomCavalo = tipoSomCavalo;
	}


	public String getPoli() {
		return "Nome do cachorro: " + super.getNome() + "Tipo de latido: " + this.tipoSomCavalo;
	}

	public String getTipoSomCavalo() {
		return tipoSomCavalo;
	}

	public void setTipoSomCavalo(String tipoSomCavalo) {
		this.tipoSomCavalo = tipoSomCavalo;
	}

	public void Som() {

	}

	public void correr() {

	}

}
