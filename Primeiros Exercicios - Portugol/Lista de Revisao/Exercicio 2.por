programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		/*
		O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar
          uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / (
          altura )2
          Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de
          acordo com a tabela abaixo.
          IMC em adultos Condição
          Abaixo de 18,5 Abaixo do peso
          Entre 18,5 e 25 Peso normal
          Entre 25 e 30 Acima do peso
          Acima de 30 obeso		
		*/

		real peso= 0.0, altura = 0.0, calculoIMC = 0.0

		escreva("Por favor me informe seu peso: \n")
		leia(peso)
	     escreva("Por favor me informe seu peso: \n")
		leia(altura)


		calculoIMC = peso/(Mat.potencia(altura,2))

		se(calculoIMC< 18.5)
		{
			escreva("Você esta abaixo do pes!!") 
		}senao se(calculoIMC>=18.5 e calculoIMC <= 25)
		{
			escreva("Seu peso está normal") 
		}senao se(calculoIMC>=25 e calculoIMC<=30)
		{
			escreva(" Você esta acima do peso")
		}senao se (calculoIMC>30) 
		{ 
			escreva("Você esta acima do peso") 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1148; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */