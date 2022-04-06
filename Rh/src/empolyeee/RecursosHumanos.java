package empolyeee;

public class RecursosHumanos {
	
	public static void main(String[] args) {
		Empregado empregado = new Gerente();
		empregado.setCodigo(23001);
		empregado.getSalarioBase();
		System.out.println(empregado.getCodigo());
		
		
		Gerente gerente = new Gerente();
		gerente.setCodigo(23003);
		gerente.setNome("Fabiana Souza");

	
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

		
		System.out.println(folhaDePagamento.getValorTotalDaFolhaDePagamento());
		
	}

}
