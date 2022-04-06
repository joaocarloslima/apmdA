import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class App {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		MeuRotulo label = new MeuRotulo("Meu rótulo");
		
		JTextField textField = new JTextField(20);
		textField.setForeground(Color.GRAY);
		textField.setBorder(BorderFactory.criar());
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(20);
		textArea.setRows(6);
		textArea.setForeground(Color.GRAY);
		textArea.setBorder(BorderFactory.criar());
		
		frame.add(label);
		frame.add(textField);
		frame.add(textArea);
		
		
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Interfaces Gráficas");
		
	}
}
