package secondChild;

import firstChild.Employe;
import parent.Doyen;

public class Student extends Employe {
	protected int id_etu;
	public static int t=10;
	public Student(int id,String fname,String lname,float salaire,String matiere,int id_etu) {
		super(id,fname,lname,salaire,matiere);
		this.id_etu=id_etu;
	}
	public void getInfo() {
		System.out.println(
				"id : " + this.id + " " +
				"fname : " + this.fname + " " +
				"lname : " + this.lname + " " +
				"salaire : " + this.salaire + " " +
				"echelle : " + Doyen.echelle + " " +
				"matiere : " + this.matiere + " " +
				"id etudiant : " + this.id_etu
				);
	}
	public static void st() {
		System.out.println("static");
	}
}
