package cursojava.classes;

public class testandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Andr� gattermeyer");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Maur�cio");
		diretor.setRegistroGeral("9832154836");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Priscila");
		secretario.setExperiencia("Administra��o");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	}
	
}
	
