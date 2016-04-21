package autoberlo;

public class Varosi extends Jarmu {

	int fogyasztas;
	double motor;

	public Varosi(String model, int alvazszam, String rendszam, String szin, int fogyasztas, double motor) {
		super(model, alvazszam, rendszam, szin);
		this.fogyasztas=fogyasztas;
		this.motor = motor;
		
	}
		void kiir4(){
			super.kiir();
			System.out.println( " -Fogyasztasa: "+fogyasztas + " l \n -Motor merete: " + motor + " cm^3 ");
		
		}
	}


