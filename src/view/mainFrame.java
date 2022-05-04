package view;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class mainFrame extends JFrame{
	
	public mainFrame() {
		
		this.setSize(600, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Taschenrechner");
		ImageIcon img = new ImageIcon("src/img/png.png");
		this.setIconImage(img.getImage());
		this.setMinimumSize(new Dimension(400,400));
		this.add(new mainPanel());
		this.setVisible(true);
	}
}
