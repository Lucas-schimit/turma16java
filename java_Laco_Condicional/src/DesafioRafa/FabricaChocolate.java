package DesafioRafa;

public class FabricaChocolate extends Fabrica {

	public FabricaChocolate(String nome2, String endereco2, int quantidadeDeFuncionarios2) {
		super(nome2, endereco2, quantidadeDeFuncionarios2);
		// TODO Auto-generated constructor stub
	}

	public FabricaChocolate() {

	}

	private String freezer;
	private String misturador;
	private String materiaPrima;

	public void Ligarfreezer() {
		System.out.println("Ligar freezer !!!");
	}

	public void Desligarfreezer() {
		System.out.println("Desligar freezer !!!");
	}

	public String getFreezer() {
		return freezer;
	}

	public void setFreezer(String freezer) {
		this.freezer = freezer;
	}

	public String getMisturador() {
		return misturador;
	}

	public void setMisturador(String misturador) {
		this.misturador = misturador;
	}

	public String getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(String materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

}
