package DesafioRafa;

public class FabricaDeSapato extends Fabrica {

	public FabricaDeSapato(String nome, String endereco, int quantidadeDeFuncionarios) {
		super(nome, endereco, quantidadeDeFuncionarios);
		// TODO Auto-generated constructor stub
	}

	public FabricaDeSapato() {

	}

	private String prensaSola;
	private String maquinaDeGrampeador;

	public void LigarPrensa() {
		System.out.println("Ligar Prensa");
	}

	public void DesligarPrensa() {
		System.out.println("Desligar Prensa");
	}

	public String getPrensaSola() {
		return prensaSola;
	}

	public void setPrensaSola(String prensaSola) {
		this.prensaSola = prensaSola;
	}

	public String getMaquinaDeGrampeador() {
		return maquinaDeGrampeador;
	}

	public void setMaquinaDeGrampeador(String maquinaDeGrampeador) {
		this.maquinaDeGrampeador = maquinaDeGrampeador;
	}

}
