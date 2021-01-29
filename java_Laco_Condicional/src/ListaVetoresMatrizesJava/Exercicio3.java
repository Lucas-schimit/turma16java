package ListaVetoresMatrizesJava;

import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
        a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma 
        posição das matrizes N1 e N2;
        b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de 
        mesma posição das matrizes N1 e N2
		 * */
		
		int mat1[][] = new int[4][6], mat2[][] = new int[4][6], matSoma[][] = new int[4][6];
		int Matsubtrair[][] = new int[4][6]; 
		
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		
		for(int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
			
				mat1[l][c] = random.nextInt(10);
				
			}
		}
		
		for(int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
			
				mat2[l][c] = random.nextInt(10);
				
			}
		}
		
		System.out.println("Valores da primeira Matriz: ");
		linha(40);
		
		
		for(int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
			
				System.out.printf("[ %d ]",mat1[l][c]);	
			}
			
			System.out.println("");
		}
		
		
		System.out.println("");
		
		System.out.println("Valores da segunda Matriz: ");
		linha(40);
		
		
		for(int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
			
				System.out.printf("[ %d ]",mat2[l][c]);	
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Valores da soma das Matrizes: ");
		linha(40);
		
		
		for(int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
			
				matSoma[l][c]=mat1[l][c]+mat2[l][c];
				
				System.out.printf("[  %d  ]",matSoma[l][c]);	
			}
			
			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("Valores da subitração das Matrizes: ");
		linha(40);
		
		
		for(int l=0;l<4;l++)
		{
			for(int c=0;c<6;c++)
			{
			
				Matsubtrair[l][c]=mat1[l][c]-mat2[l][c];
				
				System.out.printf("[  %d  ]",Matsubtrair[l][c]);	
			}
			
			System.out.println("");
		}
		
	}
	
public static void linha(int tamanho) 
	{
		for (int x=1;x<tamanho; x++)
		{
			System.out.print("═");
		}
		System.out.println();
	}

}
