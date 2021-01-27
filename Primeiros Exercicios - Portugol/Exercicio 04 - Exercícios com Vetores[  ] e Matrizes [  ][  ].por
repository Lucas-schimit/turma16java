programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Crie um programa que receba valores do usuário para preencher
		 * uma matriz 3X3, e em seguida, exiba a soma dos valores dela e
		 * a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		*/
          const inteiro tamanho = 3
		inteiro cubo[tamanho][tamanho], Somatoria = 0


       para(inteiro l = 0; l<tamanho; l++)
       {
       	para(inteiro c = 0; c<tamanho; c++){
       		
       	cubo[l][c] = Util.sorteia(1, 20)

       	se(l == c)
       	{
       		Somatoria += cubo[l][c]
       	}

       	escreva(cubo[l][c], "  ")  
       	}
       	escreva("\n") 
       }


		escreva("A somatoria é ",Somatoria)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 666; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */