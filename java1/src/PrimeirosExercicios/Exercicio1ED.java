package PrimeirosExercicios;

import java.util.Scanner;

public class Exercicio1ED {

	public static void main(String[] args) {
		/*
		 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
           rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
		   estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de
		   R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P
		   (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
           variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
           com o conteúdo ZERO.
		 * */
      int P = 0, E = 0, M = 0; 
      
      Scanner ler = new Scanner(System.in);
      
      System.out.printf("Por favor informe o peso do tomate: ");
      P = ler.nextInt();
      
      if(50<P)
      {
    	  E = P - 50;
    	  M = E * 4;
      }else {
    	  E = 0;
    	  P = 0;
    	  M = 0;
    	  
      }
      
      System.out.printf("\nO peso é de: %d",P);
      System.out.printf("\nO Excesso é de: %d",E);
      System.out.printf("\nA multa é de: %d",M);
	}

}
