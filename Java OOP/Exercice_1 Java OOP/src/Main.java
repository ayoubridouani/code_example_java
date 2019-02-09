import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Other o = new Other();
		System.out.println(o.a);
		/****************************************************/
		Scanner sc = new Scanner(System.in);
		System.out.print("enter name : ");
		String name = sc.next();
		System.out.print("enter force : ");
		String force = sc.next();
		System.out.print("enter id : ");
		int id = sc.nextInt();
		Cat cat = new Cat(name,force,id);
		cat.show(20);
		/****************************************************/
		Aggregation agg = new Aggregation(id,id);
		cat.aggregation(agg);
		sc.close();
	}

}
