programa
{
	
	funcao inicio()
	{
		/*
		Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ...
         + 99/50
		*/

		real numero1= 0.0, numero2 = 0.0, resultado = 0.0, resultadoNumero1 = 0.0, resultadoNumero2 = 0.0 

        para( inteiro i = 0; i<50; i++)
        {
        	
          resultadoNumero2 += +1
          se(i==0)
          {
          resultadoNumero1 += +1
          }senao
          {
          	resultadoNumero1 += +2
          }
        	
        	resultado += resultadoNumero1/resultadoNumero2
        }

		escreva("Segue o resultado: ",resultado,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */