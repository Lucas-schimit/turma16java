programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
       /*
       Um dado é lançado 10 vezes e o valor correspondente é anotado. 
       Faça um programa que gere um vetor com os lançamentos, escreva 
       esse vetor. A seguir determine e imprima a média aritmética dos 
       lançamentos, contabilize e apresente também quantas foram as 
       ocorrências da maior pontuação.       
       */
         
         
         inteiro lancamentos[10] , i = 0, MaioresLancamentos[10], x = 0, MaiorValor = 0, y = 0 
         real somaVetor = 0.0
	
		para(i=0; i<10; i++)
		{
		   //escreva (" Por favor me informe os lançamentos: ") 
		   //leia(lancamentos[i])
		   lancamentos[i] = Util.sorteia(1,6)
             somaVetor += lancamentos[i]

             se(lancamentos[i] >=MaiorValor){ 
             	
             	se(lancamentos[i] ==  MaiorValor)
             	{
             		y++
             	} senao
             	{
             		y=1 
             	}
             	MaiorValor = lancamentos[i]	 
             }
             
		}

		para(inteiro z = 0; z<10; z++){

			escreva (" O lancamento " , z+1 , " do lancamento ",lancamentos[z], "\n")
		}

		escreva(" A media dos lançamentos: ",(somaVetor/10), "\n")
          escreva("O maior valor é: ", MaiorValor , " e ele aparece ", y, "\n")
	         			 	 		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1139; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */