import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	private JFrame frame;
	private JPanel panel;
	private JTextField text;
	private JButton choice;
	private JButton send;
	File file;
	
	View(){
		frame = new JFrame("FTP");
		frame.setSize(550,130);
		
		panel = new JPanel();
		panel.setBounds(0,0,frame.getWidth(),frame.getHeight());
		panel.setLayout(null);
		
		text = new JTextField();
		text.setEnabled(false);
		text.setBounds(25,30,350,30);
		
		choice = new JButton();
		choice.setText("...");
		choice.setFont(new Font("arial",Font.BOLD,14));
		choice.setBounds(375,30,30,30);
		choice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame();
				frame1.setSize(500, 400);
				JFileChooser chooser = new JFileChooser();
				chooser.setBounds(0,50,500,400);
				frame1.add(chooser);
				
				int returnOption = chooser.showOpenDialog(null);
				if(returnOption == JFileChooser.APPROVE_OPTION) {
					file = chooser.getSelectedFile();
					text.setFont(new Font("arial",Font.BOLD,14));
					text.setDisabledTextColor(Color.green);
					text.setText(file.getAbsolutePath());
				}
			}
		});
		
		send = new JButton("Send");
		send.setBounds(425,30,90,30);
		
		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					InputStream stream = new FileInputStream(file);
					byte[] stre = stream.readAllBytes();
					new FTPServer(stre,file.getName());
					stream.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
			
		});
		
		panel.add(text);
		panel.add(choice);
		panel.add(send);
		
		frame.setContentPane(panel);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
