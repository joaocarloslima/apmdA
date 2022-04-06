package empolyeee;

public class Autenticador {
	
	private String senha;
	
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

	public boolean autenticar(String senha) {
		if(this.senha.equals(senha)) {
			return true;
		}else {
			return false;
		}
	}

}
