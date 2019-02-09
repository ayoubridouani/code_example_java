package calc;
import java.util.Scanner;

public class Calculatrice {

	public void add() {
		Scanner q = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = q.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = q.nextInt();
		System.out.println("Result : " + (num1+num2));
		q.close();
	}
	public void sub() {
		Scanner q = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = q.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = q.nextInt();
		System.out.println("Result : " + (num1-num2));
		q.close();
	}
	public void mul() {
		Scanner q = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = q.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = q.nextInt();
		System.out.println("Result : " + (num1*num2));
		q.close();
	}
	public void div() {
		Scanner q = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1 = q.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = q.nextInt();
		System.out.println("Result : " + ((float)num1/(float)num2));
		q.close();
	}
}
