programa
{
	
	funcao inicio()
	{

     cadeia nome[4]
     real nota[4]
	cadeia nome1 = "A", nome2, nome3, nome4
     real MaiorNota = 0.0, nota2 = 0.0, nota3 = 0.0, nota4 = 0.0
     inteiro i = 0
	
		para(i=0; i<=3;i++){
			escreva("Informe seu nome "+i+ "\n")
			leia(nome[i])
			escreva("Informe sua nota "+i+ "\n")
			leia(nota[i])
			se(nota[i]>MaiorNota){
				MaiorNota = nota[i]
			//escreva("o aluno" +nome[i]+ " tem a maior nota" +nota[i]+"\n")
                nome1 = nome[i]
			} 	
		}

		escreva (" O Aluno com a maior nota " +nome1+ " que tirou " +MaiorNota+ "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */