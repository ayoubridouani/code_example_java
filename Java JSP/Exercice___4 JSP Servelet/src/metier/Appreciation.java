package metier;

import java.util.Date;

public class Appreciation {
	private String nom;
	private String appreciation;
	private Date date = new Date();
	
	public Appreciation(String nom, String appreciation, Date date) {
		super();
		this.nom = nom;
		this.appreciation = appreciation;
		this.date = date;
	}
	
	public Appreciation() {
		super();
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getAppreciation() {
		return appreciation;
	}
	
	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}	
}
