programa
{
	
	funcao inicio()
	{
		escreva("Transformação Celsius para Fahrenheit e Fahrenheit  para Celsius \n") // Titulo do algoritmo. 
		real Celsisus //Definindo primeiro número a ser adicionado.
		real Fahrenheit //Definindo primeiro número a ser adicionado.
		real transformacao // Declaração da variavel, do calculo.
		real transformacao1 // Declaração da variavel, do calculo1.
		


		escreva("Entre com a temperatura em Celsius: \n") //Entra com o valor em Celsisus.
		leia(Celsisus) //Inserindo o valor da variavel

				escreva("Entre com a temperatura em Fahrenheit: \n") //Entra com o valor em Fahrenheit.
		          leia(Fahrenheit) //Inserindo o valor da variavel

		          transformacao1 = (Fahrenheit-32.00)*(5.00/9.00)

		transformacao = ((Celsisus*(9.00/5.00))+32.00) //Calculo em da transformação de Celsius para Fahrenheit.
				escreva("O resutado em Fahrenheit: \n" + transformacao ) // Exibe o resultado.
				escreva("\n")
				escreva("O resutado em Fahrenheit: \n" + transformacao1) // Exibe o resultado.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 955; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */