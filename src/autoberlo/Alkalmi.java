package autoberlo;

public class Alkalmi extends Ugyfelek{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int helyek_szama;

	public Alkalmi (String nev, int szemelyiszam, int jogositvanyszam, int helyek_szama )
	{
		super(nev,szemelyiszam,jogositvanyszam);
		Alkalmi.helyek_szama=helyek_szama;
		
	}
	void kiir2()
	{
		super.kiir();
		System.out.println(" -Helyek szama: "+helyek_szama  );
	}
	
}
