package lacosJava;

public class exercicio1Lacos {

	public static void main(String[] args) {
		/*Informar todos os n�meros de 1000 a 1999 
		 * que quando divididos por 11 obtemos resto = 5. (FOR)
		 * 
		 * */

		
		for(int i=1000;i<1999;i++)
		{
			if((i%11)==5) {
				System.out.printf("\n Os valores de 1000 a 1999 que s�o divisiveis por 11 que o resto � 5 : ");
				System.out.printf("\n %d",i);
			}
		}
		
		System.out.printf("\nFim do algoritmo!!");
	}

}
