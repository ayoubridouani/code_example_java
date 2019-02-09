import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Fenetre {
	private JFrame frame;
	private JPanel pane;
	public JMenuItem getMenuItemSaisirRequete() {
		return menuItemSaisirRequete;
	}
	private JMenu menuMiseAJour;
	private JMenu menuInterrogation;
	private JMenuItem menuItemAjouter;
	private JMenuItem menuItemModifier;
	private JMenuItem menuItemSupprimer;
	private JMenuItem  menuItemSaisirRequete;
	private JMenuBar menuBar;
	private JTable table;
	private JScrollPane scrollPane;
	public Fenetre() {
		
		Controller controller = new Controller(this);
		
		menuItemAjouter = new JMenuItem("Ajouter");
		menuItemModifier = new JMenuItem("Modifier");
		menuItemSupprimer = new JMenuItem("Supprimer");
		
		menuItemSaisirRequete = new JMenuItem("Saisir une requete");
		menuItemSaisirRequete.addActionListener(controller);
		
		menuMiseAJour = new JMenu("Mise A Jour");
		menuInterrogation = new JMenu("Interrogation");
		
		menuMiseAJour.add(menuItemAjouter);
		menuMiseAJour.add(menuItemModifier);
		menuMiseAJour.add(menuItemSupprimer);
		
		menuInterrogation.add(menuItemSaisirRequete);
		
		menuBar = new JMenuBar();
		menuBar.add(menuMiseAJour);
		menuBar.add(menuInterrogation);
		menuBar.setBounds(0,0,600,30);
		
		ConnectionDB cnDB = new ConnectionDB();
		
		String titre[] = {"IdEmploye","Nom","Prenom","Anne"};
		String data[][] = cnDB.getData();
		
		table = new JTable(data,titre);
		table.setEnabled(false);

		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0,50,600,250);
		
		pane = new JPanel();
		pane.add(menuBar);
		pane.add(scrollPane);
		pane.setLayout(null);
		pane.setBounds(0,0,600,300);
		
		frame = new JFrame();
		frame.setContentPane(pane);
		frame.setLayout(null);
		frame.setSize(600,300);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
