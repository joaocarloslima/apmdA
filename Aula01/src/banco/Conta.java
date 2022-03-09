package banco;

public abstract class Conta {
	
	//construtor padrão
	private static final int BANCO = 999;
	private String titular; //atributo da classe
	private int numero;
	protected double saldo;
	
	public Conta(String titular) { //sobrecarga de metodo
		this.titular = titular;
	}
	
	public Conta() {
		
	}
	
	public static void selic() {
		
	}
	
	//public abstract void validarCliente();
	
	public void setTitular(String titular /*parametro do metodo*/) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
