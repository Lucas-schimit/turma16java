package PrimeirosExercicios;

import java.util.Scanner;

public class Exercicio1ED {

	public static void main(String[] args) {
		/*
		 * Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
           rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
		   estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de
		   R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
		   (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
           vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis
           com o conte�do ZERO.
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
      
      System.out.printf("\nO peso � de: %d",P);
      System.out.printf("\nO Excesso � de: %d",E);
      System.out.printf("\nA multa � de: %d",M);
	}

}
