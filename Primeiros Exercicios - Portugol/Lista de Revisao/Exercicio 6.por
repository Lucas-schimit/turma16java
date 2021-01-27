programa
{
	
	funcao inicio()
	{
		/*
		Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. Em
          seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
		*/

		real Vet1[3] = {1.0,2.0,3.0}, Mat1[3][3] = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}}, Mat[3][3]
		
		
		escreva("Lendo o vetor: \n")
		para(inteiro i=0;i<3;i++)
		{
			escreva("[ ",Vet1[i]," ]")
		}

		escreva("\nLendo o matriz: \n")
		 para(inteiro l =0; l<3; l++)
		 {
		 	para(inteiro c=0; c<3; c++)
		 	{
		 		escreva("[ ",Mat1[c][l], " ]")
		 	}
		 	escreva("\n")
		 }

		 escreva(" Resultado da mutiplicação: \n")

		 para(inteiro l = 0;l<3;l++){
		 	para(inteiro c= 0; c<3; c++)
		 	{
		 		Mat[l][c] = Mat1[l][c] * Vet1[c]
		 		escreva("[ ", Mat[l][c], " ]")
		 	}
		 	escreva("\n")
		 }
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 818; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */