package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

		public static void main(String[] args) throws ParseException {
		
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataVencimentoBoleto = simpleDateFormat.parse("12/09/2022");
			
			Date dataAtualHoje = simpleDateFormat.parse("11/09/2022");
			
			// After : se data 1 é maior que data 2
			//Before : Se data 1 é menor que data 2
			if (dataVencimentoBoleto.before(dataAtualHoje)) { /* SE data 1 é menor que data 2*/
				System.out.println("Boleto vencido -URGENTE");
			}else {
				System.out.println("Boleto não vencido  ");
			}
	}
	
}
