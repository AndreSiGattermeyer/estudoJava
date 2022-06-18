package curso.java.excecao;

public class ExcessaoProcessarNota extends Exception {

	public ExcessaoProcessarNota(String erro) {
		super("Vixi, um erro no processamento das notas do aluno" + erro);
	}

}
