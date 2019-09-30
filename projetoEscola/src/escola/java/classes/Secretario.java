package escola.java.classes;

import escola.java.interfaces.permitirAcesso;

public class Secretario extends Pessoa implements permitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;

	private String login;
	private String senha;

	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Secretario() {

	}

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
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", dataMatricula="
				+ dataMatricula + ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.70 * 0.89;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("adminsecretario") && senha.equals("adminsecretario");
	}

}
