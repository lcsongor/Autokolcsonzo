
public class Furgon extends Auto {

	protected int teherbiras;
	public Furgon(int sebesseg, String valto, int fogyasztas, int ar, String allapot, int ferohelyek, int veszely, int teherbiras) {
		super(sebesseg, valto, fogyasztas, ar, allapot, ferohelyek, veszely);
		
		this.teherbiras = teherbiras;
		
	}
	public void kiir(){
		System.out.println("Sebbeseg:"+sebesseg +"km/h");
		System.out.println("Valto:"+valto);
		System.out.println("Fogyasztas:"+fogyasztas +"liter/100km");
		System.out.println("Ar:"+ar);
		System.out.println("Allapot:"+allapot);
		System.out.println("Ferohelyek:"+ferohelyek);
		System.out.println("Veszely szint:"+veszely);
		System.out.println("Teherbiras:"+teherbiras +"kg");
		
	
	}	

}
