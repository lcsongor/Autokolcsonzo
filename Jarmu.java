package autokolcsonzotest;

public class Jarmu {

	    int JarmuNR;
	    String Alvazszam, Marka, Szin, Rendszam ;
	   
	public Jarmu(String alvszam, String mark, String szine){
	    Marka = mark;
	    Szin = szine;
	    Alvazszam = alvszam;
	}
	 

	public Jarmu(int jarmuNR2, String alvazszam2, String marka2, String szin2, String rendszam2) {
		// TODO Auto-generated constructor stub
	}
	

	public int getJarmuNR(){
	    return JarmuNR;
	}
	public String getAlvazszam(){
	    return Alvazszam;
	}
	public String getMarka(){
	    return Marka;
	}
	public String getSzin(){
	    return Szin;
	}



	public void setJarmuNR(int szam){
	    JarmuNR = szam;
	}
	public void setAlvazszam(String alvszam){
	    Alvazszam = alvszam;
	}
	public void setMarka(String mark){
	    Marka = mark;
	}
	public void setSzin(String szine){
	    Szin = szine;
	}
}