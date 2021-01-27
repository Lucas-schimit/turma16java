programa
{
	
	funcao inicio()
	{
		inteiro vetor[4], i = 0, y = 0, x = 0	


		para (i=0; i<4; i++){

			escreva("Informe o numero a ser incerido: \n") 
			leia(vetor[i]) 
		}
   
		para (y=0;y<4;y++)
		{
			escreva("A posição " ,y+1, " do vetor corresponde ao numero ", vetor[y], "\n") 
		}

		para (x = 3; x>=0; x--){

			escreva("A posição em ordem decrecente ", x+1, " o valor do vetor é ", vetor[x], "\n") 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */