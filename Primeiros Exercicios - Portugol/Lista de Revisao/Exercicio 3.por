programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		Escrever um programa que leia uma quantidade desconhecida de números e conte quantos
          deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados
          deve terminar quando for lido um número neg
		*/

		inteiro numeros[100], contador1 = 0, x = 0, contatdor2 = 0, contatdor3 = 0, contatdor4 = 0




            faca
            {
            	//escreva(" Por favor informe o numero a ser incerido: \n")
			//leia(numeros[x])

			//numeros[x]+=numeros[x]

			numeros[x] =1
			
            }enquanto(numeros[x]<100)


           para(inteiro y=0;y<100;y++)
            {
            	escreva("[ ",numeros[y]," ]\n")
            }

		para(inteiro i=0;i<100;i++)
		{ 
			
			se(numeros[i]<=25 e numeros[i]>0)
			{
				contador1 += 1 
			}senao se(numeros[i]<=50 e numeros[i]>=26)
			{
				contatdor2 ++
			}senao se(numeros[i]<=75 e numeros[i]>=51)
			{
				contatdor3 ++
			}senao se(numeros[i]<=100 e numeros[i]>=76)
			{
				contatdor4 ++
			}
			
		}
           escreva("A quantida de numeros entre 0 a 25: \n",contador1)
           escreva("\nA quantida de numeros entre 26 a 50: \n ",contatdor2)
           
          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 669; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */