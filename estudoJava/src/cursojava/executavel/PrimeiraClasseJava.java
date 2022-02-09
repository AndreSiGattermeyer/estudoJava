package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*new aluno() � uma inst�ncia (cria��o de objeto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui ser� o Jo�o*/
		aluno1.nome = "Jo�o";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno 1 �: " + aluno1.nome);
		System.out.println("Idade do aluno 1 �: " + aluno1.idade);
		
		Aluno aluno2 =  new Aluno(); /*Aqui ser� o Pedro*/
		aluno2.nome = "Pedro";
		aluno2.idade = 35;
		
		System.out.println("Nome do aluno 2 �: " + aluno2.nome);
		System.out.println("Idade do aluno 2 �: " + aluno2.idade);
		
		Aluno aluno3 =  new Aluno(); /*Aqui ser� o Alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
	}
	
}
		
		
