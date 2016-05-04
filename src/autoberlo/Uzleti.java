package autoberlo;

public class Uzleti extends Ugyfelek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static String tulajdon;

	public Uzleti (String nev, int szemelyiszam, int jogositvanyszam, String tulajdon )
	{
		super(nev,szemelyiszam,jogositvanyszam);
		Uzleti.tulajdon=tulajdon;
		
	}
	void kiir2()
	{
		super.kiir();
		System.out.println(" -Tulajdon(ceg/magan): "+tulajdon   );
	}
	
}
