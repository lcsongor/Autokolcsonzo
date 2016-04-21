package autoberlo;

public class Kompakt extends Jarmu {

	static int csomagter;
	static String   kenyelmi_szint;
	
	public Kompakt( String model, int alvazszam, String rendszam, String szin,int csomagter,String kenyelmi_szint ) {
		super(model, alvazszam, rendszam, szin);
		Kompakt.csomagter = csomagter;
		Kompakt.kenyelmi_szint = kenyelmi_szint;
		
	}
	
	

	void kiir3()
	{
		super.kiir();
		System.out.println( " -Csomagter merete: " +csomagter+ " l \n -Kenyelem: " + kenyelmi_szint );
	}
	
	
}
