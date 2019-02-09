import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private Model m;
	private View v;
	private Model1 m1;
	private View1 v1;
	public Controller(View v,Model m) {
		this.m=m;
		this.v=v;
	}
	public Controller(View1 v2,Model1 m2) {
		this.m1=m2;
		this.v1=v2;
	}
	public void actionPerformed(ActionEvent e){
		if(v != null && m != null) {
			if(e.getSource()==v.getButton() ) {
				m.setHeur(v.getText1());
				m.setMin(v.getText2());
				m.setSec(v.getText3());
				v.setResult(m.calc());
			}
			if(e.getSource()==v.getButton0()) {
				m1 = new Model1();
				v1 = new View1(m1);
			}
		}
		if(v1 != null && m1 != null) {
			if(e.getSource()==v1.getButton1()) {
				
				m1.setHeur(v1.getText1());
				m1.setMin(v1.getText2());
				m1.setSec(v1.getText3());
				v1.setResult2(m1.calc1());
			}
			if(e.getSource()==v1.getButton2()) {
				m1.setHeur(v1.getText1());
				m1.setMin(v1.getText2());
				m1.setSec(v1.getText3());
				v1.setResult2(m1.calc2());
			}
			if(e.getSource()==v1.getButton3()) {
				m1.setHeur(v1.getText1());
				m1.setMin(v1.getText2());
				m1.setSec(v1.getText3());
				v1.setResult2(m1.calc3());
			}
		}
	}
}
