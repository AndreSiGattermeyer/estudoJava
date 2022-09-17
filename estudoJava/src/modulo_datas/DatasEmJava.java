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
			
			
			if (dataVencimentoBoleto.before(dataAtualHoje)) { 
				System.out.println("Boleto vencido -URGENTE");
			}else {
				System.out.println("Boleto não vencido  ");
			}
	}
	
}
