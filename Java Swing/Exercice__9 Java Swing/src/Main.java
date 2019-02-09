import java.util.Random;

/*
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
*/
/*abstract class parent{
	protected int p_x;//only public|static|final|protected cannot use a private
	protected abstract void show();//only public|static|final|protected cannot use a private
}

interface parent1{
	public int test=10;//only public|static|final cannot use a private or protected
	public abstract void show();//only public|static|final cannot use a private or protected
}

interface parent2{
	public int test=12;
	public void show();
}

class child extends parent implements parent1,parent2{
	public void show() {
		this.p_x=10;
		System.out.println(p_x+parent2.test);
	}
}*/

/*
class TestException extends Exception{
	public TestException(String msg) {
		super(msg);
	}
}
*/
public class Main{
	public static void main(String args[]){
		
		Random r = new Random();
		System.out.println(r.nextInt(2)+1);
		
		/*
		JTextArea area = new JTextArea();	
		JScrollPane bar = new JScrollPane(area);
		
		JTextField source = new JTextField() ;
		JPasswordField traduction = new JPasswordField() ;
		JSplitPane panneau=new JSplitPane( JSplitPane.HORIZONTAL_SPLIT, source,traduction) ;
		
		String data[]= {"orange","blue","vert"};
		JList<String> list = new JList<String>(data);
		
		String data1[]= {"orange","blue","vert"};
		JComboBox<String> combo = new JComboBox<String>(data1);
		
		ImageIcon image = new ImageIcon("/home/anonsurf/Pictures/1.png");
		JButton button = new JButton(image);
		
		JTabbedPane tabedpane = new JTabbedPane();
		tabedpane.addTab("test", panneau);
		tabedpane.setBackground(null);
		tabedpane.setForeground(null);
		
		JFrame frame = new JFrame();
		
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog( frame);
		if (fc.showOpenDialog( frame )== JFileChooser. APPROVE_OPTION){
		System.out.println("Le fichier est:"+fc.getSelectedFile());}
		
		//frame.add(tabedpane);
		frame.setSize(500,300);
		frame.setTitle("TEST");
		//frame.setLocation(100,500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(null);
		frame.setVisible(true);
		*/
		
		/*
		JOptionPane.showMessageDialog(null, "hi");
		JOptionPane.showMessageDialog(null, "hi","Error",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "hi","Error",JOptionPane.CLOSED_OPTION);
		JOptionPane.showMessageDialog(null, "hi","Error",JOptionPane.CANCEL_OPTION);
		JOptionPane.showMessageDialog(null, "hi","Error",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "hi","Error",JOptionPane.OK_OPTION);
		JOptionPane.showMessageDialog(null, "hi","Error",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showConfirmDialog(null,"hi");
		int reponse1 = JOptionPane.showConfirmDialog(null,"hi","Error", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(reponse1); //0 = yes | 1 = no | 2 = cancel
		String reponse2 = JOptionPane.showInputDialog("hi");
		System.out.println(reponse2);
		*/
	//	int x=10;
	//	int y=0;
	//	Integer z=null;
		
		/*
		//try-catch-finally with multi Exception
		try {
			System.out.println(x/y);
			System.out.println(x/z);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}finally(){
			System.out.println("Done !!);
			}
		*/
		
		
		/*
		 //throws-throw
		 if(y == 0) throw new NullPointerException("Error !!");
		*/
		
		
		/*
		//try-catch-finally with our Exception
		 
		try {
			if(x == 10) throw new TestException("Error !!");
		}catch(TestException e) {
			e.printStackTrace();
		}finally(){
			System.out.println("Done !!);
			}
		*/
		//Remember use throws or try-catch-finally
	}
}
