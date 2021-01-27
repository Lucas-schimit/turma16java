programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	  real x1,x2,y1,y2 //Variavel de entrada
	  real d // Variavel de Saída
	  
		escreva("Informe o valor de x1: \n") // Entre com o valor de x1
		leia(x1)
		escreva("Informe o valor de x2: \n") // Entre com o valor de x2
		leia(x2)
	     escreva("Informe o valor de y1: \n") // Entre com o valor de y1
		leia(y1)
		escreva("Informe o valor de y2: \n") // Entre com o valor de y2
		leia(y2)


         d = Matematica.raiz(Matematica.potencia((x2-x1), 2) + Matematica.potencia(y2-y1,2), 2) // Calculo da formula
		

        escreva(" O valor de d: " + d +"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */