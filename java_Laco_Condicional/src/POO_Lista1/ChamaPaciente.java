package POO_Lista1;

import java.io.InputStream;
import java.util.Scanner;

public class ChamaPaciente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Paciente Pat1 = new Paciente();
		
		System.out.println("Informe seu nome: ");
		Pat1.setNome(ler.nextLine());
		System.out.println("Informe a doença: ");
		Pat1.setDoenca(ler.nextLine());
		System.out.println("Informe seu registro: ");
		Pat1.setRegistroDopaciente(ler.nextLine());
	
		
		System.out.println(" O Nome: " + Pat1.getNome() + " Doença " + Pat1.getDoenca() + " Registro " + Pat1.getRegistroDopaciente());
	}



}
