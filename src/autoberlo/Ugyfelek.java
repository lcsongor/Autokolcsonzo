package autoberlo;

public class Ugyfelek {

	public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub
		static String nev;
		static int szemelyiszam;
		static int jogositvanyszam;
	
	public Ugyfelek (String nev, int szemelyiszam, int jogositvanyszam)
	{
		Ugyfelek.nev=nev;
		Ugyfelek.szemelyiszam=szemelyiszam;
		Ugyfelek.jogositvanyszam=jogositvanyszam;

	}

	void kiir()
	{
		System.out.println( " Az ugyfel: \n -Neve: " +nev + "\n -Szemelyi szama: " + szemelyiszam + "\n -Jogositvany szama: " + jogositvanyszam );
		
	}
	}
