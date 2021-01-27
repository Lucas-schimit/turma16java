package PrimeirosExercicios;

import java.util.Scanner; 
import java.lang.Math;

public class Exercicio6 {
	
	public static void main(String args[]) {
		
		float x1,x2,y1,y2;
		double d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor de x1:");
		x1 = ler.nextFloat();
		System.out.println("Informe o valor de x2: ");
		x2 = ler.nextFloat();
		System.out.println("Informe o valor de y1: ");
		y1 = ler.nextFloat();
		System.out.println("Informe o valor de y2: ");
		y2 = ler.nextFloat();
		
		d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		System.out.println("O valor de d: ");
		System.out.println(Math.floor(d));
	}

}
