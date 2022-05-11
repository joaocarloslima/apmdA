package br.com.fiap.loja;

import java.util.List;

import br.com.fiap.loja.dao.ProdutoDao;
import br.com.fiap.loja.model.Produto;
 
public class App {
	
	public static void main(String[] args) {
		
//		Produto produto = new Produto();
//		produto.setNome("Notebook Dell");
//		produto.setDescricao("Inspirion i7 16G");
//		produto.setPreco(new BigDecimal(4000));
//		
		ProdutoDao dao = new ProdutoDao();
//		dao.cadastrar(produto);
		
		List<Produto> lista = dao.listarTodos();
		lista.forEach(produto -> System.out.println(produto));
		
		List<Produto> busca = dao.buscarPorNome("Notebook Dell");
		busca.forEach(produto -> System.out.println(produto));

		
	}

}
