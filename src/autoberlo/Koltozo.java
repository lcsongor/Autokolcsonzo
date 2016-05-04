package autoberlo;

public class Koltozo extends Ugyfelek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
static String uti_cel;

public Koltozo (String nev, int szemelyiszam, int jogositvanyszam, String uti_cel )
{
	super(nev,szemelyiszam,jogositvanyszam);
	Koltozo.uti_cel=uti_cel;
	
}
void kiir2()
{
	super.kiir();
	System.out.println(" -Uti cel(belfold/kulfold): "+uti_cel   );
}
}
