package view;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Model;

public class panelCenter extends JPanel {
	
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
	
	JButton clear = new JButton("C");
	JButton back = new JButton("<--");
	
	JButton divide = new JButton("/");
	JButton multiply = new JButton("x");
	JButton minus = new JButton("-");
	JButton plus = new JButton("+");
	
	JButton calculate = new JButton("=");
	
	JButton comma = new JButton(",");
		
	Model model = new Model();
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	boolean test = false;
	
	public panelCenter() {
		
		Font myFont = new Font("Arial", Font.BOLD, 40);
		
		one.addActionListener(new trListener("number", 1));
		one.setFont(myFont);		 
		two.addActionListener(new trListener("number", 2));
		two.setFont(myFont);
		three.addActionListener(new trListener("number", 3));
		three.setFont(myFont);
		four.addActionListener(new trListener("number", 4));
		four.setFont(myFont);
		five.addActionListener(new trListener("number", 5));
		five.setFont(myFont);
		six.addActionListener(new trListener("number", 6));
		six.setFont(myFont);
		seven.addActionListener(new trListener("number", 7));
		seven.setFont(myFont);
		eight.addActionListener(new trListener("number", 8));
		eight.setFont(myFont);
		nine.addActionListener(new trListener("number", 9));
		nine.setFont(myFont);
		zero.addActionListener(new trListener("number", 0));
		zero.setFont(myFont);
		comma.addActionListener(new trListener("comma"));
		comma.setFont(myFont);
		
		divide.addActionListener(new trListener("operator", "/"));
		divide.setFont(myFont);
		multiply.addActionListener(new trListener("operator", "x"));
		multiply.setFont(myFont);
		minus.addActionListener(new trListener("operator", "-"));
		minus.setFont(myFont);
		plus.addActionListener(new trListener("operator", "+"));
		plus.setFont(myFont);
		
		calculate.addActionListener(new trListener("="));
		calculate.setFont(myFont);
		
		clear.addActionListener(new trListener("clear"));
		clear.setFont(myFont);
		back.addActionListener(new trListener("back"));
		back.setFont(myFont);
		
	
		
		this.setLayout(new GridLayout(5, 4));
		this.add(clear);
		this.add(back);
		this.add(new JLabel());
		this.add(divide);
		this.add(seven);
		this.add(eight);
		this.add(nine);
		this.add(multiply);
		this.add(four);
		this.add(five);
		this.add(six);
		this.add(minus);
		this.add(one);
		this.add(two);
		this.add(three);
		this.add(plus);
		this.add(zero);
		this.add(comma);
		this.add(new JLabel());
		this.add(calculate);
		
	}
	
}



