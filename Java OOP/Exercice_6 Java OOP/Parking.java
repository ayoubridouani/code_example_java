public class Parking {
	private Voiture v[];
	private int nbrp;
	private int nbrt;
	public Parking(int nbrp_v) {
		this.nbrt=0;
		this.nbrp = nbrp_v;
		this.v = new Voiture[this.nbrp];
	}
	
	public boolean garer(Voiture v) {
		for(int i=0;i<nbrp;i++)
			if(this.v[i]==null) {
				this.v[i]=v;
				this.nbrt++;
				return true;
			}
		return false;
	}
	public Voiture sortir(int numero) {
		if(numero<nbrp) {
			if(this.v[numero]!=null) {
				Voiture vo=v[numero];
				v[numero]=null;
				this.nbrt--;
				return vo;
			}else {
				System.out.println("deja libre cette place");
			}
		}else {
			System.out.println("ce numero de place inconue");
		}
		  return null;
	}
	public void afficher() {
		for(int i=0;i<nbrp;i++) {
			if(v[i]==null) {
				System.out.println("la place de numero "+(i+1)+ ": est libre");
			}else {
				System.out.println("la place de numero "+(i+1)+ ": "+v[i].getNom()+ ", "+v[i].getMarque()+ ", "+v[i].getCouleur()+ ", " +v[i].getNbrc() );
				 
			}
		}	
	}
}
