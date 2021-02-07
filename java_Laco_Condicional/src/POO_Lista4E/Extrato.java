package POO_Lista4E;

public class Extrato {
	Pagamento pag = new Pagamento();
	
	public void ImprimeNomeDaLoja() {
		
		
		
		System.out.println("Loja Boa");
		linha(40);
	}
	
	public void CabeçalhoLoja() {
		
		linha(40);
		System.out.println("[PRODUTO]"+"\t"+"[QTDE]"+"\t"+"[VALOR FINAL]");
		linha(40);
		System.out.println();
		System.out.println(pag.getValorTotal()+"\t");
		
		
	}	
	public static void linha(int tamanho) {
		for (int x = 1; x < tamanho; x++) {
			System.out.print("═");
		}
		System.out.println();
	}
}
