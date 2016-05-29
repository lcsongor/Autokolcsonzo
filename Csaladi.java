
public class Csaladi extends Auto {

	protected boolean gyerekules;
	protected boolean csomagtarto;
	
	public Csaladi(int sebesseg, String valto, int fogyasztas, int ar, String allapot, int ferohelyek, int veszely, boolean gyerekules, boolean csomagtarto) {
		super(sebesseg, valto, fogyasztas, ar, allapot, ferohelyek, veszely);
		this.gyerekules =  gyerekules;
		this.csomagtarto = csomagtarto;
		
	}
	public void kiir(){
		System.out.println("Sebbeseg:"+sebesseg +"km/h");
		System.out.println("Valto:"+valto);
		System.out.println("Fogyasztas:"+fogyasztas +"liter/100km");
		System.out.println("Ar:"+ar);
		System.out.println("Allapot:"+allapot);
		System.out.println("Ferohelyek:"+ferohelyek);
		System.out.println("Veszely szint:"+veszely);
		System.out.println("Gyerekules:"+gyerekules);
		System.out.println("Csomagtarto:"+csomagtarto);
	}

	

}
