package estudoJava;

public class ifElse {

	public static void main(String[] args) {

		int nota1 =90;
		int nota2 =70;
		int nota3 =80;
		int nota4 =70;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Condi�oes l�gicas com IF e Else
		if (media <=70) {
			System.out.println("Aluno Aprovado: " + media);
			
			if (media <=40 && media <= 69) {
				System.out.println("Aluno em recupera��o: " + media);
				
			}else {
				System.out.println("Aluno reprovado: " + media);
			}*/
		}
	
			
	/*Operadores tern�rios s�o para micro valida��es*/

	
	 String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69) ?"Aluno em recupera��o"  : "reprovado";
	
	System.out.println(saidaResultado);
	
	   	}
	
}
	
	

