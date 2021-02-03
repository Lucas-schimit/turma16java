package DesafioRafa;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fabrica Fab1 = new Fabrica();
		FabricaChocolate FabCho1 = new FabricaChocolate();
		FabricaDeSapato FabSap1 = new FabricaDeSapato();
		FabricaDeSapato FabSap2 = new FabricaDeSapato();

		FabSap1.setNome("Lucas");
		FabSap2.setNome("Kevin");
		
		System.out.println(FabSap1.getNome());
		System.out.println(FabSap2.getNome());
		
		FabSap1.LigarPrensa();
		FabSap1.DesligarPrensa();
		FabCho1.Ligarfreezer();
		FabCho1.Desligarfreezer();

	}

}
