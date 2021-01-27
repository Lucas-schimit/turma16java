programa
{
	
	funcao inicio()
	{
		cadeia nome //Variavel de entrada
		inteiro idade //Variavel de entrada

          // Coletando os dados do usuário
		escreva("Informe sou nome: \n") 
		leia(nome) 
		escreva("Informe sua idade: \n")
		leia(idade)


         //Processando as informações
		se (5>idade){
			escreva("Não se aplica para empresa")
		}senao se(5<=idade e 7>=idade){ 
			escreva("Seu filho "+nome+"tem"+idade+" é Infantil A \n")
		}senao se (8<=idade e 11>=idade){
			escreva("Seu filho "+nome + "tem"+idade+" é Infantil B \n")
		}senao se (12<=idade e 13>=idade){
			escreva("Seu filho "+nome+"tem"+idade+" é Juvenil A")
		}senao se (14<=idade e 17>=idade){
			escreva("Seu filho "+nome+" tem "+idade+" é Juvenil B")
		} senao se(18<idade){
			escreva("Seu filho "+nome+ "tem " +idade+ " é adulto")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 795; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */