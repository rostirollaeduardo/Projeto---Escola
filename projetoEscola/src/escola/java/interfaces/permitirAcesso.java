package escola.java.interfaces;

/* Essa interface será nosso contrato de autenticação */
public interface permitirAcesso {

	 /* Apenas declaração do método */
	public boolean autenticar(String login, String senha);
	public boolean autenticar();
}
