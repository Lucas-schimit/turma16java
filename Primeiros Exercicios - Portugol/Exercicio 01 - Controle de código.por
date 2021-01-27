programa
{
	
	funcao inicio()
	{

	  inteiro P = 0, E = 0, M = 0 // Declarando a variavel de entrada

	     linha() //
	     quebraLinha() // Função que quebra a linha
		escreva("Por favor me informe o peso do tomate: \n")
		leia(P)
		
		se (P>50){
			
			E = P - 50
			M = E * 4
		}senao{

			P = 0
			E = 0
			M = 0
		}

		escreva("O peso é de: " +P+ "\n")
		escreva("O Excesso é de: " +E+ "\n")
		escreva("A multa é de: " +M+ "\n")
	     linha()
	}

	funcao linha(){

		escreva("__________________________________________________________________________")
	}
	funcao quebraLinha(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */