package banco;

public class Conta {
	
	//construtor padrão
	
	private String titular; //atributo da classe
	private int numero;
	private double saldo;
	private double juros;
	
	public Conta(String titular) { //sobrecarga de metodo
		this.titular = titular;
		this.juros = 1;
	}
	
	public Conta() {
		this.juros = 1;
	}
	
	public void setJuros(double juros) {
		if (juros >= 0) {
			this.juros = juros;
		}
	}
	
	public double getJuros() {
		return juros;
	}
	
	public void setTitular(String titular /*parametro do metodo*/) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}

}
