package cursojava.classes;

public class testandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Andr� gattermeyer");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Maur�cio");
		diretor.setRegistroGeral("9832154836");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Priscila");
		secretario.setExperiencia("Administra��o");
		secretario.setIdade(35);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade() +  " - " + aluno.msgMaiorIdade() );
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Sal�rio do aluno � = "  + aluno.salario());
		System.out.println("Sal�rio diretor � = "  + diretor.salario());
		System.out.println("Sal�rio do secret�rio � = "  + secretario.salario());
		
	}
	
}
	
