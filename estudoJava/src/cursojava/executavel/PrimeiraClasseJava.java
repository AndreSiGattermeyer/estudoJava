package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*new aluno() é uma instância (criação de objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("15/01/1972");
		aluno1.setRegistroGeral("327963461");
		aluno1.setNumeroCpf("14370827669");
		aluno1.setNomeMae("Maraisa da Silva");
		aluno1.setNomePai("Winderson Nunes da Silva");
		aluno1.setDataMatricula("05/06/2015");
		aluno1.setNomeEscola("Jdev Treinamentos");
		aluno1.setSerieMatriculado("5");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
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
		
		/*=================================================================*/
		System.out.println("----------------------------------------------------------------------------------");
		
		Aluno aluno2 =  new Aluno(); /*Aqui será o Pedro*/
		aluno2.setNome("Pedro da Nóbrega");
		aluno2.setIdade(50);
		aluno2.setDataNascimento("20/05/45");
		aluno2.setRegistroGeral("187504320");
		aluno2.setNumeroCpf("08967421797");
		aluno2.setNomeMae("Aracy Balabarian");
		aluno2.setNomePai("Silvio Santos");
		aluno2.setDataMatricula("12/08/2016");
		aluno2.setNomeEscola("Jdev Treinamentos");
		aluno2.setSerieMatriculado("8");
		aluno2.setNota1(60);
		aluno2.setNota2(90);
		aluno2.setNota3(50.4);
		aluno2.setNota4(76.5);
		
		System.out.println("Nome do aluno é " + aluno2.getNome());
		System.out.println("Sua idade é: " + aluno2.getIdade());
		System.out.println("Nascimento dia: " + aluno2.getDataNascimento());
		System.out.println("Seu RG é: " + aluno2.getRegistroGeral());
		System.out.println("Seu CPF é: " + aluno2.getNumeroCpf());
		System.out.println("O nome de sua mão é: " + aluno2.getNomeMae());
		System.out.println("O nome de sua mão é: " + aluno2.getNomePai());
		System.out.println("Matrícula desde: " + aluno2.getDataMatricula());
		System.out.println("Estuda na escola: "+ aluno2.getNomeEscola());
		System.out.println("Atualmente está na: " + aluno2.getSerieMatriculado() + " série");
		System.out.println("Média do aluno é: " + aluno2.getMediaNota());
		
		/*=================================================================*/
		System.out.println("----------------------------------------------------------------------------------");
		
		Aluno aluno3 =  new Aluno(); /*Aqui será o Alex*/
		aluno3.setNome("Alex Machado");
		aluno3.setIdade(32);
		aluno3.setDataNascimento("10/09/1989");
		aluno3.setRegistroGeral("012589763");
		aluno3.setNumeroCpf("35987969882");
		aluno3.setNomeMae("Simaria Cantora");
		aluno3.setNomePai("Regis Tadeu");
		aluno3.setDataMatricula("14/09/2019");
		aluno3.setNomeEscola("Jdev Treinamentos");
		aluno3.setSerieMatriculado("7");
		aluno3.setNota1(50);
		aluno3.setNota2(40);
		aluno3.setNota3(90.8);
		aluno3.setNota4(80);
		
		System.out.println("Nome do aluno é " + aluno3.getNome());
		System.out.println("Sua idade é: " + aluno3.getIdade());
		System.out.println("Nascimento dia: " + aluno3.getDataNascimento());
		System.out.println("Seu RG é: " + aluno3.getRegistroGeral());
		System.out.println("Seu CPF é: " + aluno3.getNumeroCpf());
		System.out.println("O nome de sua mãe é: " + aluno3.getNomeMae());
		System.out.println("O nome de sua pai é: " + aluno3.getNomePai());
		System.out.println("Matrícula desde: " + aluno3.getDataMatricula());
		System.out.println("Estuda na escola: "+ aluno3.getNomeEscola());
		System.out.println("Atualmente está na: " + aluno3.getSerieMatriculado() + " série");
		System.out.println("Média do aluno é: " + aluno3.getMediaNota());
		
		/*=================================================================*/
		System.out.println("----------------------------------------------------------------------------------");
		
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Maria");
		aluno4.setIdade(50);
		aluno4.setDataNascimento("13/04/79");
		aluno4.setRegistroGeral("158698987");
		aluno4.setNumeroCpf("01236885478");
		aluno4.setNomeMae("Simone da Silveira");
		aluno4.setNomePai("Mcgiver da Cruz");
		aluno4.setDataMatricula("05/06/2015");
		aluno4.setNomeEscola("Jdev Treinamentos");
		aluno4.setSerieMatriculado("4");
		aluno4.setNota1(70);
		aluno4.setNota2(60);
		aluno4.setNota3(90);
		aluno4.setNota4(50);
		
		System.out.println("Nome do aluno é " + aluno4.getNome());
		System.out.println("Sua idade é: " + aluno4.getIdade());
		System.out.println("Nascimento dia: " + aluno4.getDataNascimento());
		System.out.println("Seu RG é: " + aluno4.getRegistroGeral());
		System.out.println("Seu CPF é: " + aluno4.getNumeroCpf());
		System.out.println("O nome de sua mãe é: " + aluno4.getNomeMae());
		System.out.println("O nome de sua pai é: " + aluno4.getNomePai());
		System.out.println("Matrícula desde: " + aluno4.getDataMatricula());
		System.out.println("Estuda na escola: "+ aluno4.getNomeEscola());
		System.out.println("Atualmente está na: " + aluno4.getSerieMatriculado() + " série");
		System.out.println("Média do aluno é: " + aluno4.getMediaNota());
		
		/*=================================================================*/
		System.out.println("----------------------------------------------------------------------------------");
		
		Aluno aluno5 = new Aluno();
		aluno5.setNome("José de Abreu");
		aluno5.setIdade(50);
		aluno5.setDataNascimento("13/04/778");
		aluno5.setRegistroGeral("158690128");
		aluno5.setNumeroCpf("012361412");
		aluno5.setNomeMae("Zoreia Nunes");
		aluno5.setNomePai("Rambo Fizilado");
		aluno5.setDataMatricula("05/06/2015");
		aluno5.setNomeEscola("Jdev Treinamentos");
		aluno5.setSerieMatriculado("1");
		aluno5.setNota1(60);
		aluno5.setNota2(30.5);
		aluno5.setNota3(85.4);
		aluno5.setNota4(50);
		
		System.out.println("Nome do aluno é " + aluno5.getNome());
		System.out.println("Sua idade é: " + aluno5.getIdade());
		System.out.println("Nascimento dia: " + aluno5.getDataNascimento());
		System.out.println("Seu RG é: " + aluno5.getRegistroGeral());
		System.out.println("Seu CPF é: " + aluno5.getNumeroCpf());
		System.out.println("O nome de sua mãe é: " + aluno5.getNomeMae());
		System.out.println("O nome de sua pai é: " + aluno5.getNomePai());
		System.out.println("Matrícula desde: " + aluno5.getDataMatricula());
		System.out.println("Estuda na escola: "+ aluno5.getNomeEscola());
		System.out.println("Atualmente está na: " + aluno5.getSerieMatriculado() + " série");
		System.out.println("Média do aluno é: " + aluno5.getMediaNota());
	}
	
}
		
		
