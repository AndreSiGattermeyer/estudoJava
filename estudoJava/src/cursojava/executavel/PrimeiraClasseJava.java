package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*new aluno() é uma instância (criação de objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		aluno1.nome = "João";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno 1 é: " + aluno1.nome);
		System.out.println("Idade do aluno 1 é: " + aluno1.idade);
		
		Aluno aluno2 =  new Aluno(); /*Aqui será o Pedro*/
		aluno2.nome = "Pedro";
		aluno2.idade = 35;
		
		System.out.println("Nome do aluno 2 é: " + aluno2.nome);
		System.out.println("Idade do aluno 2 é: " + aluno2.idade);
		
		Aluno aluno3 =  new Aluno(); /*Aqui será o Alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}
	
}
		
		
