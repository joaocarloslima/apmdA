package empolyeee;

public final class Presidente extends Empregado implements Autenticavel {

	public double cotaDeAcoes;
	private String senha;

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + this.cotaDeAcoes;
	}

	public double getCotaDeAcoes() {
		return cotaDeAcoes;
	}

	public void setCotaDeAcoes(double cotaDeAcoes) {
		this.cotaDeAcoes = cotaDeAcoes;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticar(String senha) {
		if (this.senha.equals(senha)) {
			return true;
		}else {
			return false;
		}
	}

}
