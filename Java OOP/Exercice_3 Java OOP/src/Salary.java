/*
public class Exception {
	
	public static void main (String args[]){
		int Salary = 10 ; 
		try{
		if(Salary<= 0 ){
			throw new ArithmeticException();
	}
		}catch(ArithmeticException e){
			System.out.println("R U serious!");
		}

	}
}
*/
@SuppressWarnings("serial")
class SalaryException extends Exception {
		public SalaryException() {
			super("Salary not valid");
		}
}


public class Salary {
	public static void main (String args[]){
		int Salary = 0 ; 
		try{
		if(Salary<= 0 ){
			throw new SalaryException();
	}
		}catch(SalaryException e){
			System.out.println(e);
		}

	}
}