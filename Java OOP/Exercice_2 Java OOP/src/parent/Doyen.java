package parent;

public class Doyen {
	protected int id;
	protected String fname;
	protected String lname;
	protected float salaire;
	protected static int echelle=0;
	public Doyen(int id,String fname,String lname,float salaire) {
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		this.salaire=salaire;
	}
	public void getInfo() {
		System.out.println(
				"id : " + this.id + " " +
				"fname : " + this.fname + " " +
				"lname : " + this.lname + " " +
				"salaire : " + this.salaire + " " +
				"echelle : " + Doyen.echelle
				);
	}
	
	
}
