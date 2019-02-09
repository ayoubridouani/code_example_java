import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

class Etudiant {

	private String nom,prenom;
	private int age;
	private float moyenne;
	
	public Etudiant(String nom, String prenom, int age, float moyenne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.moyenne = moyenne;
	}
	
	@Override
	public String toString() {
		return nom + " " + prenom + " " + age + " " + moyenne;
	}
	
	public String getNom() {
		return nom;
	}
}

public class ListEtudiants{
	private LinkedList<Etudiant> etudiants;
	private Hashtable<String, Etudiant> enseignants;
	
	public ListEtudiants() {
		super();
		this.etudiants = new LinkedList<>();
		this.enseignants = new Hashtable<String, Etudiant>();
	}
	
	public void ajouter(Etudiant e) {
		etudiants.add(e);
		enseignants.put(e.getNom(), e);
	}
	
	public void lister() {
		//linkedlist
		for(Etudiant e : etudiants) {
			System.out.println(e.toString());
		}
		
		System.out.println("----------------------------");
		
		//hashtable
		Enumeration<Etudiant> e = enseignants.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

	public static void main(String[] args) {
		ListEtudiants etud = new ListEtudiants();
		etud.ajouter(new Etudiant("ayoub","ridouani",22,19));
		etud.ajouter(new Etudiant("ayoub2","ridouani",22,19));
		etud.ajouter(new Etudiant("ayoub3","ridouani",22,19));
		etud.lister();
	}

}
