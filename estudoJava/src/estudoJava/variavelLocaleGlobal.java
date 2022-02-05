package estudoJava;

public class variavelLocaleGlobal {
	
	/*Variável Global é acessível a todos e o seu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {
		
		/*variável local porque pertence somente a esse método e o valor fica dentro do método*/
		int maiorIdade = 18;
		System.out.println("Valor variável local = " + maiorIdade);
		
			metodo2();

	}
	
	public static void metodo2() {
		int mediaAno = 50;
				System.out.println("Valor da variável global =  " + maiorIdadeGlobal);
	}

}
