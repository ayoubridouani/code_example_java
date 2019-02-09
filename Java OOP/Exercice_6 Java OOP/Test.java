
public class Test {

	public static void main(String[] args) {
	   Parking p=new Parking(100);
	   
	   Voiture v1=new Voiture("1","2","3",4);
	   Voiture v2=new Voiture("10","20","30",40);
	   Voiture v3=new Voiture("100","200","300",400);
	   Voiture v4=new Voiture("1000","2000","3000",4000);
	   
	   p.garer(v1);
	   p.garer(v2);
	   p.garer(v3);
	   p.garer(v4);
	   
	   p.sortir(2);
	   
	   p.garer(v2);
	   p.garer(v3);
	   
	   p.afficher();
	}

}
