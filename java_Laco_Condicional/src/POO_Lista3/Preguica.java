package POO_Lista3;

public class Preguica extends Animal implements EmitirSon,SubirArvore {
	
	public String tipoSomPreguica;
	
	
	public Preguica(String nome, int idade, String tipoSomPreguica ) {
		super(nome, idade);
		this.tipoSomPreguica = tipoSomPreguica;
	}
	
	public String getPoli() {
		return "Nome do cachorro: " + super.getNome() + "Tipo de latido: " + this.tipoSomPreguica;
	}

	public String getTipoSomPreguica() {
		return tipoSomPreguica;
	}

	public void setTipoSomPreguica(String tipoSomPreguica) {
		this.tipoSomPreguica = tipoSomPreguica;
	}

	public void Som() {

	}

	public void SubirEmArvore(){
		
	}

}
