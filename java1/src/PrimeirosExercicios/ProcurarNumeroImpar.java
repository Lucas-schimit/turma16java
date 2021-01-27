package PrimeirosExercicios;

import java.util.Scanner;

public class ProcurarNumeroImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int Numero, Resto; 
      
      Scanner Ler = new Scanner(System.in);
      
      System.out.println("Por favor informe o numero a ser testado: ");
      Numero = Ler.nextInt();
      
      Resto = (Numero % 2);
      
      if (Numero == 0 ) 
      {
    	System.out.println("O numero e neutro");  
      }else if (Numero<0)
      {
    	  System.out.println("Não trabalhamos com numeros negativos !!");
      } else if(Resto == 0)
      {
    	  System.out.println("O Numero é Par! ");
      } else if(Resto == 1)
      {
    	  System.out.println("O numero é impar !!!");
      }
	}

}
