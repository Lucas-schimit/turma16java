programa
{
	inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{

		/*
		Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
		e apresente no final o total do somatório, a média e o total de valores lidos.
		O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
		valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
		*/
		
		real contador = 0.0, totalValor = 0.0, PE = 0.0

			escreva("Informe um numero: \n")
			leia(contador) 
		
		enquanto(contador>0){
             
			escreva("Informe um numero: \n")
			leia(contador) 

			totalValor = totalValor + contador
			PE = PE + 1
		}

		escreva("A somatória dos valores lidos são:"+totalValor+"\n")
		escreva("A média dos valores lidos são:"+Mat.arredondar(totalValor/PE,2)+"\n")

		escreva("Progama não trabalha com numeros negativos!!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */