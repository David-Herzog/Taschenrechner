package view;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class panelNorth extends JPanel {
	
	JTextField ausgabe = new JTextField();
	
	public JTextField getAusgabe() {
		return ausgabe;
	}

	public void setAusgabe(JTextField ausgabe) {
		this.ausgabe = ausgabe;
	}

	public panelNorth() {
		this.setPreferredSize(new Dimension(30,100));
		this.setLayout(new GridLayout(1,1));
		ausgabe.setEditable(false);
		ausgabe.setHorizontalAlignment(JTextField.RIGHT);
		ausgabe.setFont(new Font(ausgabe.getFont().getFontName(), ausgabe.getFont().getStyle(), 70));
		this.add(ausgabe);
	}

}
