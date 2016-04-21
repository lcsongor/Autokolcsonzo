package autoberlo;

public class Csaladi extends Jarmu {

	protected static String biztonsag;
	protected static int gyerekules;
	
	public Csaladi(String model, int alvazszam, String rendszam, String szin, String biztonsag, int gyerekules) {
		super(model, alvazszam, rendszam, szin);
		Csaladi.biztonsag=biztonsag;
		Csaladi.gyerekules=gyerekules;
	}
	void kiir5()
	{
		super.kiir();
		System.out.println( " -Bitonsagi minosites: " +biztonsag + "\n -Gyerekulesek szama: " + gyerekules + " db" );
	}
}
 
