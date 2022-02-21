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
		
		for (int pos = 1;  pos <= 4; pos++) { /* 4 seria o n�mero de disciplinas, podendo aumentar de acordo com elas*/
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja removar alguma disciplina?");
		
		if (escolha == 0) { /*Op��o SIM � ZERO*/
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while(continuarRemover == 0);{
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4 ?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++; /*Soma + 1*/
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
		}
		
		System.out.println(aluno1.toString()); /* Descri��o do objeto na mem�ria*/
		System.out.println("M�dia do aluno � " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
	}
	
}

		
		
		

		
		
		
		
		
		
		
		
		
