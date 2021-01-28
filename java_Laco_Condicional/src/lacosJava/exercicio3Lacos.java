package lacosJava;

import java.util.Scanner;

public class exercicio3Lacos {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. Total de
		 *  pessoas com mais de 50 anos. O programa termina 
		 *  quando idade for =-99. (WHILE)
		 * 
		 * */
		
		Scanner ler = new Scanner(System.in);

		int idade = 0, contar1=0,contar2=0;
		while(idade>-99)
		{
			System.out.printf("\n Informe a sua idade: ");
			idade = ler.nextInt();
					if(idade<=21) {
						contar1++;
					} else if(idade>50) {
						contar2++;
					}
		}
		
		System.out.printf("\nO total de pessoas abaixo de 21 anos é de %d",contar1);
		System.out.printf("\nO total de pessoas acima de 50 anos é de %d",contar2);
	}

}
