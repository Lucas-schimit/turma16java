programa
{
	
	funcao inicio()
	{
      /*
      Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
      a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;   
      b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2 
      */
      inteiro Mat1[4][6], Mat2[4][6], l1=0, c1=0, l2=0, c2=0, sl = 0, sc = 0, MatS[4][6], MatSu[4][6], sul =0, suc = 0
      
      para(l1=0;l1<4;l1++){
          para(c1=0;c1<6;c1++)
          {

          	escreva("Entre com os valores da primeira Matriz na linha ", l1 ," coluna ", c1 ,": \n")
          	leia(Mat1[l1][c1])
          }
      }
      
      para(l2=0;l2<4;l2++){
          para(c2=0;c2<6;c2++)
          {

          	escreva("Entre com os valores da Segunda Matriz na linha ",l2, "coluna",c2, ": \n")
          	leia(Mat2[l2][c2])
          }


      }

      // Realizando a Soma
      escreva("Soma das matrizes: \n")
      
         para(sl=0;sl<4;sl++){
          para(sc=0;sc<6;sc++)
          {
          	MatS[sl][sc] = Mat1[sl][sc]+Mat2[sl][sc]
          	escreva(" [ ", MatS[sl][sc], "]")
          }
          escreva("\n") 
         }

          escreva("_________________________________________\n")
          escreva("Subtração das matrizes: \n")

          // Realizando a Subtração


         para(sul=0;sul<4;sul++){
          para(suc=0;suc<6;suc++)
          {
          	MatS[sul][suc] = Mat1[sul][suc]-Mat2[sul][suc]
          	escreva(" [ ", MatS[sul][suc], "]")
          }

          escreva("\n")
          
      }      
	
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 865; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */