package autoberlo;

import java.util.Scanner;

public class BerlesTipusa {
	
	static int ar;
	private static Scanner scanner;
	
	public BerlesTipusa(  int ar) {
		BerlesTipusa.ar=ar;
		
	}
	

	int ido_valogat()
	{
		int dij = 0;
		int idotartam,szorzo,valaszt=0;
		
        
			
			scanner = new Scanner(System.in);
			System.out.println(" 1. Napi \n 2. Orara szamitott \n 3. Percre szamitott ");
	        valaszt=scanner.nextInt();
	        scanner.nextLine();
	        System.out.println("Irja be a berles idejet:");// n= nap , h= ora , s= perc
			idotartam=scanner.nextInt();
			
		switch(valaszt)
        {
        case  1 :
        	szorzo=2*ar;
			dij= idotartam * szorzo ;
			System.out.println( " A berles dija: "+dij+ " Ron");
			break;
        case 2 :
        	szorzo=(5*ar)/24;
			dij= idotartam * szorzo ;
			System.out.println( " A berles dija: "+dij+ " Ron");
			break;
        case  3 :	
        	szorzo=(10*ar)/1440;
			dij= idotartam * szorzo ;
			System.out.println( " A berles dija: "+dij+ " Ron");
			break;		
        default: 
       System.out.println( " Ervenytelen szam");
				
        break; 
				
	}
		return dij;
}
}
		

	

		
	
	

	


