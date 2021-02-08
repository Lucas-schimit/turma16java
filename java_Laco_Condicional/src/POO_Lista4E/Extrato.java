package POO_Lista4E;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Extrato {

	Estoque Est = new Estoque();
	
	private double debito;
	private int id;
	
	public static List<Double>  listaDebito = new ArrayList<Double>();
	public static List<Integer>  listaId = new ArrayList<Integer>();

	
	public Extrato() {
		
	}
	
	public Extrato(double debito, int id) {
		super();
		this.debito = debito;
		this.id = id;
	}

	


	public double getDebito() {
		return debito;
	}




	public void setDebito(double debito) {
		this.debito = debito;
	}


	public void CabeçalhoLoja() {

		linha(40);
		System.out.println("[PRODUTO]" + "\t" + "[QTDE]" + "\t" + "[VALOR FINAL]");
		linha(40);
		System.out.println();

	}

	public static void linha(int tamanho) {
		for (int x = 1; x < tamanho; x++) {
			System.out.print("═");
		}
		System.out.println();
	}

}
