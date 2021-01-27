programa
{
	
	funcao inicio()
	{
		real N1, N2, N3
		real Mp
		
		escreva("Exercicio 05 - Programação Seqüencial \n") // Titulo do Software

		escreva("Informe o valor da N1: \n") // Entre com o valor da primeira nota
		leia(N1)
		escreva("Informe o valor da N2: \n") // Entre com o valor da segunda nota
		leia(N2)
	     escreva("Informe o valor da N3: \n") // Entre com o valor da terceira nota
		leia(N3)

		Mp = ((N1*2.0)+(N2*3.0)+(N3*5.0))/(2.0 + 3.0 + 5.0) //Calculo da média ponderada do Aluno
		
		escreva("Segue a media final do aluno " + Mp + "\n") //Informa para o usuário a média ponderada final
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */