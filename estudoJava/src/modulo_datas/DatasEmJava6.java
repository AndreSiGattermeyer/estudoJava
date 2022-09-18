package modulo_datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class DatasEmJava6 {
	
	public static void main(String[] args) throws ParseException, InterruptedException{
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000); /* Pode ser um processo com tempo qualquer que n�o conhecemos*/
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println(" Dura��o em nano segundos : " + duracao.toNanos());
		
		System.out.println(" Dura��o em minutos : " + duracao.toMinutes());
		
		System.out.println(" Dura��o em horas : " + duracao.toHours());
		
		System.out.println(" Dura��o em milisegundos : " + duracao.toMillis());
		
		System.out.println(" Dura��o em dias : " + duracao.toDays());
	}
}
