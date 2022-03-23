package empolyeee;

public class Engenheiro extends Empregado {

	private String departamento;
	private String crea;

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() * 1.5;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

}
