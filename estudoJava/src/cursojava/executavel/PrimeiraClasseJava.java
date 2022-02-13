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
		
		System.out.println("Nome do aluno é " + aluno1.getNome());
		System.out.println("Sua idade é: " + aluno1.getIdade());
		System.out.println("Nascimento dia: " + aluno1.getDataNascimento());
		System.out.println("Seu RG é: " + aluno1.getRegistroGeral());
		System.out.println("Seu CPF é: " + aluno1.getNumeroCpf());
		System.out.println("O nome de sua mão é: " + aluno1.getNomeMae());
		System.out.println("O nome de sua mão é: " + aluno1.getNomePai());
		System.out.println("Matrícula desde: " + aluno1.getDataMatricula());
		System.out.println("Estuda na escola: "+ aluno1.getNomeEscola());
		System.out.println("Atualmente está na: " + aluno1.getSerieMatriculado() + " série");
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " +(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = "  + aluno1.getAlunoAprovado2());
		/*=================================================================*/
		System.out.println("----------------------------------------------------------------------------------");
		
		
		
	}
	
}
		
		
