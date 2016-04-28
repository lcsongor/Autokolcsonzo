
public class Jarmu {
	protected int gyartasiEv;
	protected String marka;
	protected int sebesseg;
	protected int ajtoSzam;
	protected String szin;
	protected int szemelyekSzama;
	
	
	public Jarmu(int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam){
		this.gyartasiEv=ev;
		this.marka=Marka;
		this.sebesseg=seb;
		this.ajtoSzam=ajtok;
		this.szin=szine;
		this.szemelyekSzama=szemelyszam;
		
	}
	
    public void Szarmazas(String ceg,int ar){
    	
    }
    
    public void Biztonsag(int sebesseg,int suly, boolean biztositas){
    	
    }
}
