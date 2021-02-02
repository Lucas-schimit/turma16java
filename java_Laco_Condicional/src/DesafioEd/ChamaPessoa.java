package DesafioEd;

public class ChamaPessoa {
	
	public static void mai(String args[]) {
		
		Produto item1 = new Produto();
		
		item1.Codigo("1234");
		item1.CodigoDescicao("1234", "Camiseta");
		item1.CodigoDescricaoValorUnitario("1234", "Camiseta",100);
		
		System.out.println("Codigo: " + item1.getCodigo()+ " Descricao: "+item1.getDescricao()+""
				+ " ValorUnitario " +item1.getValorUnitario());
	}

}
