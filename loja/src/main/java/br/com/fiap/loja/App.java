package br.com.fiap.loja;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.loja.controller.ButtonController;
import br.com.fiap.loja.controller.TableController;
import br.com.fiap.loja.dao.ProdutoDao;
import br.com.fiap.loja.model.Produto;
 
public class App extends JFrame {
	
	private DefaultTableModel tableModel;

	public static void main(String[] args) {
		
		new App().init();
		
//		Produto produto = new Produto();
//		produto.setNome("Notebook Dell");
//		produto.setDescricao("Inspirion i7 16G");
//		produto.setPreco(new BigDecimal(4000));
//		
//		ProdutoDao dao = new ProdutoDao();
//		dao.cadastrar(produto);
//		
//		List<Produto> lista = dao.listarTodos();
//		//lista.forEach(produto -> System.out.println(produto));
//		
//		List<Produto> busca = dao.buscarPorNome("Notebook Dell");
//		//busca.forEach(produto -> System.out.println(produto));
		
	}

	private void init() {
		
		Vector<String> colunas = new Vector<String>();
		colunas.add("id");
		colunas.add("nome");
		colunas.add("descricao");
		colunas.add("preco");
		tableModel = new DefaultTableModel(colunas , 0);
		JTable table = new JTable(tableModel);
		
		TableController tableController = new TableController(this);
		table.addMouseListener(tableController );
		table.setDefaultEditor(Object.class, null);
		
		carregarDados();
		
		add(new JScrollPane(table) );
		
		JButton atualizar = new JButton("atualizar");
		add(atualizar, BorderLayout.NORTH);
		ButtonController listener = new ButtonController(this);
		atualizar.addActionListener(listener );
		
		setTitle("Loja");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public void carregarDados() {
		tableModel.setRowCount(0);
		ProdutoDao dao = new ProdutoDao();
		List<Produto> lista = dao.listarTodos();
		lista.forEach(produto -> tableModel.addRow(produto.getData()));
	}

}
