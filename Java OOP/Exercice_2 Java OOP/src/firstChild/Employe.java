package firstChild;

import parent.Doyen;

public class Employe extends Doyen {
	protected String matiere;
	public Employe(int id,String fname,String lname,float salaire,String matiere) {
		super(id,fname,lname,salaire);
		this.matiere=matiere;
	}
	public void getInfo() {
		System.out.println(
				"id : " + this.id + " " +
				"fname : " + this.fname + " " +
				"lname : " + this.lname + " " +
				"salaire : " + this.salaire + " " +
				"echelle : " + Doyen.echelle + " " +
				"matiere : " + this.matiere
				);
	}
}
