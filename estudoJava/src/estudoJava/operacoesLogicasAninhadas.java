package estudoJava;

public class operacoesLogicasAninhadas {
		
	public static void main(String[] args) {
		
		int nota1 = 60;
		int nota2 = 50;
		int nota3 = 30;
		int nota4 = 50;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		/**Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es*/
		
		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno est� aprovado direto - Parab�ns " + media + " � a m�dia");
				}else {
					System.out.println("Aluno est� aprovado direto " + media +  " � a m�dia");
				}
			}else {
				System.out.println("Aluno est� em recupera��o " + media +  " � a m�dia");
			}
		}else {
			System.out.println("Aluno reprovado direto " + media + " � a m�dia");
		}
		
	}
	
	
}
