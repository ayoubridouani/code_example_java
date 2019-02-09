
public class Main {

	public static void main(String[] args) throws Exception {
		 Person P1 = new Person ("Ali Elomari",25);
		 System.out.println(P1.toString());
		 Employe P2 = new Employe ("Ali Elomari",25,3);
		 System.out.println(P2.toString());
		 Training n = new TrainingEmploye("Ali Elomari",25,3,true);
		 System.out.println(n.toString());
		 	n.AgencyManaging();
			n.ExcelTraining();
	}

}
