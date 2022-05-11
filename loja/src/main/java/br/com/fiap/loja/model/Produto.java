package br.com.fiap.loja.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//POJO
//BO
@Entity @Table(name = "apmd_produtos")
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loja")
	@SequenceGenerator(name = "loja", allocationSize = 1, sequenceName = "loja")
	private Long codigo;
	
	private String nome;
	
	@Column(name = "descricao_do_produto")
	private String descricao;
	
	private BigDecimal preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Nome = " + nome + 
				" Preco = " + preco + 
				" Descricao = " + descricao;
	}

}
