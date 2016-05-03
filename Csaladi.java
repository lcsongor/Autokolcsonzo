public class Csaladi extends Jarmu {
		private int gyerekUles;
		public Csaladi(int gyerekUles2,int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam){
			super(ev, Marka,seb,ajtok,szine,szemelyszam);
			this.gyerekUles=gyerekUles2;
		}
	public void kiiratas(){
		System.out.println("Gyerekules:"+gyerekUles);
		System.out.println("Gyartasiev:"+gyartasiEv);
		System.out.println("Marka:"+marka);
		System.out.println("Sebesseg:"+sebesseg);
		System.out.println("Ajtok szama:"+ajtoSzam);
		System.out.println("Szin:"+szin);
		System.out.println("Ferohely:"+szemelyekSzama);
		System.out.println();
		
	}

}
