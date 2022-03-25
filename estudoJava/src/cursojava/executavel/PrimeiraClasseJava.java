package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		for (int qtd = 1 ; qtd <=5; qtd++) {
		
		/*new aluno() � uma inst�ncia (cria��o de objeto)*/
		/*aluno1 � uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual � o nome do aluno(a)" +qtd+ "?");
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
		
		alunos.add(aluno1);
	}
		
		for (Aluno aluno : alunos) { /* Separei em listas*/
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(aluno);
				}else  if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					alunosReprovados.add(aluno);
				
				}
					
			
		}
		
		System.out.println("-------------------Lista dos Aprovados-------------------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com m�dia de = " + aluno.getMediaNota());
		}
		
		System.out.println("-------------------Lista dos alunos em Recupera��o-------------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com m�dia de = " + aluno.getMediaNota());
		}
		
		System.out.println("-------------------Lista dos aprovados Reprovados-------------------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com m�dia de = " + aluno.getMediaNota());
		}
		
		
	}
		
}	
	
	


		
		
		

		
		
		
		
		
		
		
		
		
