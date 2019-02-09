import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InsererRequete {
	private JFrame frame;
	private JTextField requete;
	private JButton valide;
	private JPanel pane;
	public InsererRequete() {
		
		
		requete = new JTextField();
		requete.setBounds(10,10,200,20);
		
		valide = new JButton("valider");
		valide.setBounds(100,50,100,20);
		
		pane = new JPanel();
		pane.add(requete);
		pane.add(valide);
		
		pane.setBackground(Color.blue);
		
		frame = new JFrame();
		frame.setContentPane(pane);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
}
