programa
{
	inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{
		/*
		1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
         a) média do salário da população; 
         b) média do número de filhos; 
         c) maior salário; 
          d) percentual de pessoas com salário até R$100,00.  
		*/

		real salarioPopulacao = 0.0, numeroFilhos = 0.0, mediaSalarial, salarioTotalPopulacao = 0.0, 
		totalFilhos = 0.0, salarioMaior = 0.0, habitantes = 20.0, PE = 0.0
		inteiro i 




		 para(i=1;i<=habitantes;i++){

		escreva("Informe o seu salario abitante "+i+ ":\n") 
		leia(salarioPopulacao)
		escreva("Informe o seu numero de filhos abitante : " +i+ "\n") 
		leia(numeroFilhos)

            salarioTotalPopulacao = salarioTotalPopulacao + salarioPopulacao
            totalFilhos = totalFilhos + numeroFilhos

            se(salarioMaior<salarioPopulacao){
            	salarioMaior = salarioPopulacao	
            } 
		 	se (salarioPopulacao <=100){

		 		PE=PE+1
		 	}
		 }

          escreva("A media de sálario da população é:" +Mat.arredondar((salarioTotalPopulacao/habitantes),2)+"\n")
          escreva("A media de filhos da população é:" +Mat.arredondar((totalFilhos/habitantes),2)+"\n")
          escreva("O maior Salario é :" +salarioMaior+"\n")
          escreva("O numero de pessoal de até 100 reais é de:" +Mat.arredondar((PE/habitantes)*100,2)+"%\n")
          
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */