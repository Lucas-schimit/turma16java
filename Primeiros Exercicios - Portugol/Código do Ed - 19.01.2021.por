programa

//Ednilson Nascimento Martiniano  10h34
{
	
	funcao inicio()
	{
		//PEDI AO USUARIO NOME[COMPLETO OU SO PRIMEIRO]
		//SEXO[M/F]
		// ANO NASCIMENTO[AAAA]
		// ESCREVA NA TELA A IDADE APROXIMADA DA PESSOA
		
		//variaveis - ingredientes
		cadeia nomePessoa
		caracter sexoPessoa
		inteiro anoNascimento
		inteiro idade
		const inteiro ANOATUAL = 2021
		//entradas
		escreva("Digite o nome da pessoa: ")
		leia(nomePessoa)
		escreva("Digite M-masculino ou F-feminino: ")
		leia(sexoPessoa)
		escreva("Digite apenas o ano de nascimento [aaaa]: ")
		leia(anoNascimento)
		/*
		 * até 18 - jovem
		 * de 18 até 59 anos - adulto/a
		 * de 60 anos pra cima idoso/a
		 *
		 */
		//processamento
		idade = ANOATUAL - anoNascimento
		//saida
		se (sexoPessoa =='M' )
		{
			se (idade<18)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado jovem")		
			} senao se (idade<60 e idade>18){ 
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado Adulto")
			}
			senao se (idade<60) {
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado idoso")		
			}
			
		}
		senao se (sexoPessoa =='m')
		{
			se (idade<18)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado jovem")		
			}
			 senao se (idade<60 e idade>18){ 
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado Adulto")
			}
			senao se (idade<60) {
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerado adoso")		
			}  
		}
			
			senao se (sexoPessoa =='F')

			
		   {
			se (idade<18)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada jovem")		
			}
			 senao se (idade<60 e idade>18){ 
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada Adulta")
			}
			senao se (idade<60) {
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada adulta")		
			} 
			
		   }

		   senao se (sexoPessoa =='f')

			
		   {
			se (idade<18)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada jovem")		
			}
			 senao se (idade<60 e idade>18){ 
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada Adulta")
			}
			senao se (idade<60) {
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e vc é considerada adulta")		
			} 
			
		   }
		   
		   
		   senao {
			escreva("Bom dia dia Srx. "+nomePessoa+" sua idade aproximada é "+idade+" anos")	
		}
		escreva("\nFIM DE PROGRAMA!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */