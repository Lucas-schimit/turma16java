package DesafioEdVetor;

import java.util.Scanner; 

public class Paulistinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);

		String times[] = {"CORITHIANS", "PALMEIRAS", "SANTOS", "SPFC"};
		int pontos[] = new int[4]; 
		int totalPontos=0, indice =0;  
		char statusPontos = 'o';
		
		for(int i=0;i<4;i++) {
			
			System.out.printf("Rodada numero: %d", i, "\n");
			 	
			for(int x = 0; x<4;x++) {
				
				System.out.printf(times[i]," \n %s Informe se G-ganhou P-perdeu ou E-empatou [G/P/E]: \n");
				statusPontos = ler.next().toUpperCase().charAt(0);
				
				if(statusPontos == 'G') {
					
					pontos[x] += + 3; 
					
				}else if(statusPontos == 'E') {
					
					pontos[x] += + 1;
					
				}else if(statusPontos == 'P') {
					
					pontos[x] += + 0;
					
				}
				
			}
			System.out.printf("\n");
			
		}
		System.out.printf("\n");
		
			System.out.printf("\n Por favor inform o time para saber o resultado: ");
			indice = ler.nextInt();

		
		System.out.printf(times[indice],"O time %s possue: %d pontos:" +pontos[indice]);
		
		System.out.println("Fim do programa!!");
		
	}

}
