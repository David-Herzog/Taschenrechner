package view;
import java.awt.BorderLayout;

import javax.swing.JPanel;

public class mainPanel extends JPanel {
	
	public mainPanel() {
		
		this.setLayout(new BorderLayout());
		this.add(new panelNorth(), BorderLayout.NORTH);
		this.add(new panelCenter(), BorderLayout.CENTER);
		this.add(new panelEast(), BorderLayout.EAST);
		this.add(new panelWest(), BorderLayout.WEST);
		this.add(new panelSouth(), BorderLayout.SOUTH);
		this.setVisible(true);
	}

}
