package müll;
import javax.swing.JButton;

public class tsButton extends JButton{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public tsButton(String type, String zeichen) {
		
		this.setName(zeichen);
		this.type = type;
		
	}

	
}
