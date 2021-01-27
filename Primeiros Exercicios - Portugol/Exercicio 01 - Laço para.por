programa
{
	
	funcao inicio()
	{

        /*
         Faça um programa que mostre uma contagem na tela de 233 a 456, 
         só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 
         em 5 quando não estiver.
        
        */
	
		inteiro numero = 233, PE = 0

		faca
		{
			se(numero<=300)
			{ 
			      numero = numero + 3
			      escreva("Numero: " +numero+"\n")
			}senao se (numero>300 e numero<=400)
			{
				numero = numero + 5
			     escreva("Numero: " +numero+"\n")		
			}senao
			{
				numero = numero + 3
			     escreva("Numero: " +numero+"\n")
			}
			
		} enquanto (numero>=233 e numero<=456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */