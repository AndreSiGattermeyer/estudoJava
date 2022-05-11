package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

/*Esta é nossa classe/objeto que representa o aluno*/
/*Classe filha de pessoa*/
public class Aluno  extends Pessoa {

	/*Esses são os atributos do Aluno*/
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina>  disciplinas = new ArrayList<Disciplina>();
	
	
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	

	/*Método que retorna a média do aluno*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size(); /*Retorna quantas disciplinas existirem*/
	}
	
	
	
	/*Método que retorna TRUE para aprovado e FALSE para reprovado*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) { /*Aprovado*/
			return true;
		}else {
			return false;/*Reprovado*/
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

	
	





	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) { /*Reprovado*/
			if (media >= 70) {
			return StatusAluno.APROVADO;
		}else {
			return StatusAluno.RECUPERACAO;
		}
	}else {
		return StatusAluno.REPROVADO;
				}
	}
	
	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}

	public Aluno() { /*Cria os dados na memória sendo padrão do Java*/
		
	}
	
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*Veremos os méttodos GETTERS e SETTERS do objeto */
	/*SET é para adicionar ou receber dados para os atributos*/
	/*GET é para resgatar ou obter o valor do atributo*/
	
	
	/*SET recebe dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getNome() {
		return nome;
	}

	@Override /*Identifica método sobreescrito*/
	public boolean pessoaMaiorIdade() {
		
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Obaa aluno é maior de idade " : "Ixii vc é menor de idade";
	}
	
}
