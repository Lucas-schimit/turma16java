package PrimeirosExercicios;

import java.util.Scanner; 
import java.lang.Math; 

public class Exercicio_4 {
	
	public static void main(String args[])
	{
	
      float R, S, D;
      int A, B, C; 
      
      Scanner Ler = new Scanner(System.in);
      System.out.println("Exercicio 04 - Programação Seqüencial");
      
      System.out.println("Informe o valor de A: ");
      A = Ler.nextInt();
      System.out.println("Informe o valor de B: ");
      B = Ler.nextInt();
      System.out.println("Informe o valor de C: ");
      C = Ler.nextInt();
      
       R = (float) Math.pow(A+B, 2);
       S = (float) Math.pow(B+C, 2);
       D= (R+S)/2;
       
       System.out.println("O valor de R: ");
       System.out.println(R);
       System.out.println("O valor de S:");
       System.out.println(S);
       System.out.println("O valor de D:");
       System.out.println(D);	   
	}

}
