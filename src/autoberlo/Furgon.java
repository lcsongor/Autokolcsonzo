package autoberlo;

public class Furgon extends Jarmu {
	
	static int rakhato_suly;
	static double magassag;
	
	
	
	public	Furgon( String model, int alvazszam, String rendszam, String szin, int rakhato_suly, double magassag )
 {
	 super(model, alvazszam, rendszam, szin);
	 Furgon.rakhato_suly=rakhato_suly;
	 Furgon.magassag = magassag;
	 
	 
 }
	
	void kiir1()
	{
		super.kiir();
		System.out.println(" -Rakhato sulya: "+rakhato_suly + " kg \n -Rakter magassaga: " + magassag +  " cm"  );
	}
	
	
	

}
