package br.com.fiap.loja;

import java.math.BigDecimal;

import br.com.fiap.loja.dao.ProdutoDao;
import br.com.fiap.loja.model.Produto;
 
public class App {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setNome("Notebook Dell");
		produto.setDescricao("Inspirion i7 16G");
		produto.setPreco(new BigDecimal(4000));
		
		ProdutoDao dao = new ProdutoDao();
		dao.cadastrar(produto);
		
		
	}

}
