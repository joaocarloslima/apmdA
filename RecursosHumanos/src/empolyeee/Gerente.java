package empolyeee;

public class Gerente extends Empregado {

	private String area;
	private double bonus;

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
