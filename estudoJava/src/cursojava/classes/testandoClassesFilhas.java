package cursojava.classes;

public class testandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("André gattermeyer");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Maurício");
		diretor.setRegistroGeral("9832154836");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Priscila");
		secretario.setExperiencia("Administração");
		secretario.setIdade(35);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade() +  " - " + aluno.msgMaiorIdade() );
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário do aluno é = "  + aluno.salario());
		System.out.println("Salário diretor é = "  + diretor.salario());
		System.out.println("Salário do secretário é = "  + secretario.salario());
		
		Pessoa pessoa = new Aluno();
		
		pessoa = secretario;
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	public static void teste (Pessoa pessoa) {
		System.out.println(pessoa.getNome() + ", essa pessoa é demais "
		+ " e o salário é = " + pessoa.salario());
	}
	
}
	
