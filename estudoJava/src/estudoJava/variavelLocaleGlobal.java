package estudoJava;

public class variavelLocaleGlobal {
	
	/*Vari�vel Global � acess�vel a todos e o seu valor � compartilhado*/
	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {
		
		/*vari�vel local porque pertence somente a esse m�todo e o valor fica dentro do m�todo*/
		int maiorIdade = 18;
		System.out.println("Valor vari�vel local = " + maiorIdade);
		
			metodo2();

	}
	
	public static void metodo2() {
		int mediaAno = 50;
				System.out.println("Valor da vari�vel global =  " + maiorIdadeGlobal);
	}

}
