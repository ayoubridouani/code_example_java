import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private Fenetre fenetre;
	public Controller(Fenetre fenetre) {
		this.fenetre=fenetre;
	}

	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==fenetre.getMenuItemSaisirRequete()) {
			new InsererRequete();
		}
		
	}
}
