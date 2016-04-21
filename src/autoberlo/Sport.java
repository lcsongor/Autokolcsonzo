package autoberlo;

public class Sport extends Jarmu  {

	protected static int gyorsulas;
	protected static String tipus;
	protected static int vegsebesseg;
	
	
	public Sport( String model, int alvazszam, String rendszam, String szin, int vegsebesseg,int gyorsulas, String tipus ) {
		super(model, alvazszam, rendszam, szin);
		Sport.gyorsulas=gyorsulas;
		Sport.tipus=tipus;
		Sport.vegsebesseg=vegsebesseg;
	}
	
	void kiir2()
	{
		super.kiir();
		System.out.println(" -Vegsebesseg: "+vegsebesseg +" km/h \n -Hany masodperc alatt gyorsul 100km/h-ra: " +gyorsulas + " sec \n -Tipusa: " + tipus );
	}

}
