package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	/*Usado para executar código*/
	public static void main(String[] args) {
		
		double[] notas = {8.8, 7.7, 6.7, 8.4};
		double[] notasLogica = {7.0, 6.7, 8.7, 10};
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("André Gattermeyer");
		aluno.setNomeEscola("JDEV Treinamento");
		
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina(); 
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		//*******************************************************************************************
		
		Aluno[] arrayAlunos = new Aluno[1];
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length; pos ++) {
			System.out.println("O nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d:arrayAlunos[pos].getDisciplinas()){
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota ++) {
					System.out.println("A nota número: " + posnota + " é igual = " + d.getNota()[posnota]);
				}
			}
		}
		
		/*
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso : " +aluno.getNomeEscola() );
		System.out.println("----------------Disciplina do aluno------------------");
		for (Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("Disciplina :  " + d.getDisciplina());
			System.out.println("As notas da disciplina são: " );
			
			
			double notaMax = 0.0;
			for (int pos = 0 ; pos < d.getNota().length; pos ++) {
				System.out.println("Nota " + pos + " é igual = " + d.getNota()[pos]);
				
				if (pos== 0) {
					notaMax = d.getNota()[pos];
				}else {
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			
			System.out.println("A maior nota da Disciplina " + d.getDisciplina() + " é de valor: " + notaMax);
		} */
	}
}
		
		


