package autoberlo;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		int a=0;
		
		    
	    while(a!=6)
	    {
	    	System.out.println(" 1. Teherauto \n 2. Sport auto \n 3. Kompakt \n 4. Varosi kisauto \n 5. Csaladi auto \n 6. Kilep");
		    System.out.print("Irja be milyen autot szeretne:");
		    a =new Scanner(System.in).nextInt();
		    
	    	switch(a)
	    	{
	    	case 1:
	    		Furgon  Volvo = new Furgon( "Volvo", 275056413 , "CV 13 SEB" , "Piros", 5000, 210);
	    		Volvo.kiir1(); break;
	    	case 2:
	    		Sport   Ferarri = new Sport (  "Ferarri" , 716513280 , "CV 54 HGF", "Fekete", 320 , 3 , "Cabrio"  );
	    		Ferarri.kiir2();break;
	    	case 3:
	    		int t=0;
	    		System.out.println("Irja be a kenyelmi szintet (1-10):");
	    	    t =new Scanner(System.in).nextInt();
	    	    Kenyelem(t); break;
	    	case 4:
	    		Varosi Volkswagen = new Varosi("Volkswagen Polo", 246513634, "SM 76 HYD", "Feher", 4, 1.6 );
	    	    Volkswagen.kiir4();break;
	    	case 5:
	    		int c=0;
	    		System.out.println("Irja be a hany biztonsagi csillaga legyen a kivant autonak (1-5):");
	    	    c =new Scanner(System.in).nextInt();
	    	    toresteszt_csillag(c); break;

	    	}
	    }	
	   
	    
	
	}
	
	static void Kenyelem(int kenyelmi_szint)
	{
		if( kenyelmi_szint <= 3 )
		{
			Kompakt a= new Kompakt("Dacia", 1556132480, "B 89 DFF " , "Zold", 2000, "Alacsony "  );
			a.kiir3();
		} else if( kenyelmi_szint <= 7)
		{
				Kompakt b= new Kompakt("Volkswagen", 313156500, "B 843 KCP " , "Magenta", 5000, "Kozepes "  );
				b.kiir3();
		}else if( kenyelmi_szint <= 10)
		{
			Kompakt c= new Kompakt("Mercedes", 501431300, "CT 90 LEV " , "Sarga", 2300, "Magas "  );
			c.kiir3();
		}
		

		 
	 }
	
 static void toresteszt_csillag(int biztonsag)
 {
	 if( biztonsag <= 2 )
		{
				Csaladi a= new Csaladi("Chrysler Grand Voyager", 1231331580, "CJ 67 UYT " , "Zold", "Alacsony " , 0 );
				a.kiir5();
		} else if( biztonsag <= 4)
		{
				Csaladi b= new Csaladi("Volkswagen Sharan", 351981380, "CJ 84 OOP " , "Piros", "Kozepes ", 1  );
				b.kiir5();
		}else if( biztonsag <= 5)
		{
				Csaladi c= new Csaladi("BMW Gran Tourer", 1153316580, "CJ 90 RTY " , "Fekete","Magas ", 2 );
				c.kiir5();
		}
	 
 }
 }

