programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		//PAULISTINHA
		// 0 - CORITHIANS, 1 - PALMEIRAS, 2 - SANTOS, 3 - SPFC
		// PONTOS - INTEIRO - 4
		// GANHA - 3 PONTOS
		// PERDE - 0 PONTO
		// EMPATA - 1 PONTO
		// FAÇA UM PROGRAMA QUE PEÇA SE O CADA TIME G-GANHOU, P-PERDEU
		// OU EMPATOU  EM 4 RODADAS, AO FINAL MOSTRA O NOME DE CADA TIME
		// E SEUS RESPECTIVOS PONTOS
		//CORINTHIANS - G-ganhou P-perdeu ou E-empatou [G/P/E]:

        cadeia Time[] = {"CORITHIANS", "PALMEIRAS", "SANTOS", "SPFC"} 
        inteiro pontos[4]
        cadeia StatusDePonto


		para(inteiro i = 0; i<4; i++)
		{
			escreva(" Rodada numero: ", i+1, "\n")
				para(inteiro x = 0; x<4; x++)
				{

					escreva(Time[x]," Informe se G-ganhou P-perdeu ou E-empatou [G/P/E]: \n")
					leia(StatusDePonto) 
					StatusDePonto = Texto.caixa_alta(StatusDePonto)
					se( StatusDePonto == "G"){
				         pontos[x] = pontos[x] + 3 		
					}senao se(StatusDePonto == "E") { 
						pontos[x] = pontos[x] + 1
					} senao se(StatusDePonto == "P") { 
						pontos[x] = pontos[x] + 0
					}
				}
				escreva("\n")
		}

		escreva("\n") 
        
       para(inteiro z=0;z<4;z++)
       {
       	escreva(Time[z], " Tem: ", pontos[z], "\n")
       }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 718; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */