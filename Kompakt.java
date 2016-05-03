
public class Kompakt extends Jarmu{
    protected int tengelytav;
	public Kompakt(int tengelyt,int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam) {
		// TODO Auto-generated constructor stub
		super(ev,Marka,seb,ajtok,szine,szemelyszam);
		this.tengelytav=tengelyt;
	}
    public void kiiratas(){
    	System.out.println("Tengelytav:"+ tengelytav);
		System.out.println("ev:"+ gyartasiEv);
		System.out.println("Marka:"+marka);
		System.out.println("Sebesseg:"+sebesseg);
		System.out.println("Ajtok szama:"+ajtoSzam);
		System.out.println("Auto szine:"+szin);
		System.out.println("Ferohely:"+szemelyekSzama);
		System.out.println();
    }
}
