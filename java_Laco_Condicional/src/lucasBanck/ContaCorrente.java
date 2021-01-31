package lucasBanck;


import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;

public class ContaCorrente {

	public static void main(String[] args) throws ParseException {
		
		Conta_Corrente_Banco_Fim_Semana();
		

	}
	
	public static void Conta_Corrente_Banco_Fim_Semana() throws ParseException {
		
		String dataRecebida; 
		Scanner ler = new Scanner(System.in);
		LocalDateTime data1;
		LocalDateTime dataAtual;
		DateFormat arrumaData = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter formartar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.printf("Innforme a data do seu nascimento em dd/MM/yyyy\n");
		dataRecebida = ler.nextLine();
		Date data2 = new SimpleDateFormat("dd/MM/yyyy").parse(dataRecebida);
	
		data1 = convertToLocalDateTimeViaInstant(data2);
		
		dataAtual = LocalDateTime.now();
  

   
	}

	
	public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDateTime();
	}	
}
