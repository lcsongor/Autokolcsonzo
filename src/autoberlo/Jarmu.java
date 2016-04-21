package autoberlo;

public class Jarmu{
	
 static  int alvazszam;
 static  String model;
 static  String rendszam;
 static  String  szin;

public Jarmu(String model, int alvazszam, String rendszam, String szin  )
{
	Jarmu.model=model;
	Jarmu.alvazszam=alvazszam;
	Jarmu.rendszam=rendszam;
	Jarmu.szin=szin;

	
}

void kiir()
{
	System.out.println( " Az auto: \n -Alvazszama: " +alvazszam + "\n -Markaja: " + model + "\n -Rendszama: " + rendszam + "\n -Szine: " + szin );
}
}
	
	

