
public class Employe extends Person{
	private int nyw;
	public Employe(String name, int age, int nyw) {
		super(name,age);
		this.nyw=nyw;
	}
	public int getNyw() {
		return nyw;
	}

	public String toString() {
		return super.toString() + " ,is an Employe who has " + getNyw() + " years of experience ";
	}
}
