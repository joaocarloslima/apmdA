package jogo;

public class Jogador {
	
	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	
	public Jogador() {
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
	}
	
	// sobrecarga de método
	public Jogador(String nome) {
		this.nome = nome;
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;
	}
	
	public void receberDano(int pontos) {
		//this.hp = this.hp - pontos;
		this.hp -= pontos;
	}
	
	public void receberCura(int pontos) {
		this.hp += pontos;
	}
	
	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
	}
	
	public void receberAntidoto() {
		
//		if (this.isEnvenenado()) envenenado = false;
//		else envenenado = true;
		
		//envenenado = isEnvenenado() ? false : true;
		
		envenenado = !envenenado;
		
	}
	
	public int getXp() {
		return this.xp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public boolean isEnvenenado() {
		return this.envenenado;
	}

}
