public class TrainingEmploye extends Employe implements Training  {
	private boolean Certificat;
	public TrainingEmploye(String name , int age , int nyw , boolean Certificat) {
		super(name,age,nyw);
		this.Certificat = Certificat;
	}
	public void AgencyManaging() throws IllegalArgumentException{
			if(this.getNyw()<10) {
				throw new IllegalArgumentException(this.toString());
				}
			else{
				System.out.println(this.toString()+ " is eligible for agency managment internship");
			}
	}
	public void ExcelTraining() {
		if(Certificat) 
			System.out.println("Excel acquired by "+this.toString());
	}
	
}
