package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		if (login.equalsIgnoreCase("admin") &&
				senha.equalsIgnoreCase("admin")) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*É uma lista que dentro dela temos uma chave que identifica uma sequência de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		

	
		for (int qtd = 1 ; qtd <=5; qtd++) {
		
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
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+ pos +" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos +" ?");
			
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
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) { /* Separei em listas*/
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO);
			}else
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO);
				}else  if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO);
				
				}
					
			
		}
		
		System.out.println("-------------------Lista dos Aprovados-------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("-------------------Lista dos alunos em Recuperação-------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("-------------------Lista dos aprovados Reprovados-------------------------");
		for (Aluno aluno :maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
		}
		
		
	
	}
}	
}
	
	


		
		
		

		
		
		
		
		
		
		
		
		
