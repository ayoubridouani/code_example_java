public class Model {
	
	private int heur;
	private int min;
	private int sec;
	
	public Model() {
		heur = 0;
		min = 0 ;
		sec = 0;
	}
	
	public String calc() {
		int res =heur*3600+min*60+sec;
		return heur+":"+min+":"+sec+"("+ res +")";
	}
	
	public void setHeur(String heur) {
		this.heur = Integer.parseInt(heur);
	}
	public void setMin(String min) {
		this.min = Integer.parseInt(min);
	}
	public void setSec(String sec) {
		this.sec = Integer.parseInt(sec);
	}
	
	
}
