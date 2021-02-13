package E_commerce;

import java.util.Scanner;

final class Cliente extends Pessoas{

	private long telefone; 
	private String genero;
	
	Scanner ler = new Scanner(System.in);
	
	MainEcommerce Ma = new MainEcommerce(); 
	
	public void Cadastro() {
		
		String nome, genero;
		String tratamento;
		int opcaoVoltar = 0;
		
		System.out.println("Informe seu nome: ");
		nome = ler.nextLine();
		System.out.println("Informe seu genero: ");
		genero = ler.nextLine();
		
		tratamento = tratamentoGenero(genero);
		
		System.out.println(tratamento+""+nome+" seu cadastro foi efetuado com sucesso");
		
		System.out.println(" Deseja voltar a tela inicial 1 - Sim/ 2 - não");
		opcaoVoltar = ler.nextInt();
		
		if(opcaoVoltar == 1) {
			Ma.main(null);
		}else{
			System.out.println("Cadastro efetuado com sucesso");
		}
		
	}
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, int idPessoa,long telefone, String genero) {
		super(nome,idPessoa);
		this.telefone = telefone;
		this.genero = genero;
	}
	
	public Cliente(long telefone, String genero) {
		super();
		this.telefone = telefone;
		this.genero = genero;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	} 
	
	public String tratamentoGenero( String genero)
	{
		String tratamento = null;
		if(genero == "M")
		{
			tratamento = "Sr.";
		}
		else if (genero == "F")
		{
			tratamento = "Sra.";
		}
		else
		{
			tratamento = "Srx.";
		}
		return tratamento;
							
		
	}
	
	
}
