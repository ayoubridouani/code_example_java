import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View1 extends JFrame{
	
	private JTextField text1,text2,text3;
	private JLabel label1,label2,label3,result1,result2;
	private JButton button1,button2,button3;
	private JPanel Pane;
	
	public void setResult2(String result2) {
		this.result2.setText(result2);
	}
	
	public String getText1() {
		return text1.getText();
	}
	public String getText2() {
		return text2.getText();
	}
	public String getText3() {
		return text3.getText();
	}
	
	public JButton getButton1() {
		return button1;
	}
	public JButton getButton2() {
		return button2;
	}
	public JButton getButton3() {
		return button3;
	}
	
	public View1(Model1 m) {
		
		Controller c = new Controller(this,m);
		Pane = new JPanel();
		
		text1 = new JTextField("0");
		text1.setBounds(100,0,100,30);
		text2 = new JTextField("0");
		text2.setBounds(100,100,100,30);
		text3 = new JTextField("0");
		text3.setBounds(100,200,100,30);
		
		label1 = new JLabel("heurs");
		label1.setBounds(0,0,100,30);
		label2 = new JLabel("minutes");
		label2.setBounds(0,100,100,30);
		label3 = new JLabel("seconds");
		label3.setBounds(0,200,100,30);
		
		result1 = new JLabel("Temps");
		result1.setBounds(300,0,100,30);
		result2 = new JLabel("");
		result2.setBounds(300,100,100,30);
		
		button1 = new JButton("UTC");
		button1.setBounds(200,0,100,30);
		button2= new JButton("NewYork");
		button2.setBounds(200,100,100,30);
		button3 = new JButton("Dubai");
		button3.setBounds(200,200,100,30);
		
		button1.addActionListener(c);
		button2.addActionListener(c);
		button3.addActionListener(c);
		
		Pane.add(text1);Pane.add(label1);
		Pane.add(text2);Pane.add(label2);
		Pane.add(text3);Pane.add(label3);
		Pane.add(button1);Pane.add(result1);
		Pane.add(button2);Pane.add(result2);
		Pane.add(button3);
		setContentPane(Pane);
		
		setLayout(null);
		setVisible(true);
		setSize(700,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
