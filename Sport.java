
public class Sport extends Auto {

	protected int gyorsulas;
	protected int max_sebesseg;
	
	
	public Sport(int sebesseg, String valto, int fogyasztas, int ar, String allapot, int ferohelyek, int veszely, int gyorsulas, int max_sebesseg) {
		super(sebesseg, valto, fogyasztas, ar, allapot, ferohelyek, veszely);
		
		this.gyorsulas = gyorsulas;
		this.max_sebesseg = max_sebesseg;
	}
	
	public void kiir(){
		System.out.println("Sebbeseg:"+sebesseg);
		System.out.println("Valto:"+valto);
		System.out.println("Fogyasztas:"+fogyasztas);
		System.out.println("Ar:"+ar);
		System.out.println("Allapot:"+allapot);
		System.out.println("Ferohelyek:"+ferohelyek);
		System.out.println("Veszely szint:"+veszely);
		System.out.println("Gyorsulas:"+gyorsulas );
		System.out.println("Mximum sebesseg:"+max_sebesseg);
		
	}	

}
