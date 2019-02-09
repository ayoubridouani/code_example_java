class Machin {
	public static int x=10;
  	public int y=2;
	Machin(){
		System.out.println("Constrcu");
	}
	public int f(){
    	return 5; 
  	}
	public static int g(){
    	return 6;
    }
}

class Bidul extends Machin {
  	public static int x=20;
	public int f(){
		return 2;
    }
	public static int g(){
		return 4;
    }
}


public class Main {
	public static void main(String[] args){
      Machin b=new Bidul();
      Machin m =b;
      System.out.println(m.f());
      System.out.println(b.f());
      Machin.x = 55;
      ++b.y;
      System.out.println(b.y);
      System.out.println(m.y);
      --m.y;
      System.out.println(b.y);
      System.out.println(m.y);
      System.out.println(Machin.x);
      System.out.println(Machin.g());
	}
}

















































/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Exercice 2 Exam 2017


class Model{
	private int value;
	public Model() {
		value=0;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int val) {
		value=val;
	}
}




class Temperature{
	
	private JTextField valueInput;
	private JComboBox<String> optionDegree;
	private JLabel valueOutput,etatdEau;
	private JButton valide;
	private JPanel pane;
	private JFrame frame;
	
	public Temperature(Model model) {
		
		Controller c = new Controller(this,model);
		
		valueInput = new JTextField(6);
		
		String [] options = {"Celsus","Fahrenheit"};
		optionDegree = new JComboBox<String>(options);
		
		valueOutput = new JLabel();
		
		etatdEau = new JLabel();
		
		valide = new JButton("Valider");
		valide.addActionListener(c);
		
		pane = new JPanel();
		pane.add(valueInput);pane.add(optionDegree);
		pane.add(valueOutput);pane.add(etatdEau);
		pane.add(valide);
		
		frame = new JFrame();
		frame.setContentPane(pane);
		frame.setSize(500,300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	public JButton getButtonValider() {
		return valide;
	}
	public JComboBox<String> getOptionDegree(){
		return optionDegree;
	}
	public String getValueInput() {
		return valueInput.getText();
	}
	public void setValueOutput(String val) {
		valueOutput.setText(val);
	}
	public int getValueOutput() {
		return Integer.parseInt(valueOutput.getText());
	}
	public void setEtatdEau(String val) {
		etatdEau.setText(val);
	}
	public void action1(Temperature temperature,Model model) {
		temperature.setValueOutput("" + (9/5 * model.getValue() + 32) + " Fahrenheit");
		if(getValueOutput()==0) setEtatdEau("Solide");
		if(getValueOutput()==100) setEtatdEau("gazeuse");
		else setEtatdEau("liquide");
	}
	public void action2(Temperature temperature,Model model) {
		temperature.setValueOutput("" + (model.getValue() - 32 * 5/9) + " Celsus");
		if(getValueOutput()==32) setEtatdEau("Solide");
		if(getValueOutput()==212) setEtatdEau("gazeuse");
		else setEtatdEau("liquide");
	}
}

class Controller implements ActionListener{
	private Temperature temperature;
	private Model model;
	public Controller(Temperature temperature,Model model) {
		this.temperature=temperature;
		this.model=model;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==temperature.getButtonValider()) {
			if((String)temperature.getOptionDegree().getSelectedItem()=="Celsus") {
				model.setValue(Integer.parseInt(temperature.getValueInput()));
				temperature.action1(temperature,model);
			}
			else {
				model.setValue(Integer.parseInt(temperature.getValueInput()));
				temperature.action2(temperature,model);
			}
		}
		
	}
	
	
	
	
}





public class Main {
	public static void main(String[] args) {
		new Temperature(new Model());
	}
}
*/
















































/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Olaya implements ActionListener{
	
	private JFrame frame;
	private JPanel pane;
	private JLabel label1,label2,label3,label4;
	private JRadioButton bt1,bt2,bt3,bt4;
	private ButtonGroup group;
	private JButton button;
	
	Olaya(){
		
		bt1 = new JRadioButton();
		bt2 = new JRadioButton();
		bt3 = new JRadioButton();
		bt4 = new JRadioButton();
		
		group = new ButtonGroup();
		group.add(bt1);group.add(bt2);group.add(bt3);group.add(bt4);
		
		label1 = new JLabel("olaya1");
		label2 = new JLabel("olaya2");
		label3 = new JLabel("olaya3");
		label4 = new JLabel("olaya4");
		
		button = new JButton("Click");
		button.addActionListener(this);
		
		pane = new JPanel();
		pane.add(bt1);pane.add(label1);
		pane.add(bt2);pane.add(label2);
		pane.add(bt3);pane.add(label3);
		pane.add(bt4);pane.add(label4);
		pane.add(button);
		
		frame = new JFrame();
		frame.setContentPane(pane);
		frame.setSize(500,400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if(bt1.isSelected())  System.out.println("bt1 selected !! and value : "+ label1.getText());
		if(bt2.isSelected())  System.out.println("bt2 selected !! and value : "+ label2.getText());
		if(bt3.isSelected())  System.out.println("bt3 selected !! and value : "+ label3.getText());
		if(bt4.isSelected())  System.out.println("bt4 selected !! and value : "+ label4.getText());
	}

	public static void main(String [] args) {
		new Olaya();
	}
}*/
