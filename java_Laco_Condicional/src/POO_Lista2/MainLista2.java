package POO_Lista2;

public class MainLista2 {

	public static void main(String[] args) {
		
		
		//Testando a Classe Fornecedor
		
		Fornecedor For1 = new Fornecedor();

		For1.setNome("Lucas");
		For1.setEndereco("Rua N/A");
		For1.setTelefone("(00)00000-0000");
		For1.setValorCredito(2000);
		For1.setValorDivida(1050);
	    For1.obterSaldo();
	    
	    System.out.println(For1.obterSaldo());
	    
	  //Testando a Classe Empregado
	    
	    Empregado Emp1 = new Empregado();
	    
	    Emp1.setNome("Lucas");
	    Emp1.setEndereco("Rua N/A");
	    Emp1.setTelefone("(00)00000-0000");
	    Emp1.setCodigoSetor(1);
	    Emp1.setSalarioBase(500000);
	    
	    
	    System.out.println(Emp1.calcularSalario());
	    
	    
	}
	

}
