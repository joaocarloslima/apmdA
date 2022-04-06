import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MeuRotulo extends JLabel {
	
	public MeuRotulo() {
		this.setForeground(new Color(255, 0, 150));
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font(null, Font.BOLD, 20));
	}
	
	public MeuRotulo(String text) {
		this.setText(text);
		this.setForeground(new Color(255, 0, 150));
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font(null, Font.BOLD, 20));
	}

}
