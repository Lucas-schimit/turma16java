programa
{
	
	funcao inicio()
	{
		/*
		Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código
          inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se
          for 2, mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma
          mensagem informando que o código inválido.
		*/
		
		inteiro Vet1[5]= {1,2,3,4,5}
		caracter opcao

			escreva(" Entre com o valor para visualizar o vetor: ") 
			leia(opcao)

		se(opcao=='1')
		{
			para(inteiro i=0; i<5; i++)
			{
				escreva("[ ", Vet1[i], " ]")
			}
		} senao se(opcao=='2')
		{
		para(inteiro i=4; i>=0; i--)
			{
				escreva("[ ", Vet1[i], " ]")
			}
		} senao se (opcao=='0')
		{
			escreva(" Programa finalizado !!!")
		} senao
		{
			escreva("Código invalido")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 838; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */