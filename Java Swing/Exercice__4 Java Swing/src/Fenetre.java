import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fenetre implements ActionListener,KeyListener{
	JFrame frame;
	JLabel Nom,Telephone,Adresse;
	JButton Button;
	JTextField TNom,TTelephone;
	JTextArea TAdresse;
	public Fenetre() {
		frame = new  JFrame("Exercice 2");
		
		Nom = new JLabel("Nom :");
		Nom.setBounds(0,0,100,30);
		TNom = new JTextField();
		TNom.setBounds(110,0,200,30);
		TNom.addKeyListener(this);
		
		Telephone = new JLabel("Telephone :");
		Telephone.setBounds(0,30,100,30);
		TTelephone = new JTextField();
		TTelephone.setBounds(110,30,200,30);
		
		Adresse = new JLabel("Adresse :");
		Adresse.setBounds(0,60,100,30);
		TAdresse = new JTextArea();
		TAdresse.setBounds(110,60,200,30);
		
		Button = new JButton("OK");
		Button.setBounds(0,90,100,30);
		Button.addActionListener(this);

		frame.add(Nom);frame.add(TNom);
		frame.add(Telephone);frame.add(TTelephone);
		frame.add(Adresse);frame.add(TAdresse);
		frame.add(Button);
		
		frame.setSize(310,160);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Button) {
			System.out.println("Nom : " +TNom.getText()+ " " +
					"Telephone : "+TTelephone.getText()+ " " +
					"Adresse : "+TAdresse.getText());
		}
		
	}
	
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyChar()=='z') {
			System.out.println("Tu as Clicker Sur ==> z");
		}
	}
	
	public void keyReleased(KeyEvent arg0) {
		
	}

	public void keyTyped(KeyEvent arg0) {
		
	}
}
