package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	/*Usado para executar c�digo*/
	public static void main(String[] args) {
		
		double[] notas = {8.8, 7.7, 6.7, 8.4};
		double[] notasLogica = {7.0, 6.7, 8.7, 10};
		
		/*Cria��o do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Andr� Gattermeyer");
		aluno.setNomeEscola("JDEV Treinamento");
		
		
		/*Cria��o da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina(); 
		disciplina2.setDisciplina("L�gica de programa��o");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		//*******************************************************************************************
		
		Aluno[] arrayAlunos = new Aluno[1];
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length; pos ++) {
			System.out.println("O nome do aluno �: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d:arrayAlunos[pos].getDisciplinas()){
				System.out.println("Nome da disciplina �: " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota ++) {
					System.out.println("A nota n�mero: " + posnota + " � igual = " + d.getNota()[posnota]);
				}
			}
		}
		
		/*
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso : " +aluno.getNomeEscola() );
		System.out.println("----------------Disciplina do aluno------------------");
		for (Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("Disciplina :  " + d.getDisciplina());
			System.out.println("As notas da disciplina s�o: " );
			
			
			double notaMax = 0.0;
			for (int pos = 0 ; pos < d.getNota().length; pos ++) {
				System.out.println("Nota " + pos + " � igual = " + d.getNota()[pos]);
				
				if (pos== 0) {
					notaMax = d.getNota()[pos];
				}else {
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			
			System.out.println("A maior nota da Disciplina " + d.getDisciplina() + " � de valor: " + notaMax);
		} */
	}
}
		
		


