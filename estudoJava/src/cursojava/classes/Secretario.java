package cursojava.classes;

/*Classe filha de pessoa*/
	public class Secretario extends Pessoa implements PermitirAcesso{

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", getRegistro()=" + getRegistro() + ", getNivelCargo()=" + getNivelCargo() + ", getExperiencia()="
				+ getExperiencia() + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral()
				+ ", getNumeroCpf()=" + getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()="
				+ getNomePai() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public double salario() {
		return 1800.80 * 0.9;
		
	}
	
	/*Esser é o metodo do contrato de autenticação*/
	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	
	
}
