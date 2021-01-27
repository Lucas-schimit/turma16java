programa
{
	
	funcao inicio()
	{
		
		/*
		Elabore um programa que calcule o que deve ser pago por um produto, considerando o
          preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da
          tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
          adequado.
          Código Condição de pagamento
          1 À vista em dinheiro ou cheque, recebe 20% de desconto
          2 À vista no cartão de crédito, recebe 15% de desconto
          3 Em duas vezes, preço normal de etiqueta sem juros
          4 Em três vezes, preço normal de etiqueta mais juros de 10%	
		*/
		real PrecosProdutos[4] = {10.0,20.0,30.0,40.0}, preco, PrecosComFormaPagamento = 0.0, PrecoAtual = 0.0
		cadeia produtos[] = {"suco", "coca", "chocolate", "bolacha"}
		caracter FormaDePagamento = '1'
          inteiro indice = 0

            escreva(" Informe a forma de pagamento 1 - À vista em dinheiro ou cheque, recebe 20% de desconto, 2 - À vista no cartão de crédito, recebe 15% de desconto, 3 - Em duas vezes, preço normal de etiqueta sem juros4 - Em três vezes, preço normal de etiqueta mais juros de 10% \n") 	
            leia(FormaDePagamento)  

            escreva("Escolha o produto [0 - suco, 1  - coca, 2 - chocolate, 3 - bolacha] \n")
            leia(indice) 
            
               
           para(inteiro i=0; i<4; i++)
           { 
           	se(FormaDePagamento == '1')
           	{
           		PrecosComFormaPagamento = (PrecosProdutos[indice] * 0.20) 
           		PrecoAtual = PrecosProdutos[indice] - PrecosComFormaPagamento             		
           	}
           	senao se(FormaDePagamento == '2'){
           		
           		PrecosComFormaPagamento = (PrecosProdutos[indice] * 0.15)
           		PrecoAtual = PrecosProdutos[indice] - PrecosComFormaPagamento           	     	          	
           	}senao se(FormaDePagamento == '3')
           	{
           		PrecosComFormaPagamento = (PrecosProdutos[indice]/2)
           	}senao se(FormaDePagamento == '4')
           	{
           		PrecosComFormaPagamento = (PrecosProdutos[indice] * 0.10)
           		PrecoAtual = PrecosProdutos[indice] - PrecosComFormaPagamento           	     	           		
           	}
           }

           se (FormaDePagamento == '1')
           {
		escreva(" O valor do Produto: ",produtos[indice]," ", PrecosProdutos[indice], " vai sair por: ", PrecoAtual,"\n")
           } senao se(FormaDePagamento == '2')
           {
           	escreva(" O valor do Produto: ",produtos[indice]," " , PrecosProdutos[indice], " vai sair por: ", PrecoAtual,"\n")
           }senao se(FormaDePagamento == '3')
           {
           	escreva(" Você pagara em duas vezes a primeira parcela de: ",PrecosComFormaPagamento,"\n")
           }senao se(FormaDePagamento == '4')
           {
           	escreva(" O valor do Produto: ",produtos[indice], PrecosProdutos[indice], " vai sair por: ", PrecoAtual,"\n")
           }
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */