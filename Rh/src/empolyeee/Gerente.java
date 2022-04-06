package empolyeee;

public class Gerente extends Empregado implements Autenticavel {

	private String area;
	private double bonus;
	private String senha;

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

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autenticar(String senha) {
		if(this.senha.equals(senha)) {
			return true;
		}else {
			return false;
		}
	}

}
