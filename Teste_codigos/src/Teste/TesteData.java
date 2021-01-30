package Teste;


import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteData {

	public static void main(String[] args) throws ParseException {
		
		
		DateFormat arrumaData = new SimpleDateFormat("dd/MM/yyyy");
		Scanner ler = new Scanner(System.in);
		String dataRecebida;
		Date data;
		
		
		System.out.printf("Software para testar data !!!\n");
		System.out.printf("Innforme a data em dd/MM/yyyy\n");
		dataRecebida = ler.nextLine();
		data = arrumaData.parse(dataRecebida);
		
		System.out.println(data);
		
		
	}

}
