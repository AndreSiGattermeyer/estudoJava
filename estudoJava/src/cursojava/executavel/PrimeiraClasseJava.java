package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*new aluno() � uma inst�ncia (cria��o de objeto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual � o nome do aluno(a)?");
		String idade = JOptionPane.showInputDialog("Qual � a idade do aluno(a)?");
		String dataNascimento = JOptionPane.showInputDialog("Qual � a data de nascimento do aluno(a)?");
		String registroGeral = JOptionPane.showInputDialog("Qual � o RG do aluno(a)?");
		String Cpf = JOptionPane.showInputDialog("Qual � o CPF do aluno(a)?");
		String mae = JOptionPane.showInputDialog("Qual � o nome da m�e do aluno(a)?");
		String pai = JOptionPane.showInputDialog("Qual � o nome do pai aluno(a)?");
		String matricula = JOptionPane.showInputDialog("Qual � data da matr�cula do aluno(a)?");
		String escola = JOptionPane.showInputDialog("Qual � o nome da escola aluno(a)?");
		String serie = JOptionPane.showInputDialog("Qual � a s�rie do aluno(a) est� matriculado(a)?");
		
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); /*Converte STRING em INT*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(Cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
	
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matem�tica");
		disciplina2.setNota(80);
		
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java web");
		disciplina4.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina3);
		
		
		System.out.println(aluno1.toString()); /* Descri��o do objeto na mem�ria*/
		System.out.println("M�dia do aluno � " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
	}
	
}

		
		
		

		
		
		
		
		
		
		
		
		
