package BANK16;

public class Corrente extends Conta {

	
	private int qtMesTalao;
	
	
	
	public Corrente(String numero, String cpf, int qtMesTalao) {
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}
	
public void emitirTalao(int quantidadeEmitir) {
	
	if(quantidadeEmitir<=3) {
		
		System.out.printf("Você pode emitir %d",quantidadeEmitir);
	
	}else {
		
		System.out.println("Você não pode emitir mais talões !!");
	}
	
}

}
