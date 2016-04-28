
public class Csaladi extends Jarmu {
		private String gyerekUles;
		public Csaladi(String gyUles,int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam){
			super(ev, Marka,seb,ajtok,szine,szemelyszam);
			this.gyerekUles=gyUles;
		}
	public void kiiratas(){
		System.out.println("gyerekules:"+gyerekUles);
		System.out.println("ev:"+gyartasiEv);
		System.out.println("marka:"+marka);
		System.out.println("sebesseg:"+sebesseg);
		System.out.println("ajtok szama:"+ajtoSzam);
		System.out.println("szin:"+szin);
		System.out.println("ferohely:"+szemelyekSzama);
		
		
	}

}
