import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class TestFrame implements ActionListener{
	JFrame frame;
	JRadioButton rb1;
	JRadioButton rb2;
	JRadioButton rb3;
	JButton button;
	JTextArea text;
	public TestFrame(){
		
		frame = new JFrame("Operating Systems");
		
		
		rb1 = new JRadioButton("Linux");
		rb1.setBounds(100,100,180,80);
		//rb1.doClick();
		
		rb2 = new JRadioButton("Windows");
		rb2.setBounds(100,150,180,80);
		rb2.doClick();
		
		rb3 = new JRadioButton("Mac");
		rb3.setBounds(100,200,180,80);
		
		//ButtonGroup
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rb1);
		bgroup.add(rb2);
		bgroup.add(rb3);
		
		button = new JButton("Submit");
		button.setBounds(100,300,180,80);
		button.addActionListener(this);
		
		text = new JTextArea("Write in First Line",50,80);
		text.setBounds(100,400,180,100);
		text.setBackground(Color.blue);
		text.setForeground(Color.cyan);
		
		//Font
		Font font = new Font("arial",Font.BOLD,18);
		text.setFont(font);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.add(rb3);
		frame.add(button);
		frame.add(text);
		frame.setSize(400,800);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent ae) {
		if(rb1.isSelected()) {
			JOptionPane.showMessageDialog(button, "You select Linux");
		}
		if(rb2.isSelected()) {
			JOptionPane.showMessageDialog(button, "You select Windows");
		}
		if(rb3.isSelected()) {
			JOptionPane.showMessageDialog(button, "You select Mac");
		}
	}
	
}
