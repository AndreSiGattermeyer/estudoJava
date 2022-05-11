package cursojava.classes;

public class testandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("André gattermeyer");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Maurício");
		diretor.setRegistroGeral("9832154836");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Priscila");
		secretario.setExperiencia("Administração");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	}
	
}
	
