package Testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.time.temporal.TemporalAccessor;

public class TesteData {

	public static void main(String[] args) throws ParseException {
		
		String dataFormtada;
		
		Scanner ler = new Scanner(System.in);
		
		LocalDateTime data;
		LocalDateTime dataAtual;
		
		DateTimeFormatter formartar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SimpleDateFormat formartar1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o seu ano de nascimento: ");
		dataFormtada = ler.nextLine();
		Date data1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataFormtada); 
		//System.out.println(dataFormtada);
		//data = formartar.format(data1);
		System.out.println(formartar1.format(data1));

		
		//data = convertToLocalDateTimeViaInstant(data1);
		
		//dataAtual = LocalDateTime.now();
		//System.out.println(formartar.format(dataAtual));
		//System.out.println(formartar.format(data));
		
	   Calendar c1 = Calendar.getInstance();
	   Date dataTest = c1.getTime(); 
	
	   
	   System.out.println(formartar1.format(dataTest));
		
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now)); 
		*/
	   
	   String igualTeste = "10/06/1995";
	   String igualTeste1 = "10/06/1995";
	   
	   if(igualTeste == igualTeste1)
	   {
		   System.out.println("Funcionou ");
	   }else {
		   System.out.println("Não funcionou ");
	   }
	}

public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDateTime();
	}


}
