package br.com.fiap.filmes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Fiap Filmes");
		
		JTabbedPane abas = new JTabbedPane();
		JPanel painelCadastro = new JPanel();
		JPanel painelLista = new JPanel();
		
		
		painelCadastro.setLayout(new BorderLayout());
		
		JLabel poster = new JLabel(new ImageIcon("src/halo.jpg"));
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(new GridLayout(8,1));
		
		painelCampos.add(new JLabel("Título"));
		JTextField txtTitulo = new JTextField();
		painelCampos.add(txtTitulo);
		
		ListenerTeclado listenerTeclado = new ListenerTeclado();
		txtTitulo.addKeyListener(listenerTeclado);
		
		painelCampos.add(new JLabel("Sinopse"));
		JTextArea txtSinopse = new JTextArea();
		painelCampos.add(txtSinopse);
		
		painelCampos.add(new JLabel("Genero"));
		String[] generos = {"Terror", "Comédia", "Ação", "Drama"};
		JComboBox<String> cmbGeneros = new JComboBox<String>(generos );
		painelCampos.add(cmbGeneros);
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.setLayout(new FlowLayout());
		
		JButton botaoSalvar = new JButton("Salvar");
		JButton botaoCancelar = new JButton("Cancelar");
		
		ListenerSalvar listenerSalvar= new ListenerSalvar();
		botaoSalvar.addActionListener(listenerSalvar);
		
		painelBotoes.add(botaoSalvar);
		painelBotoes.add(botaoCancelar);
		painelCampos.add(painelBotoes);
		
		JPanel painelDireita = new JPanel();
		painelDireita.setLayout(new GridLayout(7,1));
		
		painelDireita.add(new JLabel("Onde assistir"));
		
		ButtonGroup ondeAssistir = new ButtonGroup();
		
		JRadioButton radioNetflix = new JRadioButton("Netflix");
		JRadioButton radioPrime = new JRadioButton("Prime Video");
		JRadioButton radioPirate = new JRadioButton("Pirate Bay");
		
		ondeAssistir.add(radioNetflix);
		ondeAssistir.add(radioPrime);
		ondeAssistir.add(radioPirate);
		
		painelDireita.add(radioNetflix);
		painelDireita.add(radioPrime);
		painelDireita.add(radioPirate);
		
		painelDireita.add(new JLabel("Avaliação"));
		StarRater avaliacao = new StarRater(5);
		painelDireita.add(avaliacao);
		
		painelCadastro.add(poster, BorderLayout.WEST);
		painelCadastro.add(painelCampos, BorderLayout.CENTER);
		painelCadastro.add(painelDireita, BorderLayout.EAST);
		
		abas.add("Cadasto", painelCadastro);
		abas.add("Lista", painelLista);
		janela.add(abas);
		
		janela.setVisible(true);
		janela.setSize(600, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
