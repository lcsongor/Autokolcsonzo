
public class Varosi extends Jarmu{
   protected String valto;
	public Varosi(String valt,int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam) {
		// TODO Auto-generated constructor stub
		super(ev,Marka,seb,ajtok,szine,szemelyszam);
		this.valto=valt;
	}

	 public  void kiiratas(){
			System.out.println("valto:"+valto);
			System.out.println("ev:"+ gyartasiEv);
			System.out.println("marka:"+marka);
			System.out.println("sebesseg:"+sebesseg);
			System.out.println("ajtok szama:"+ajtoSzam);
			System.out.println("auto szine:"+szin);
			System.out.println("ferohely:"+szemelyekSzama);
	 }
}
