package br.com.fiap.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.loja.model.Produto;

public class ProdutoDao {
	
	public void cadastrar(Produto produto) {
		// criar um gerente de entidades
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("loja");
		EntityManager manager = factory.createEntityManager();
		
		// iniciar a transacao
		manager.getTransaction().begin();
		
		// salvar o produto
		manager.persist(produto);
		
		// terminar a transacao
		manager.getTransaction().commit();
		manager.close();
		
	}

}
