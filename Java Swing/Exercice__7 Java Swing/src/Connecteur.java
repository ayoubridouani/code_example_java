import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Connecteur implements ActionListener{
	private Fenetre f;
	private Model m;
	public Connecteur(Fenetre f,Model m) {
		this.f=f;
		this.m=m;
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==f.getButton()) {
			f.setResult(m.calc(f.getValue1(),f.getValue2()));
		}
		
	}
}
