package lacosJava;

public class exercicio2Lacos {

	public static void main(String[] args) {
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 * 
		 * */

		
		for(int i=1;i<=10;i++)
		{
			if((i%2)==0) {
				System.out.printf("\nO numero %d � par",i);
			}else if((i%2)==1) {
				System.out.printf("\n O numero %d � impar",i);
			}
		}
		
		System.out.println("\nFim do algoritmo!!!");
	}

}
