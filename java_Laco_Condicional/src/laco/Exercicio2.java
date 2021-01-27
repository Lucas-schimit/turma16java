package laco;

import java.util.Scanner; 

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 * */

		Scanner ler = new Scanner(System.in);
		
		int Nota1 = 0, Nota2 =0, Nota3 = 0; 
		
		System.out.printf("\nEntre com o valor da Nota1: ");
		Nota1 = ler.nextInt();
		System.out.printf("\nEntre com o valor da Nota2: ");
		Nota2 = ler.nextInt();
		System.out.printf("\nEntre com o valor da Nota3: ");
		Nota3 = ler.nextInt();
		
		if(Nota1<=Nota2 && Nota1<=Nota3) {
			
			if(Nota2<=Nota3) {
				
				System.out.printf("\n %d,%d,%d",Nota1,Nota2,Nota3);	
				
			}else if(Nota2>=Nota3)
			{
				
				System.out.printf("\n %d,%d,%d",Nota1,Nota3,Nota2);
				
			}
		}else if(Nota2<=Nota3 && Nota2<=Nota1) {
			
			if(Nota1<=Nota3) {
				
				System.out.printf("\n %d,%d,%d",Nota2,Nota1,Nota3);
				
			}else if(Nota1>=Nota3) {
				
				System.out.printf("\n %d,%d,%d",Nota2,Nota3,Nota1);
				
			}
			
		} else if(Nota3<=Nota1 && Nota3<=Nota2) {
			
			if(Nota2<=Nota1) {
				
				System.out.printf("\n %d,%d,%d",Nota3,Nota2,Nota1);
				
			}else if(Nota2>=Nota1) {
				
				System.out.printf("\n %d,%d,%d",Nota3,Nota1,Nota2);
				
			}
			
		}
		

		
	}

}
