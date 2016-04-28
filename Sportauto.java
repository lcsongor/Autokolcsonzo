
public class Sportauto extends Jarmu{
 protected int loero;
 public Sportauto(int loeros,int ev,String Marka,int seb,int ajtok,String szine,int szemelyszam){
	super(ev,Marka,seb,ajtok,szine,szemelyszam);
	this.loero=loeros;
 }

 public  void kiiratas(){
		System.out.println("loero:"+ loero);
		System.out.println("ev:"+ gyartasiEv);
		System.out.println("marka:"+marka);
		System.out.println("sebesseg:"+sebesseg);
		System.out.println("ajtok szama:"+ajtoSzam);
		System.out.println("auto szine:"+szin);
		System.out.println("ferohely:"+szemelyekSzama);
 }
 
 
}

