package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
											new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	
	public static void add (ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
		@Override
		public void run() {
			
			System.out.println("Fila rodando");
			
			
			while(true) {
			
			synchronized (pilha_fila) { /*Bloquear o acesso a essa lista por outros processos*/
				
				
				Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) { /*Enquanto conter dados na lista irá processar*/
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
					
					/*Processar 10000 Nfs*/
					/*Gerar uma lista enorme de PDF*/
					/*Gerar um envio em massa de email*/
					System.out.println("-------------------------------------------------------------------------------------");
					
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					
					iteracao.remove();
					
					try {
						Thread.sleep(1000); /*Dar um tempo para a descarga de memória*/
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			try {
				Thread.sleep(1000); /* Processou toda a lista e dar um tempo para a limpeza de memória*/
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}	
			
		
	
	}
		
		
}
