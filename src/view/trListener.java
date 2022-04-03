package view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class trListener implements ActionListener  {
	
	private String art;
	private int wert;
	private String op;
	
	public trListener() {
		
	}
	
	public trListener(String art) {
		
		this.art = art;
	}
	
	public trListener(String art, int wert) {
		
		this.art = art;
		this.wert = wert;
	}
	
	public trListener(String art, String op) {
		
		this.art = art;
		this.op = op;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				
		if(this.art.equals("number")) {	
				
			this.insertNumber(e, Integer.toString(this.wert));
			
		}else if(this.art.equals("operator")) {
			
			this.setOperator(e, this.op);
	
		}else if(this.art.equals("clear")) {
			
			this.clearAll(e);
			
		}else if(this.art.equals("back")) {
			
			this.getBack(e);
			
		}else if(this.art.equals("comma") ) {
			
			this.insertComma(e);

		}else if(this.art.equals("=")) {
			
			this.startCalculate(e);
//			this.getPanelCenter(e).getModel().setErgebnisActive(true);
//			this.getPanelCenter(e).getModel().setOperatorUsed(false);
		}		
	}
	
	public panelNorth getAusgabePanel(ActionEvent e) {
		
		Object button = e.getSource();
		panelCenter panelC =  (panelCenter) ((Component) button).getParent();
		mainPanel panelM = (mainPanel) panelC.getParent();
		panelNorth panelN = (panelNorth) panelM.getComponent(0);
		return panelN;
	}
	
	public panelCenter getPanelCenter(ActionEvent e) {
		
		Object button = e.getSource();
		panelCenter panelC =  (panelCenter) ((Component) button).getParent();
		return panelC;
	}
	
	public void generateAusgabe(ActionEvent e) {
		
		this.getAusgabePanel(e).getAusgabe().setText(this.getPanelCenter(e).getModel().getAusgabe());
		
	}
	
	public void insertNumber(ActionEvent e, String wert) {
		
		if(this.getPanelCenter(e).getModel().isErgebnisActive() == false) {
		
			if(this.getPanelCenter(e).getModel().isOperatorUsed() == false) {
				
				this.getPanelCenter(e).getModel().setZahl1String(this.getPanelCenter(e).getModel().getZahl1String() + wert);
				this.insertAusgabeString(e, Integer.toString(this.wert));
				this.getPanelCenter(e).getModel().setZahl1used(true);
				this.getPanelCenter(e).getModel().setBackUsed(false);
				this.generateAusgabe(e);			
				
			}else if(this.getPanelCenter(e).getModel().isOperatorUsed() == true) {
				
				this.getPanelCenter(e).getModel().setZahl2String(this.getPanelCenter(e).getModel().getZahl2String() + wert);
				this.insertAusgabeString(e, Integer.toString(this.wert));
				this.getPanelCenter(e).getModel().setZahl2used(true);
				this.getPanelCenter(e).getModel().setBackUsed(false);
				this.generateAusgabe(e);
			}
		}
	}
	
	public void insertComma(ActionEvent e) {
		
		
		
		if(this.getPanelCenter(e).getModel().isOperatorUsed() == false && this.getPanelCenter(e).getModel().isComma1used() == false) {
			
			this.getPanelCenter(e).getModel().setZahl1String(this.getPanelCenter(e).getModel().getZahl1String() + ".");
			this.insertCommaAusgabe(e);
			this.generateAusgabe(e);
			this.getPanelCenter(e).getModel().setComma1used(true);
			
		}else if(this.getPanelCenter(e).getModel().isOperatorUsed() == true && this.getPanelCenter(e).getModel().isComma2used()== false) {
			
			this.getPanelCenter(e).getModel().setZahl2String(this.getPanelCenter(e).getModel().getZahl2String() + "."); 
			this.insertCommaAusgabe(e);
			this.generateAusgabe(e);
			this.getPanelCenter(e).getModel().setComma2used(true);	
		}
	}
	
	public void insertCommaAusgabe(ActionEvent e) {
		
		if(this.getPanelCenter(e).getModel().isErgebnisActive() == false) {
		
			if(this.getPanelCenter(e).getModel().isZahl1used() == false && this.getPanelCenter(e).getModel().isOperatorUsed() == false || this.getPanelCenter(e).getModel().isZahl2used() == false && this.getPanelCenter(e).getModel().isOperatorUsed() == true) {
			
			this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe() + "0,");
				
			}else {
				
			this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe() + ",");
			
			} 
		}
	}
	
	public void setOperator(ActionEvent e, String op) {
		
		this.getPanelCenter(e).getModel().setOperator(op);
		
		if(this.getPanelCenter(e).getModel().isErgebnisActive() == false) {
						
			this.getPanelCenter(e).getModel().setOperatorUsed(true);
			this.insertAusgabeString(e, "");
			this.generateAusgabe(e);
			
		}else {

			this.getPanelCenter(e).getModel().setZahl2String("");
			this.getPanelCenter(e).getModel().setAusgabe((Double.toString(this.getPanelCenter(e).getModel().getErgebnis()).split("\\.")[0] + "," + (Double.toString(this.getPanelCenter(e).getModel().getErgebnis())).split("\\.")[1]) + " " + op + " ");
			
			if((Double.toString(this.getPanelCenter(e).getModel().getErgebnis()).split("\\.")[1].equals("0"))){
				
				this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe().split("\\,")[0] + " " + op + " ");
				
			}
			
			this.getPanelCenter(e).getModel().setZahl1String(Double.toString(this.getPanelCenter(e).getModel().getErgebnis()));
			this.getPanelCenter(e).getModel().setOperatorUsed(true);
			this.getPanelCenter(e).getModel().setZahl1used(true);
			this.getPanelCenter(e).getModel().setZahl2used(false);
			this.getPanelCenter(e).getModel().setErgebnisActive(false);
			this.getPanelCenter(e).getModel().setComma2used(false);
			this.insertAusgabeString(e, "");
			this.generateAusgabe(e);

		}
	}
		
	public void insertAusgabeString(ActionEvent e, String wert) {
		
			if(this.getPanelCenter(e).getModel().isOperatorUsed() == false) {
				
				this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe() + wert);
		
			}else if(this.getPanelCenter(e).getModel().isOperatorUsed() == true && this.getPanelCenter(e).getModel().getFilter() == 0){
				
				this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe() + " " + this.getPanelCenter(e).getModel().getOperator() + " ");
				this.getPanelCenter(e).getModel().setFilter(this.getPanelCenter(e).getModel().getFilter() + 1);
				
				
			}if(this.getPanelCenter(e).getModel().isOperatorUsed() == true && this.getPanelCenter(e).getModel().getFilter()  != 0) {
				
				this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe() + wert);
				
			}
	}
	
	public void startCalculate(ActionEvent e) {
		
		if(!this.getPanelCenter(e).getModel().getZahl1String().equals("") && !this.getPanelCenter(e).getModel().getZahl2String().equals("") && this.getPanelCenter(e).getModel().isOperatorUsed() == true){

			this.getPanelCenter(e).getModel().setZahl1(Double.parseDouble(this.getPanelCenter(e).getModel().getZahl1String()));
			this.getPanelCenter(e).getModel().setZahl2(Double.parseDouble(this.getPanelCenter(e).getModel().getZahl2String()));
			
			if(this.getPanelCenter(e).getModel().getOperator().equals("/")) {
				
				this.calculate(e, this.getPanelCenter(e).getModel().getOperator());
				
			}else if(this.getPanelCenter(e).getModel().getOperator().equals("x")) {
				
				this.calculate(e, this.getPanelCenter(e).getModel().getOperator());
				
			}else if(this.getPanelCenter(e).getModel().getOperator().equals("-")) {
				
				this.calculate(e, this.getPanelCenter(e).getModel().getOperator());
				
			}else if(this.getPanelCenter(e).getModel().getOperator().equals("+")) {
				
				this.calculate(e, this.getPanelCenter(e).getModel().getOperator());
				
			}
			this.getPanelCenter(e).getModel().setErgebnisActive(true);
			this.getPanelCenter(e).getModel().setOperatorUsed(false);
			this.ergebnisAusgabe(e);
			this.generateAusgabe(e);
		}
	}
	
	public void calculate(ActionEvent e, String op) {
		
		if(op.equals("/")){
			
			this.getPanelCenter(e).getModel().setErgebnis(this.getPanelCenter(e).getModel().getZahl1() / this.getPanelCenter(e).getModel().getZahl2());
			
		}else if(op.equals("x")){
			
			this.getPanelCenter(e).getModel().setErgebnis(this.getPanelCenter(e).getModel().getZahl1() * this.getPanelCenter(e).getModel().getZahl2());
			
		}else if(op.equals("-")){
			
			this.getPanelCenter(e).getModel().setErgebnis(this.getPanelCenter(e).getModel().getZahl1() - this.getPanelCenter(e).getModel().getZahl2());
		
		}else if(op.equals("+")){
			
			this.getPanelCenter(e).getModel().setErgebnis(this.getPanelCenter(e).getModel().getZahl1() + this.getPanelCenter(e).getModel().getZahl2());
		}
	}
	
	public void ergebnisAusgabe(ActionEvent e) {

		this.getPanelCenter(e).getModel().setAusgabe("= " + (Double.toString(this.getPanelCenter(e).getModel().getErgebnis())).split("\\.")[0] + "," + (Double.toString(this.getPanelCenter(e).getModel().getErgebnis())).split("\\.")[1]);
		
		if(Double.toString(this.getPanelCenter(e).getModel().getErgebnis()).split("\\.")[1].equals("0")){
			
			this.getPanelCenter(e).getModel().setAusgabe("= " + (Double.toString(this.getPanelCenter(e).getModel().getErgebnis())).split("\\.")[0]);
		}
	}
	
	public void getBack(ActionEvent e) {
		
		if(this.getPanelCenter(e).getModel().isErgebnisActive() == false) {
		
			if(this.getPanelCenter(e).getModel().isZahl1used() == true && this.getPanelCenter(e).getModel().isOperatorUsed() == false && this.getPanelCenter(e).getModel().isBackUsed() == false) {
				
				this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe().substring(0, this.getPanelCenter(e).getModel().getAusgabe().length() - 1));			
				this.getPanelCenter(e).getModel().setZahl1String(this.getPanelCenter(e).getModel().getZahl1String().substring(0, this.getPanelCenter(e).getModel().getZahl1String().length() - 1));
				this.getPanelCenter(e).getModel().setBackUsed(true);
				this.generateAusgabe(e);
				
				
			}else if(this.getPanelCenter(e).getModel().isZahl1used() == true && this.getPanelCenter(e).getModel().isOperatorUsed() == true && this.getPanelCenter(e).getModel().isBackUsed() == false) {
				
				this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe().substring(0, this.getPanelCenter(e).getModel().getAusgabe().length() - 1));
				this.getPanelCenter(e).getModel().setZahl2String(this.getPanelCenter(e).getModel().getZahl2String().substring(0, this.getPanelCenter(e).getModel().getZahl2String().length() - 1));
				this.getPanelCenter(e).getModel().setBackUsed(true);
				this.generateAusgabe(e);
	
				
			}/*else if(this.getPanelCenter(e).getModel().isZahl1used() == true && this.getPanelCenter(e).getModel().isOperatorUsed() == true && this.getPanelCenter(e).getModel().isZahl2used() == false) {
				
				this.getPanelCenter(e).getModel().setAusgabe(this.getPanelCenter(e).getModel().getAusgabe().substring(0, this.getPanelCenter(e).getModel().getAusgabe().length() - 1));
				this.getPanelCenter(e).getModel().setOperator("");
				this.getPanelCenter(e).getModel().setOperatorUsed(false);
				
			}*/
		}		
	}
	
	public void clearAll(ActionEvent e) {
		
		this.getPanelCenter(e).getModel().setZahl1(0);
		this.getPanelCenter(e).getModel().setZahl2(0);
		this.getPanelCenter(e).getModel().setErgebnis(0);
		this.getPanelCenter(e).getModel().setErgebnisString("");
		this.getPanelCenter(e).getModel().setOperator("");
		this.getPanelCenter(e).getModel().setZahl1String("");
		this.getPanelCenter(e).getModel().setZahl2String("");
		this.getPanelCenter(e).getModel().setAusgabe("");
		this.getPanelCenter(e).getModel().setOperatorUsed(false);
		this.getPanelCenter(e).getModel().setComma1used(false);
		this.getPanelCenter(e).getModel().setComma2used(false);
		this.getPanelCenter(e).getModel().setZahl1used(false);
		this.getPanelCenter(e).getModel().setZahl2used(false);
		this.getPanelCenter(e).getModel().setBackUsed(false);
		this.getPanelCenter(e).getModel().setBackUsed(false);
		this.getPanelCenter(e).getModel().setErgebnisActive(false);
		this.getPanelCenter(e).getModel().setFilter(0);
		this.generateAusgabe(e);
		
	}
}
