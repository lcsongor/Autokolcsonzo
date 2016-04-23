
public class Main {

	public static void main(String[] args) {
		
		
		Csaladi xyz = new Csaladi(180, "automata", 10, 85, "foglalat", 7, 3, true, true);
		xyz.kiir();
		
		Furgon abc =  new Furgon(140, "manualis", 12, 100, "szabad", 3, 4, 700);
		abc.kiir();
		
		Sport def = new Sport(300, "automata", 18, 250, "szabad", 2, 5, 2, 350);
		def.kiir();
		
		Kompakt ghi =  new Kompakt(190, "manualis", 8, 110, "foglalat", 6, 3);
		ghi.kiir();
		
		Varosi jkl =  new Varosi(130, "manualis", 9, 60, "szabad", 4, 2);
		jkl.kiir();
		
		
	}

}
