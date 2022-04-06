package empolyeee;

public final class Presidente extends Empregado implements Autenticavel {

	public double cotaDeAcoes;
	public Autenticador autenticador = new Autenticador();
	
	public void setSenha(String senha) {
		autenticador.setSenha(senha);
	}

	public boolean autenticar(String senha) {
		return autenticador.autenticar(senha);
	}

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



}
