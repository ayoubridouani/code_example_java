public class Main {

	public static void main(String[] args) {
		Model m= new Model();
		Fenetre f = new Fenetre(m);
		new Connecteur(f,m);
	}

}
