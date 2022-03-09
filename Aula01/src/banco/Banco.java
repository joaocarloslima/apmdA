package banco;

public class Banco {
	
	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		new ContaPoupanca();
		
		conta1.setSaldo(1000);
		System.out.println("Saldo da conta corrente = " + conta1.getSaldo());
		
		ContaVip conta2 = new ContaVip();
		
		conta2.setSaldo(1000);
		conta2.setLimite(5000);
		System.out.println("Saldo da conta vip = " + conta2.getSaldo());
		
		Conta.selic();
		
	
	}

}
