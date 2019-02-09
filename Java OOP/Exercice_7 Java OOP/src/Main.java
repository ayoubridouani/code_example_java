import java.util.Scanner;

import calc.Calculatrice;

public class Main {

	public static void main(String[] args) {
		System.out.println("1-ADD");
		System.out.println("2-SUB");
		System.out.println("3-MUL");
		System.out.println("4-DIV");
		System.out.println("------------------------");
		System.out.print("Choose Your Operator : ");

		Scanner sc = new Scanner(System.in);
		int operator = sc.nextInt();
		
		Calculatrice calc = new Calculatrice();
		
		switch(operator) {
		case 1 : 
			System.out.println("Add ....");
			calc.add();
			break;
		case 2 : 
			System.out.println("Sub ....");
			calc.sub();
			break;
		case 3 : 
			System.out.println("Mul ....");
			calc.mul();
			break;
		case 4 : 
			System.out.println("Div ....");
			calc.div();
			break;
		default :
			System.out.println("Choose a right Number");
			break;
		}
		sc.close();
	}
}
