programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro A, B, C //Declarando variaveis
		real R, S, D //Declarando variaveis
		
		escreva("Exercicio 04 - Programação Seqüencial \n") // Titulo do Software

		escreva("Informe o valor de A: \n") // Entre com o valor de A
		leia(A)
		escreva("Informe o valor de B: \n") // Entre com o valor de B
		leia(B)
	     escreva("Informe o valor de C: \n") // Entre com o valor de C
		leia(C)

		R = Matematica.potencia(A+B, 2)
		

		S = Matematica.potencia(B+C, 2)

		

		D = (R+S)/2 // Calculando o valor de D = (R+S)/2

		
		escreva("O valor de R:" + R + "\n") // Informando o valor de R
		escreva("O valor de S:" + S + "\n") // Informando o valor de S
		escreva("O valor de D:" + D + "\n") // Informando o valor de D

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 452; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */