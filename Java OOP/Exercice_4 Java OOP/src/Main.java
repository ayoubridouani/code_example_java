class parent{
	int x;
	int y;
	public int test(int xo,int yo) {
		int xo1=xo;
		int yo2=yo;
		int co = xo1+yo2;
		return co;
	}
}
class child extends parent{
	child(){
		System.out.println(test(10,20));
	}
	public void t() {
		System.out.println(test(50,40));
	}
	//test(50,20);
	
}
public class Main {

	public static void main(String[] args) {
		new child().t();
	}
}
