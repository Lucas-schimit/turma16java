programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade

		escreva("Informe sou nome: \n")
		leia(nome) 
		escreva("Informe sua idade")
		leia(idade)

		se (5>idade){
			escreva("Não se aplica para empresa")
		}senao se(5<=idade e 7>=idade){ 
			escreva("Infantil A \n")
		}senao se (8<=idade e 11>=idade){
			escreva("Infantil B \n")
		}senao se (12<=idade e 13>=idade){
			escreva("Juvenil A")
		}senao se (14<=idade e 17>=idade){
			escreva("Juvenil B")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */