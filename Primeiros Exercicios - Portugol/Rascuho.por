programa
{
	
	funcao inicio()
	{
			real baseTriangulo, alturaTriangulo, areaTriangulo

	
		escreva("Informe o valor da base do Triangulo: \n")
		leia(baseTriangulo) 
		escreva("Informe o valor da altura do Triangulo: \n")
		leia(alturaTriangulo)

		se (0<baseTriangulo e alturaTriangulo>0){ 
			
			areaTriangulo = (baseTriangulo * alturaTriangulo) / 2
			escreva(" Area do Triangulo é de: " +areaTriangulo + "\n")
			
		} senao { 
			escreva("Valores informados não se aplicam \n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */