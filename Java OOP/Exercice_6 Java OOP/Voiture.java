
public class Voiture {
	private String nom;
	private String couleur;
	private String marque;
	private int nbrc;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getNbrc() {
		return nbrc;
	}
	public void setNbrc(int nbrc) {
		this.nbrc = nbrc;
	}
	public Voiture(String nom, String couleur, String marque, int nbrc) {
		this.nom = nom;
		this.couleur = couleur;
		this.marque = marque;
		this.nbrc = nbrc;
	}
}
