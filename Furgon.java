

public class Furgon extends Jarmu{
	private int terfogat;
	public Furgon(int terf, int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam) {
		// TODO Auto-generated constructor stub
		super(ev,Marka,seb,ajtok,szine,szemelyszam);
		this.terfogat=terf;
		
		
	}

	public void kiiratas(){
		System.out.println("Terfogat:"+terfogat);
		System.out.println("Ev:"+gyartasiEv);
		System.out.println("Marka:"+marka);
		System.out.println("Sebesseg:"+sebesseg);
		System.out.println("Ajtok szama:"+ajtoSzam);
		System.out.println("Auto szine:"+szin);
		System.out.println("Ferohely:"+szemelyekSzama);
		System.out.println();
		
	}
}
