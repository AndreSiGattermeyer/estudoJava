package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class PeriodosEntreDatas {

	public static void main(String[] args) throws ParseException{
		
		LocalDate dataAntiga = LocalDate.parse("2019-10-05");
		
		LocalDate dataNova = LocalDate.parse("2021-10-10");
		
		System.out.println("Data antiga é maior que data nova? " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a data nova? " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Data são iguais? " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias: " + periodo.getDays());
		
		System.out.println("Quantos meses: " + periodo.getMonths());
		
		System.out.println("Quantos anos: " + periodo.getYears());
		
		System.out.println("Somente meses: " + periodo.toTotalMonths());
		
		System.out.println("Período é: " +  periodo.getYears() + " anos " + periodo.getMonths() + " meses e "  + periodo.getDays() + "  dias");
	}
}
