package E_commerce;

abstract class Pessoas {
	
	private  String nome; 
	private  int idPessoa;
	
	public Pessoas() {
		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Pessoas(String nome, int idPessoa) {
		super();
		this.nome = nome;
		this.idPessoa = idPessoa;
	} 

	
}
