package model;



public class Model {
	
	private double zahl1;
	private double zahl2;
	private double ergebnis;
	private String ergebnisString;
	private String operator;	
	private String zahl1String = "";
	private String zahl2String = "";
	private String zahl1StringNeu = "";
	private String zahl2StringNeu = "";
	private String ausgabe = "";
	private boolean operatorUsed = false;
	private boolean comma1used = false;
	private boolean comma2used = false;
	private int filter = 0;
	private boolean zahl1used = false;
	private boolean zahl2used = false;
	private boolean backUsed = false;
	private boolean ergebnisActive = false;

	
	
	
	public boolean isErgebnisActive() {
		return ergebnisActive;
	}
	public void setErgebnisActive(boolean ergebnisActive) {
		this.ergebnisActive = ergebnisActive;
	}
	public boolean isBackUsed() {
		return backUsed;
	}
	public void setBackUsed(boolean backUsed) {
		this.backUsed = backUsed;
	}
	public boolean isZahl1used() {
		return zahl1used;
	}
	public void setZahl1used(boolean zahl1used) {
		this.zahl1used = zahl1used;
	}
	public boolean isZahl2used() {
		return zahl2used;
	}
	public void setZahl2used(boolean zahl2used) {
		this.zahl2used = zahl2used;
	}
	public int getFilter() {
		return filter;
	}
	public void setFilter(int filter) {
		this.filter = filter;
	}
	public boolean isComma1used() {
		return comma1used;
	}
	public void setComma1used(boolean comma1used) {
		this.comma1used = comma1used;
	}
	public boolean isComma2used() {
		return comma2used;
	}
	public void setComma2used(boolean comma2used) {
		this.comma2used = comma2used;
	}
	public boolean isOperatorUsed() {
		return operatorUsed;
	}
	public void setOperatorUsed(boolean operatorUsed) {
		this.operatorUsed = operatorUsed;
	}
	public double getErgebnis() {
		return ergebnis;
	}
	public void setErgebnis(double ergebnis) {
		this.ergebnis = ergebnis;
	}
	public String getErgebnisString() {
		return ergebnisString;
	}
	public void setErgebnisString(String ergebniString) {
		this.ergebnisString = ergebniString;
	}
	public String getAusgabe() {
		return ausgabe;
	}
	public void setAusgabe(String ausgabe) {
		this.ausgabe = ausgabe;
	}
	public String getZahl1StringNeu() {
		return zahl1StringNeu;
	}
	public void setZahl1StringNeu(String zahl1StringNeu) {
		this.zahl1StringNeu = zahl1StringNeu;
	}
	public String getZahl2StringNeu() {
		return zahl2StringNeu;
	}
	public void setZahl2StringNeu(String zahl2StringNeu) {
		this.zahl2StringNeu = zahl2StringNeu;
	}
	public String getZahl1String() {
		return zahl1String;
	}
	public void setZahl1String(String zahl1String) {
		this.zahl1String = zahl1String;
	}
	public String getZahl2String() {
		return zahl2String;
	}
	public void setZahl2String(String zahl2String) {
		this.zahl2String = zahl2String;
	}
	public double getZahl1() {
		return zahl1;
	}
	public void setZahl1(double zahl1) {
		this.zahl1 = zahl1;
	}
	public double getZahl2() {
		return zahl2;
	}
	public void setZahl2(double zahl2) {
		this.zahl2 = zahl2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public Model() {
	

	
	}

}
