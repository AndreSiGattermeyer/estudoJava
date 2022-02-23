package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1 ; qtd <=2; qtd++) {
		
		/*new aluno() é uma instância (criação de objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual é o nome do aluno(a)" +qtd+ "?");
		String idade = JOptionPane.showInputDialog("Qual é a idade do aluno(a)?");
		String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento do aluno(a)?");
		String registroGeral = JOptionPane.showInputDialog("Qual é o RG do aluno(a)?");
		String Cpf = JOptionPane.showInputDialog("Qual é o CPF do aluno(a)?");
		String mae = JOptionPane.showInputDialog("Qual é o nome da mãe do aluno(a)?");
		String pai = JOptionPane.showInputDialog("Qual é o nome do pai aluno(a)?");
		String matricula = JOptionPane.showInputDialog("Qual é data da matrícula do aluno(a)?");
		String escola = JOptionPane.showInputDialog("Qual é o nome da escola aluno(a)?");
		String serie = JOptionPane.showInputDialog("Qual é a série do aluno(a) está matriculado(a)?");
		
		
		
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
		
		for (int pos = 1;  pos <= 4; pos++) { /* 4 seria o número de disciplinas, podendo aumentar de acordo com elas*/
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja removar alguma disciplina?");
		
		if (escolha == 0) { /*Opção SIM é ZERO*/
			
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
		
		for (Aluno aluno : alunos) {
			
			alunos.remove(aluno);
			
			if (aluno.getNome().equalsIgnoreCase("André")) { /*Vai remover o aluno André*/
			alunos.remove(aluno);
			break;
			}else {
				System.out.println(aluno.toString()); /* Descrição do objeto na memória*/
				System.out.println("Média do aluno é " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------------------------------");
				
			}
		}
	
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias são");
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}
		
	}
		
}	
	
	


		
		
		

		
		
		
		
		
		
		
		
		
