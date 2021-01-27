programa
{
	
	funcao inicio()
	{
		/*
		PROJETO DE MINI E-COMMERCE
          STOREBOARD
          [NOME DA LOJA]
          [SLOGAN]
          *LISTA 10 PRODUTOS - LIMITE NO ESTOQUE É 10 DE CADA PRODUTO
           VALOR UNITÁRIO - SEJA SIMPLES
           LISTA NA TELA
           [COD PRODUTO] [NOME DO PRODUTO][ESTOQUE][VALOR UNITARIO]
           1 - OPÇÃO DE SELECIONAR UM PRODUTO - INFORMA O QTDE
           NÃO PODE SELECIONAR UM PRODUTO DUAS VEZES
           TEM QUE RESPEITA O ESTOQUE
           NÃO PODE SELECIONAR PRODUTO COM ESTOQUE ZERO
           2 - CONTINUA S/N A ESCOLHA ok
           3 - SELECIONAR DE NOVO SE NECESSÁRIO
           4 - CASO FIM FECHAR COMPRA SEGUINDO REGRAS DE PAGAMENTO:
           IMPOSTO 9% [DEVER SE INFORMADO AO USUÁRIO]
           A VISTA - 10% DESCONTO
           CARTÃO - 1 VEZ VALOR NORMAL - SEM DESCONTO
           CARTÃO - 2 VEZES [ MOSTRA PARCELAS COM JUROS DE 10% NO TOTAL]
           CARTÃO - 3 VEZES [ MOSTRA PARCELAS COM JUROS DE 15% NO TOTAL]
           5 - EMITI UMA NOTINHA FISCAL EM TELA
           [NOME LOJA]
           ---------------------------------------------------------------------------------
           VALOR DO IMPOSTO TOTAL 9% = xxxxx
		 [PRODUTO] [QTDE] [VALOR FINAL]
           TOTAL GERAL
           OPÇÃO DE PAGAMENTO
           TOTAL A SER PAGO [MEDIANTE A OPÇÃO] E PARCELAS SE EXISTIREM, E VALOR
           DAS PARCELAS
           RETORNA PARA O INICIO - OS SALDOS DEVEM SER ATUALIZADOS NA PROXIMA
           EXIBIÇÃO
		*/

		cadeia NomeLoja, SloganLoja, ProdutosLoja[10] = { "Coca-Cola", "Macarrão", "Pão-de-Alho", "Caixa-de-Chocolate", "Barra-de-choolate","Guarrana","Pao","Lasanha","Guardanapo", "Manteiga"} 
		real PrecosLoja[10] = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0}
		inteiro CodigoProdutosLoja[10] = {1,2,3,4,5,6,7,8,9,10}, EstoqueLoja[10] = {10,10,10,10,10,10,10,10,10,10} 
		inteiro ProdutoLoja = 0, conteVez = 0, 
		caracter ContinuarSN = 's'

		para (inteiro i=0;i<10;i++)
		{
			escreva("COD PRODUTO: ",CodigoProdutosLoja[i], " NOME DO PRODUTO: ", ProdutosLoja[i], " ESTOQUE: ", EstoqueLoja[i], " VALOR UNITARIO: ", PrecosLoja[i], "\n")
		}

          faca {
          	
           
		escreva(" Informe o produto desejado: 0 - Coca-Cola, 1 - Macarrão, 2 - Pão-de-Alho, 3 - Caixa-de-Chocolate, 4 - Barra-de-choolate, 5 - Guarrana, 6 - Pao, 7 - Lasanha, 8 - Guardanapo, 9 - Manteiga \n")
		leia(ProdutoLoja)

		 para(inteiro x=0; x<10; x++){
             	
			escreva(" Produto: [",ProdutosLoja[ProdutoLoja], "] com estoque ", EstoqueLoja[ProdutoLoja], "\n") 
		}
		
		escreva(" Deseja continuar a escolher mais produtos: s/n \n")
			leia(ContinuarSN)
		
		}enquanto(ContinuarSN == 's')
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */