import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View extends JFrame{
	
	private JTextField text1,text2,text3;
	private JLabel label1,label2,label3,result;
	private JButton button,button0;
	private JPanel Pane;
	
	public String getText1() {
		return text1.getText();
	}
	public String getText2() {
		return text2.getText();
	}
	public String getText3() {
		return text3.getText();
	}
	
	public JButton getButton() {
		return button;
	}
	public JButton getButton0() {
		return button0;
	}
	
	public void setResult(String result) {
		this.result.setText(result);;
	}
	
	public View(Model M) {
		
		Controller c = new Controller(this,M);
		Pane = new JPanel();
		
		text1 = new JTextField("0",5);
		text2 = new JTextField("0",5);
		text3 = new JTextField("0",5);
		
		label1 = new JLabel("heurs");
		label2 = new JLabel("minutes");
		label3 = new JLabel("seconds");
		
		result = new JLabel("");
		
		button = new JButton("Temps");
		button.addActionListener(c);
		
		button0 = new JButton("OK");
		button0.addActionListener(c);
		
		Pane.add(text1);Pane.add(label1);
		Pane.add(text2);Pane.add(label2);
		Pane.add(text3);Pane.add(label3);
		Pane.add(button);Pane.add(result);
		Pane.add(button0);
		setContentPane(Pane);
		
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
