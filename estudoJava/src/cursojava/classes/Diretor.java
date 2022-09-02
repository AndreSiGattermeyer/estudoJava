package cursojava.classes;

/*Classe filha de pessoa*/
public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor() {
		
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", getRegistroEducacao()=" + getRegistroEducacao() + ", getTempoDirecao()="
				+ getTempoDirecao() + ", getTitulacao()=" + getTitulacao() + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getDataNascimento()=" + getDataNascimento()
				+ ", getRegistroGeral()=" + getRegistroGeral() + ", getNumeroCpf()=" + getNumeroCpf()
				+ ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public double salario() {
		return 3500;
		
	}
	
	/*Esser é o metodo do contrato de autenticação*/
	public boolean autenticar(String login, String senha) {
			this.login = login;
			this.senha = senha;
			return autenticar();
		
	}

	public boolean autenticar() {
			return login.equals("admin") && senha.equals("123");
	}
	
	
}
