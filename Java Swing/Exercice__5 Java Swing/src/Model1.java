public class Model1 {
	
	private int heur;
	private int min;
	private int sec;
	
	public Model1() {
		heur = 0;
		min = 0 ;
		sec = 0;
	}
	
	public String calc1() {
		int res =(heur+1)*3600+min*60+sec;
		return (heur+1)+":"+min+":"+sec+"("+ res +")";
	}
	public String calc2() {
		int res =(heur-6)*3600+min*60+sec;
		return (heur-6)+":"+min+":"+sec+"("+ res +")";
	}
	public String calc3() {
		int res =(heur+4)*3600+min*60+sec;
		return (heur+4)+":"+min+":"+sec+"("+ res +")";
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
