package jogo;

public class Jogo {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
 
		System.out.println("XP = " + jogador1.getXp());
		System.out.println("HP = " + jogador1.getHp());
		
		if( jogador1.isEnvenenado() ) 
			System.out.println("Est� envenenado");
		else 
			System.out.println("N�o est� envenenado");
		
		jogador1.receberDano(10);
		System.out.println("HP = " + jogador1.getHp());

		jogador1.receberCura(50);
		System.out.println("HP = " + jogador1.getHp());
		
		jogador1.receberAntidoto();
		if( jogador1.isEnvenenado() ) 
			System.out.println("Est� envenenado");
		else 
			System.out.println("N�o est� envenenado");
		
		jogador1.receberAntidoto();
		if( jogador1.isEnvenenado() ) 
			System.out.println("Est� envenenado");
		else 
			System.out.println("N�o est� envenenado");
		
	}
	
}
