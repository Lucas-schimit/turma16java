programa
{
	
	funcao inicio()
	{
		escreva("Exercicio 01 - Programação Seqüencial")

		
		real ano, mes, dia
		real M =0, Mt=0
		real calculo
		real AnoEmDias, MesEmDias = 0
   		real AnoA,MesA
   		real MesmoM

		
		escreva("Por favor entre com sua data de nascimento no formato de Ano/Mês/Dia: \n")
		escreva("Informe seu ano por favor: \n")
		leia(ano)
		escreva("Informe o numero do seu mês: \n")
		leia(mes)
	     escreva("Informe o numero do seu dia: \n")
		leia(dia)
		escreva ("informe seu ano atual: \n")
		leia(AnoA)
		escreva ("informe seu mes atual: \n")
		leia(MesA)

		se (mes==1){
			M = 31			
			}
		se (mes==2){
			M = 28
			}
		se (mes==3){
			M = 31
		}
		se (mes==4){
			M = 30
		}
		se (mes==5){
			M = 31
		}
		se (mes==6){
			M = 30
		}
		se (mes==7){
			M = 31
		}
		se (mes==8){
			M = 31
		}
		se (mes==9){
			M = 30
		}
		se (mes==10){
			M = 31
		}
		se (mes==11){
			M = 30
		}
		se (mes==12){
			M=31
		}

        //Definindo os dias para cada mês          
		se (MesA==1){
			 Mt = 31			
			}
		se (MesA==2){
			Mt = 28
			}
		se (MesA==3){
			Mt = 31
		}
		se (MesA==4){
			Mt = 30
		}
		se (MesA==5){
			Mt = 31
		}
		se (MesA==6){
			Mt = 30
		}
		se (MesA==7){
			Mt = 31
		}
		se (MesA==8){
			Mt = 31
		}
		se (MesA==9){
			Mt = 30
		}
		se (MesA==10){
			Mt = 31
		}
		se (MesA==11){
			Mt = 30
		}
		se (MesA==12){
			Mt = 31
		}

		// Se o mês for igual colocar o tem a segunte condição

		se (MesA == mes){
			MesmoM = M-dia
		} senao{
			MesmoM = MesEmDias
		}

          AnoEmDias = (AnoA - ano) * 365.25 // Transformando os anos em dias
          MesEmDias = (Mt - M) * 30
		calculo = AnoEmDias + MesEmDias + dia

		 escreva("Você viveu " +calculo + " Dias \n")
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1725; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */