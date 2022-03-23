package empolyeee;

public class Funcionario {

	public static void main(String[] args) {

		Engenheiro eng1 = new Engenheiro();
		eng1.setSalarioBase(5000);

		System.out.println(eng1.calcularSalario());

		Gerente gerente = new Gerente();
		gerente.setSalarioBase(7000);
		gerente.setBonus(2000);

		System.out.println(gerente.calcularSalario());
		
		Presidente presidente = new Presidente();
		presidente.setSalarioBase(7500);
		presidente.setCotaDeAcoes(4500);
		
		System.out.println(presidente.calcularSalario());

	}

}
