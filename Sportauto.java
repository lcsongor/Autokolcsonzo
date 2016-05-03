public class Sportauto extends Jarmu{
 protected int loero;
 public Sportauto(int loeros,int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam){
	super(ev,Marka,seb,ajtok,szine,szemelyszam);
	this.loero=loeros;
 }

 public  void kiiratas(){
		System.out.println("Loero:"+ loero);
		System.out.println("Ev:"+ gyartasiEv);
		System.out.println("Marka:"+marka);
		System.out.println("sebesseg:"+sebesseg);
		System.out.println("Ajtok szama:"+ajtoSzam);
		System.out.println("Auto szine:"+szin);
		System.out.println("Ferohely:"+szemelyekSzama);
		System.out.println();
 }
 
 
}

