package müll;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelCenterCenter extends JPanel {

	public panelCenterCenter() {
		
		this.setLayout(new BorderLayout());
		this.add(new JButton("7"), BorderLayout.CENTER);
		this.add(new JButton("8"), BorderLayout.CENTER);
		this.add(new JButton("9"), BorderLayout.CENTER);
		this.add(new JButton("4"), BorderLayout.CENTER);
		this.add(new JButton("5"), BorderLayout.CENTER);
		this.add(new JButton("6"), BorderLayout.CENTER);
		this.add(new JButton("1"), BorderLayout.CENTER);
		this.add(new JButton("2"), BorderLayout.CENTER);
		this.add(new JButton("3"), BorderLayout.CENTER);
	}
}
