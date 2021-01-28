package lacosJava;

import java.util.Scanner;

public class exercicio4Lacos {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as 
		 * características psicológicas dos indivíduos de uma 
		 * região. Para tanto, a cada uma das pessoas era 
		 * perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 *  e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa 
		 *  e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema 
		 *  que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
            o número de pessoas calmas; ok
			o número de mulheres nervosas; ok 
			o número de homens agressivos; ok
			o número de outros calmos; ok
			o número de pessoas nervosas com mais de 40 anos; ok
			o número de pessoas calmas com menos de 18 anos ok
		 * */

		Scanner ler = new Scanner(System.in); 
		
		int idade = 0, pessoa = 0, contFCalmo = 0, contMCalmo = 0, contOCalmo=0;
		int contCalmo = 0,contFNevorso = 0, contMNervoso = 0, contONervoso=0;
		int contCalmo1 = 0,contFAgressivo = 0, contMAgressivo = 0, contOAgressivo=0;
		int contIdadeN =0,contIdadeC= 0, calmo = 0;
		int sexo= 0, temperamento = 0;
		
		while(pessoa<=150)
		{	
			
			System.out.printf("\n Informe sua idade: ");
			idade = ler.nextInt();
			System.out.printf("\n Informe seu sexo [1-feminino / 2-masculino / 3-Outros]: ");
			sexo = ler.nextInt();
			System.out.printf("\n Informe seu temperamento "
					+ "[1, se a pessoa era calma; 2, se a pessoa "
					+ "era nervosa e 3, se a pessoa era agressiva]: ");
			temperamento = ler.nextInt();
			
			
			
			   if(temperamento ==1 && sexo == 1) {
					contFCalmo++;
				}else if(temperamento ==1 && sexo == 2) {
					contMCalmo ++;
				}else if(temperamento ==1 && sexo == 3) {
					contOCalmo++;
				}else if(temperamento ==1) {
					contCalmo1++;
				}else if(temperamento ==2 && sexo == 1) {
					contFNevorso ++;
				}else if(temperamento ==2 && sexo == 2) {
					contMNervoso++;
				}else if(temperamento ==2 && sexo == 3) {
					contONervoso++;
				}else if(temperamento ==3 && sexo == 1) {
					contFAgressivo ++;
				}else if(temperamento ==3 && sexo == 2) {
					contMAgressivo++;
				}else if(temperamento ==3 && sexo == 3) {
					contOAgressivo++;
				}else {
					System.out.println("Não se aplica ao software !!!");
				}
				
				if (temperamento ==2 && idade>40) {
					contIdadeN ++;
				}
				
				if(temperamento ==1 && idade<18) {
					
					contIdadeC++;
				}
				if(temperamento ==1) {
					
					calmo++;
				}
				
				pessoa++;	
			}
	
		System.out.printf("\n o número de pessoas calmas: %d",calmo);
		System.out.printf("\n o número de mulheres nervosas %d",contFNevorso);
		System.out.printf("\n o número de homens agressivos %d",contMAgressivo);
		System.out.printf("\n o número de outros calmos %d",contOCalmo);
		System.out.printf("\n o número de pessoas nervosas com mais de 40 anos %d",contIdadeN);
		System.out.printf("\n o número de pessoas calmas com menos de 18 anos %d",contIdadeC);
		System.out.printf("\n Fim do programa!!!!");
		
	}

}
