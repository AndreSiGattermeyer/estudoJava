package estudoJava;

public class estruturaDeRepeticaoEoContinue {

	public static void main(String[] args) {
		
		/*Estrutura de repeti��o FOR e CONTINUE*/
		
		for (int numero =0; numero <= 10; numero ++) {
			if (numero == 3 || numero ==8 || numero == 9) {
				System.out.println("Obaaa, encontrei o n�mero  " + numero);
				continue;
			}
			
			System.out.println("processando la�o de repeti��o");
		}
	}

}
