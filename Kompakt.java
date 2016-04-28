
public class Kompakt extends Jarmu{
    protected int tengelytav;
	public Kompakt(int tengelyt,int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam) {
		// TODO Auto-generated constructor stub
		super(ev,Marka,seb,ajtok,szine,szemelyszam);
		this.tengelytav=tengelyt;
	}
    public void kiiratas(){
    	System.out.println("tengelytav:"+ tengelytav);
		System.out.println("ev:"+ gyartasiEv);
		System.out.println("marka:"+marka);
		System.out.println("sebesseg:"+sebesseg);
		System.out.println("ajtok szama:"+ajtoSzam);
		System.out.println("auto szine:"+szin);
		System.out.println("ferohely:"+szemelyekSzama);
    }
}
