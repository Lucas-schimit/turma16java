programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{

		/* SO PAGO IMPOSTO
		   RECEBE O SALARIO DE UMA PESSOA
		   RECEBE O NOME DESSA PESSOA
		   BASEADO NO SALARIO VAI RESPONDE:
		   SALARIO ATÉ 1.100(INCLUSIVE) REAIS ISENTO
		   SALARIO MAIOR QUE 1.100 E (INCLUSIVE) 3.500 - 9% IMPOSTO (VALOR DO IMPOSTO E O SALARIO FINAL)
		   SALARIO MAIOR QUE 3.500 E (INCLUSIVE) 10.000 - 15% IMPOSTO (MESMA REGRA DE EXIBIÇÃO)
		   SALARIOS ACIMA DE 10.000 PAGAM 27% IMPOSTO (MOSTRE IGUAL)
		   DETALHE - TRATAR COMO SENHOR OU SENHORA
		 */


		real salarioRecebido, salarioComImposto, calculoImposto
		cadeia nomePessoa
		caracter sexo

          escreva("Informe seu nome por favor: \n")
          leia(nomePessoa) 
		escreva("Informe seu salário por favor: \n")
		leia(salarioRecebido)
		escreva("Informe seu sexo por favor: \n")
		leia(sexo)


		se (salarioRecebido<=1100 e sexo == 'M' ou salarioRecebido<=1100 e sexo == 'm')
		{
			escreva("O Sr é isento \n")
		}
		senao se (salarioRecebido>1100 e salarioRecebido<3500 e sexo == 'M' ou salarioRecebido>1100 e salarioRecebido<3500 e sexo == 'm')
		{
			calculoImposto = salarioRecebido * 0.09
			salarioComImposto =  salarioRecebido - calculoImposto

			escreva("O valor do imposto da Sr é " + calculoImposto + " seu salario com imposto " +salarioComImposto+ "\n") 
		} senao se (salarioRecebido>3500 e salarioRecebido<10000 e sexo == 'M' ou salarioRecebido>3500 e salarioRecebido<10000 e sexo == 'm')
		{
            			calculoImposto = salarioRecebido * 0.15
			          salarioComImposto =  salarioRecebido - calculoImposto	

			    escreva("O valor do imposto da Sr é " + calculoImposto + " seu salario com imposto " +salarioComImposto+ "\n")      		
		} senao se (salarioRecebido>10000 e sexo == 'M' ou salarioRecebido>10000 e sexo == 'm')
		{
            			calculoImposto = salarioRecebido * 0.27
			          salarioComImposto =  salarioRecebido - calculoImposto	

			    escreva("O valor do imposto da Sr é " + calculoImposto + " seu salario com imposto " +salarioComImposto+ "\n")      		
		} senao se (salarioRecebido<=1100 e sexo == 'F' ou salarioRecebido<=1100 e sexo == 'f' )
		{
			escreva("A Sra é isenta  \n")
		}
		senao se (salarioRecebido>1100 e salarioRecebido<3500 e sexo == 'F' ou salarioRecebido>1100 e salarioRecebido<3500 e sexo == 'f')
		{
			calculoImposto = salarioRecebido * 0.09
			salarioComImposto =  salarioRecebido - calculoImposto

			escreva("O valor do imposto da Sra é " + calculoImposto + " seu salario com imposto " +salarioComImposto+ "\n") 
		} senao se (salarioRecebido>3500 e salarioRecebido<10000 e sexo == 'F' ou salarioRecebido>3500 e salarioRecebido<10000 e sexo == 'f' )
		{
            			calculoImposto = salarioRecebido * 0.15
			          salarioComImposto =  salarioRecebido - calculoImposto	

			    escreva("O valor do imposto da Sra é " +calculoImposto + " seu salario com imposto " +salarioComImposto+ "\n")      		
		} senao se (salarioRecebido>10000 e sexo == 'F' ou salarioRecebido>10000 e sexo =='f')
		{
            			calculoImposto = salarioRecebido * 0.27
			          salarioComImposto =  salarioRecebido - calculoImposto	

			    escreva("O valor do imposto da Sra é " + Mat.arredondar(calculoImposto, 2) + " seu salario com imposto " +Mat.arredondar(salarioComImposto,2)+ "\n")      		
		} senao

		{
			escreva("O software não se aplica a sua necessidade \n") 
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */