package Exemplos;

public class LojadeBebida {
	
	public String nome;
	public char genero; 
	public int anoDeNascimento;
	
	
	public int Idade() {
		int idade;
		return idade = 2021 - anoDeNascimento;
	}
	
	public String checkIdade() {
		
		String mensagem = null; 
		int idade = 2021 - anoDeNascimento;
		
		
		if(idade<18 ) {
			
			mensagem = "Voce � menor que 18 anos";
			
		}else if(idade>18 && genero == 'M')
		{
			mensagem = "Sr � maior que 18 anos";
			
		}else if(idade>18 && genero == 'F') {
			
			mensagem = "Sra � maior que 18 anos";
			
		}else if(idade>18 && genero == 'O') {
			
			mensagem ="Srx � maior que 18 anos";
		}else 
		
		
		return mensagem;
		return mensagem;
	}

}
