package PrimeirosExercicios;

public class Ordenando_vet {

	public static void main(String[] args) {

		for(int z=0;z<3;z++) {
			System.out.printf("\n Entre com o numero ",numeros[numero]);
			numero = ler.nextInt();
		}
			
			for(int i=0;i<3;i++) {
				for(int j=i+1; j<=3; j++) {
					
					if(numeros[i]>numeros[j])
					{
						aux = numeros[i];
						numeros[i]=numeros[j];
						numeros[j] = aux;
					}
				}
				
			}
			
			for(int x=0;x<3;x++) {
				
				System.out.printf("\n Numeros em ordem crescente: %d",numeros[x]);			
				
			}
	}

}
