package autoberlo;

public class Kiadas_Bevetel extends BerlesTipusa {
	
	static int kiadas;
	static String nev;
	
	public Kiadas_Bevetel( String nev)
	{
		super(ar);
		Kiadas_Bevetel.nev=nev;
		
	}
	
	
	void hasonlit()
	{
		int nyereseg,bevetel;
		bevetel=super.ido_valogat();
		System.out.println("A "+ nev + " utanni koltseg: " + ar);
		System.out.println("A " + nev + " utanni bevetel: "+ bevetel);
		nyereseg=bevetel-ar;
		System.out.println("A nyereseg: " + nyereseg );
		
		if(nyereseg < 0)
		{
			System.out.println("Ennyi idore nem nyereseges kiadni az autot");
		}
		
	}

}
