import firstChild.Employe;
import parent.Doyen;
import secondChild.Student;

public class Main {
	public static void main(String [] args) {
		Doyen doyen = new Doyen(1,"achraf","youness",5);
		doyen.getInfo();
		Employe emp = new Employe(1,"achraf","youness",5,"info");
		emp.getInfo();
		Student student = new Student(1,"achraf","youness",5,"info",1002);
		student.getInfo();
		System.out.println(Student.t);
		Student.st();
	}
}
