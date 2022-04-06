package empolyeee;

public class Gerente extends Empregado implements Autenticavel {

	private String area;
	private double bonus;
	private Autenticador autenticador = new Autenticador();
	
	public void setSenha(String senha) {
		autenticador.setSenha(senha);
	}
	
	public boolean autenticar(String senha) {
		return autenticador.autenticar(senha);
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + this.bonus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


}
