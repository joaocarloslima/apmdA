package empolyeee;

public final class Presidente extends Empregado {

	public double cotaDeAcoes;

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
