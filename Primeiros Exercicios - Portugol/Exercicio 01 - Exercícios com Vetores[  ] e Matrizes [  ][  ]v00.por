programa
{
	
	funcao inicio()
	{

       /*
       Faça um programa que crie um vetor por leitura com 5 valores 
       de pontuação de uma atividade e o escreva em seguida. Encontre 
       após a maior pontuação e a apresente.
       */
	
		inteiro PontuacaoAtividade[5], i = 0, MaiorPontuacao = 0

		para(i=0;i<5;i++){

			escreva ("Entre com a pontuação do Aluno: \n") 
			leia(PontuacaoAtividade[i])

			se(PontuacaoAtividade[i] > MaiorPontuacao)
			{
				MaiorPontuacao = PontuacaoAtividade[i] 
			}
		}

		escreva("A maior pontuacao é: ", MaiorPontuacao, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */