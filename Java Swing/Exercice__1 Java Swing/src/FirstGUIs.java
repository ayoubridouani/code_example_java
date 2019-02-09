
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class FirstGUIs {
	JFrame jf;
	FirstGUIs(){
		jf = new JFrame();
		JButton jb = new JButton("Click");
		JRadioButton jrb1 = new JRadioButton("Male");
		JRadioButton jrb2 = new JRadioButton("Female");
		ButtonGroup jgb = new ButtonGroup();
		
		jb.setBounds(100, 200, 100, 50);
		
		jrb1.setBounds(100, 250, 100, 30);
		jrb2.setBounds(100, 270, 100, 30);
		
		jgb.add(jrb1);
		jgb.add(jrb2);
		
		jf.setSize(750,750);
		jf.setVisible(true);
		jf.setLayout(null);
		jf.add(jb);
		jf.add(jrb1);
		jf.add(jrb2);
	}
}
