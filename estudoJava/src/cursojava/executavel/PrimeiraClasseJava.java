package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*new aluno() é uma instância (criação de objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno(a)?");
		String idade = JOptionPane.showInputDialog("Qual é a idade do aluno(a)?");
		String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento do aluno(a)?");
		String registroGeral = JOptionPane.showInputDialog("Qual é o RG do aluno(a)?");
		String Cpf = JOptionPane.showInputDialog("Qual é o CPF do aluno(a)?");
		String mae = JOptionPane.showInputDialog("Qual é o nome da mãe do aluno(a)?");
		String pai = JOptionPane.showInputDialog("Qual é o nome do pai aluno(a)?");
		String matricula = JOptionPane.showInputDialog("Qual é data da matrícula do aluno(a)?");
		String escola = JOptionPane.showInputDialog("Qual é o nome da escola aluno(a)?");
		String serie = JOptionPane.showInputDialog("Qual é a série do aluno(a) está matriculado(a)?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); /*Converte STRING em INT*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(Cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4)); 
		
		Aluno aluno = new Aluno();
		System.out.println(aluno1.toString()); /* Descrição do aluno na memória*/
		System.out.println("Média do aluno é " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
		/* Equals e hashcode (Diferenciar e comparar objetos)*/
		Aluno aluno2 = new Aluno();
		aluno2.setNome("André");
		aluno2.setNumeroCpf("123");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("André");
		aluno3.setNumeroCpf("125");
		
		if (aluno2.equals(aluno3)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}
		
		
		
		
		
		
	}
	
}
		
		
