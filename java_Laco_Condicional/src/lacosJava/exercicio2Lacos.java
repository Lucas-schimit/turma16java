package lacosJava;

public class exercicio2Lacos {

	public static void main(String[] args) {
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 * 
		 * */

		
		for(int i=1;i<=10;i++)
		{
			if((i%2)==0) {
				System.out.printf("\nO numero %d é par",i);
			}else if((i%2)==1) {
				System.out.printf("\n O numero %d é impar",i);
			}
		}
		
		System.out.println("\nFim do algoritmo!!!");
	}

}
