package br.com.fiap.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.loja.model.Produto;

public class ProdutoDao {

	// criar um gerente de entidades
	EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("loja");
	EntityManager manager = factory.createEntityManager();
	
	public void cadastrar(Produto produto) {
		// iniciar a transacao
		manager.getTransaction().begin();
		
		// salvar o produto
		manager.persist(produto);
		
		// terminar a transacao
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	
	public List<Produto> listarTodos() {

		return manager
			.createQuery("SELECT p FROM Produto p", Produto.class)
			.getResultList();
		
		
	}
	
	public List<Produto> buscarPorNome(String nome){
		
		 return manager
			.createQuery("SELECT p FROM Produto p WHERE nome=:nome", Produto.class)
			.setParameter("nome", nome)
			.getResultList();
	
	}


	public void apagar(Long id) {
		Produto produto = manager.find(Produto.class, id);
		
		manager.getTransaction().begin();
		manager.remove(produto);
		manager.getTransaction().commit();
	}
	
	public void atualizar(Produto produto) {
		manager.getTransaction().begin();
		manager.merge(produto);
		manager.getTransaction().commit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
