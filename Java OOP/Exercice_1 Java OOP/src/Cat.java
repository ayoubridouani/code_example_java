
public class Cat extends Animal{
	public int id;
	public Cat(String name, String force,int id) {
		super(name, force);
		this.name=name;
		this.force=force;
		this.id=id;
		System.out.println("Constructor for Sub Class");
	}
	public void show() {
		System.out.println("id : " + id + " name : " + name + " force : " + force);
	}
	
	public void show(int x) {
		int sec=50;
		System.out.println("overload");
		System.out.println("id : " + id + " name : " + name + " force : " + force);
		System.out.println(sec);
		System.out.println(this.sec);
		System.out.println(super.sec);
	}
	public void aggregation(Aggregation agg) {
		System.out.println(agg.getX());
	}
}

class Aggregation{
	private int x;
	private int y;
	public Aggregation(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
}