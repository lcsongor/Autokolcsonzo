
public class Kompakt extends Auto {

	public Kompakt(int sebesseg, String valto, int fogyasztas, int ar, String allapot, int ferohelyek, int veszely) {
		super(sebesseg, valto, fogyasztas, ar, allapot, ferohelyek, veszely);
		
	}
	public void kiir(){
		System.out.println("Sebbeseg:"+sebesseg +"km/h");
		System.out.println("Valto:"+valto);
		System.out.println("Fogyasztas:"+fogyasztas +"liter/100km");
		System.out.println("Ar:"+ar);
		System.out.println("Allapot:"+allapot);
		System.out.println("Ferohelyek:"+ferohelyek);
		System.out.println("Veszely szint:"+veszely);
		
	}	
	
}
