import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Fenetre extends JFrame{
	private JTextField value1,value2,result;
	private JLabel label1,label2,label3;
	private JButton button;
	public Fenetre(Model m) {
		super();
		
		label1 = new JLabel("Value 1");
		label1.setBounds(10,20,60,30);
		
		value1 = new JTextField();
		value1.setBounds(75,20,85,30);
		
		label2 = new JLabel("Value 2");
		label2.setBounds(10,50,60,30);
		
		value2 = new JTextField();
		value2.setBounds(75,50,85,30);
		
		label3 = new JLabel("Result :");
		label3.setBounds(10,80,60,30);
		
		result = new JTextField();
		result.setBounds(75,80,85,30);
		
		button = new JButton("Calculer");
		button.setBounds(10,110,150,40);
		
		Connecteur c = new Connecteur(this,m);
		button.addActionListener(c);
		
		add(label1);add(value1);
		add(label2);add(value2);
		add(label3);add(result);
		add(button);
		setLayout(null);
		setSize(180,190);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public String getValue1() {
		return value1.getText();
	}
	public String getValue2() {
		return value2.getText();
	}
	public void setResult(String rsult) {
		result.setText(rsult);
	}
	public JButton getButton() {
		return button;
	}
}
