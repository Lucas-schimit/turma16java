package PrimeirosExercicios;


import java.util.Scanner;
import java.lang.Math;

public class Exercicio5 {
	
	public static void main(String args[]) {
		float N1, N2, N3; 
		float MP; 
		
		Scanner Lendo = new Scanner(System.in);
		
		System.out.println("Exercicio 05 - Programação Seqüencial ");
		
		System.out.println("Informe o valor da N1: ");
		N1 = Lendo.nextInt();		
		System.out.println("Informe o valor da N2: ");
		N2 = Lendo.nextInt();
		System.out.println("Informe o valor da N3: ");
		N3 = Lendo.nextInt();
		
		MP = (float) (((N1*2.0)+(N2*3.0)+(N3*5.0))/(2.0+3.0+5.0));
		
		System.out.println("Segue a media ponderada do aluno: ");
		System.out.println(MP);
		
	}

}
