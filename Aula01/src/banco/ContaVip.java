package banco;

public class ContaVip extends Conta {

	private double limite;
	
	//sobrescrita de m�todo
	@Override
	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
