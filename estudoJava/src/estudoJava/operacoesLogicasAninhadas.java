package estudoJava;

public class operacoesLogicasAninhadas {
		
	public static void main(String[] args) {
		
		int nota1 = 60;
		int nota2 = 50;
		int nota3 = 30;
		int nota4 = 50;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		/**Operações lógicas aninhadas: São operações dentro de operações*/
		
		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está aprovado direto - Parabéns " + media + " é a média");
				}else {
					System.out.println("Aluno está aprovado direto " + media +  " é a média");
				}
			}else {
				System.out.println("Aluno está em recuperação " + media +  " é a média");
			}
		}else {
			System.out.println("Aluno reprovado direto " + media + " é a média");
		}
		
	}
	
	
}
