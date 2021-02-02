package DesafioEd;


import java.util.Scanner; 

public class IniciandoObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Triangulo Tri = new Triangulo();
		
		double trianguloMaior=0.0; 
		double triangulo1 = Tri.CalculoTriangulo(2, 4);
		double triangulo2 = Tri.CalculoTriangulo(10, 10);
		double triangulo3 = Tri.CalculoTriangulo(8, 9);
		
		for(int i=0;i<3;i++) {
			if(triangulo1>trianguloMaior) {
				trianguloMaior = triangulo1; 
			}else if(triangulo2>trianguloMaior) {
				trianguloMaior = triangulo2;
			}else if(triangulo3>trianguloMaior) {
				trianguloMaior = triangulo3;
			}
				
		}
		
		System.out.printf("%f.2",triangulo1,"\n");
		System.out.println();
		System.out.printf("%f.2",triangulo2,"\n");
		System.out.println();
		System.out.printf("%f.2",triangulo3,"\n");
		System.out.println();
		System.out.printf("%f.2",trianguloMaior,"\n");
		
	}

}
