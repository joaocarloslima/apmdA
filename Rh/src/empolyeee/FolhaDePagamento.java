package empolyeee;

public class FolhaDePagamento {
	
private double valorTotalDaFolhaDePagamento = 0;
	
	public double getValorTotalDaFolhaDePagamento() {
		return valorTotalDaFolhaDePagamento;
	}
	
	public void registrar(Empregado empregado) {
		valorTotalDaFolhaDePagamento += empregado.getSalarioBase();
	}
	
	public void logar(Autenticavel usuario) {
		if (usuario.autenticar("123")) {
			System.out.println("Acesso permitido para " + usuario);
		}else {
			System.out.println("Acesso negado para " + usuario);
		}
	}
	

}
