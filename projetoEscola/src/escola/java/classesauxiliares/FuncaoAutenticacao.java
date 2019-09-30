package escola.java.classesauxiliares;

import escola.java.interfaces.permitirAcesso;

/* Somente receber autenticação  via interface de permitirAcesso 
 * chamando o autenticar() 
 * */

public class FuncaoAutenticacao {
	
	private permitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(permitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
