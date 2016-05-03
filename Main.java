import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
		
		int x=0;
	    while (x!=6) {//ennek a while ciklusnak a segitsegevel beolvasunk egy autotipust es amikor ki szeretnenk lepni akkor 6 billentyut nyomjuk le
	    System.out.println("1.Furgon");	
	    System.out.println("2.Sport");
	    System.out.println("3.Csalaldi");
	    System.out.println("4.Kompakt");
	    System.out.println("5.Varosi");
	    System.out.println("6.Kilepes");
	    System.out.println("Olvason be egy uj autot:");
	    x = new Scanner(System.in).nextInt(); //beolvasunk egy szamot
	    
	    
	   switch(x) // a switch abban segit, hogy a beolvasott erteknek megfelelo tipusu autot irassuk ki
	   {
	   case 1:
		   Scanner in = new Scanner(System.in);
		    System.out.print("Terfogat:");
		    int terfogat= in.nextInt();
		    System.out.print("Gyartasi ev:");
			int gyartasiEv= in.nextInt();
			System.out.print("Marka:");
			String marka = in.next();
			System.out.print("Sebesseg:");
			int sebesseg = in.nextInt();
			System.out.print("Ajtok szama:");
			int ajtoSzam = in.nextInt();
			System.out.print("Szin:");
			String szin = in.next();
			System.out.print("Ferohely:");
			int szemelyekSzama = in.nextInt();
			System.out.println("");
			Furgon auto1=new Furgon (terfogat,gyartasiEv,marka,sebesseg,ajtoSzam,szin,szemelyekSzama);//furgon tipusu auto peldanyositottunk
		    auto1.kiiratas();
	   
	   
	   break;
	   
	   case 2:
		    Scanner in1 = new Scanner(System.in);
		    System.out.print("Loero:");
			int loero = in1.nextInt();
			System.out.print("Gyartasi ev:");
			int gyartasiEv1= in1.nextInt();
			System.out.print("Marka:");
			String marka1 = in1.next();
			System.out.print("Sebesseg:");
			int sebesseg1= in1.nextInt();
			System.out.print("Ajtok szama:");
			int ajtoSzam1 = in1.nextInt();
			System.out.print("Szin:");
			String szin1 = in1.next();
			System.out.print("Ferohely:");
			int szemelyekSzama1 = in1.nextInt();
			System.out.println("");
			Sportauto auto2=new Sportauto(loero,gyartasiEv1,marka1,sebesseg1,ajtoSzam1,szin1,szemelyekSzama1);//sport tipusu auto beolvasasa es kiiratasa
		    auto2.kiiratas();
	   
	   break;
	   
	   case 3:
		   Scanner in2 = new Scanner(System.in);
		    System.out.print("Gyerekules:");
			int gyerekUles = in2.nextInt();
			System.out.print("Gyartasi ev:");
			int gyartasiEv2= in2.nextInt();
			System.out.print("Marka:");
			String marka2 = in2.next();
			System.out.print("Sebesseg:");
			int sebesseg2= in2.nextInt();
			System.out.print("Ajtok szama:");
			int ajtoSzam2 = in2.nextInt();
			System.out.print("Szin:");
			String szin2 = in2.next();
			System.out.print("Ferohely:");
			int szemelyekSzama2 = in2.nextInt();
			System.out.println("");
			Csaladi auto3=new Csaladi(gyerekUles,gyartasiEv2,marka2,sebesseg2,ajtoSzam2,szin2,szemelyekSzama2);//csaladi tipusu auto beolvasasa es kiiratasa
		    auto3.kiiratas();
			
	   break;
	   
	   case 4:
		   Scanner in3 = new Scanner(System.in);
		    System.out.print("Tengelytav:");
			int tengelytav = in3.nextInt();
			System.out.print("Gyartasi ev:");
			int gyartasiEv3= in3.nextInt();
			System.out.print("Marka:");
			String marka3 = in3.next();
			System.out.print("Sebesseg:");
			int sebesseg3= in3.nextInt();
			System.out.print("Ajtok szama:");
			int ajtoSzam3 = in3.nextInt();
			System.out.print("Szin:");
			String szin3 = in3.next();
			System.out.print("Ferohely:");
			int szemelyekSzama3 = in3.nextInt();
			System.out.println("");
		
			Kompakt auto4=new Kompakt(tengelytav,gyartasiEv3,marka3,sebesseg3,ajtoSzam3,szin3,szemelyekSzama3);//Kompakt tipusu auto beolvasasa es kiiratasa
			auto4.kiiratas();
			
	   break;
	  
	   case 5:
		   Scanner in4 = new Scanner(System.in);
		    System.out.print("Valto:");
			int valto = in4.nextInt();
			System.out.print("Gyartasi ev:");
			int gyartasiEv4= in4.nextInt();
			System.out.print("Marka:");
			String marka4 = in4.next();
			System.out.print("Sebesseg:");
			int sebesseg4= in4.nextInt();
			System.out.print("Ajtok szama:");
			int ajtoSzam4 = in4.nextInt();
			System.out.print("Szin:");
			String szin4 = in4.next();
			System.out.print("Ferohely:");
			int szemelyekSzama4 = in4.nextInt();
			System.out.println("");
			Varosi auto5=new Varosi(valto,gyartasiEv4,marka4,sebesseg4,ajtoSzam4,szin4,szemelyekSzama4);//varosi tipusu auto beolvasasa es kiiratasa
			 auto5.kiiratas();
			
	   
	   
	   }
		}
	    //Ugyfel beolvasasa
	    int y=0;
	    System.out.println("Olvason be egy uj ugyfelet:");
	    while (y!=6) {//ennek a while ciklusnak a segitsegevel beolvasunk egy ugyfelet es amikor ki szeretnenk lepni akkor 6 billentyut nyomjuk le
	    System.out.println("1.Uzleti");	
	    System.out.println("2.Rendszeres");
	    System.out.println("3.Alkalami");
	    System.out.println("4.Carsharing");
	    System.out.println("5.Moving");
	    System.out.println("6.Kilepes");
	    System.out.println("Olvason be egy uj autot:");
	    y = new Scanner(System.in).nextInt(); //beolvasunk egy szamot
	    switch(y){
	    case 1:
	    	Scanner in5 = new Scanner(System.in);
	    	System.out.print("Nev:");
			String nev = in5.next();
			System.out.print("Kor:");
			int kor= in5.nextInt();
			System.out.print("Nem:");
			String nem = in5.next();
			System.out.print("Elerhetoseg:");
			int elerhetoseg= in5.nextInt();
			System.out.print("Biztositas:");
			String biztositas = in5.next();
			System.out.println("");
			Ugyfel Ugyfel1 = new Ugyfel(nev,kor,nem,elerhetoseg,biztositas);
			Ugyfel1.kiirasugyfel();
			break;
	    case 2:
	    	Scanner in6 = new Scanner(System.in);
	    	System.out.print("Nev:");
			String nev1 = in6.next();
			System.out.print("Kor:");
			int kor1= in6.nextInt();
			System.out.print("Nem:");
			String nem1 = in6.next();
			System.out.print("Elerhetoseg:");
			int elerhetoseg1= in6.nextInt();
			System.out.print("Biztositas:");
			String biztositas1 = in6.next();
			System.out.println("");
			Ugyfel Ugyfel2 = new Ugyfel(nev1,kor1,nem1,elerhetoseg1,biztositas1);
			Ugyfel2.kiirasugyfel();
			break;
	    case 3:
	    	Scanner in7 = new Scanner(System.in);
	    	System.out.print("Nev:");
			String nev2 = in7.next();
			System.out.print("Kor:");
			int kor2= in7.nextInt();
			System.out.print("Nem:");
			String nem2= in7.next();
			System.out.print("Elerhetoseg:");
			int elerhetoseg2= in7.nextInt();
			System.out.print("Biztositas:");
			String biztositas2 = in7.next();
			System.out.println("");
			Ugyfel Ugyfel3 = new Ugyfel(nev2,kor2,nem2,elerhetoseg2,biztositas2);
			Ugyfel3.kiirasugyfel();
			break;
	    case 4:
	    	Scanner in8 = new Scanner(System.in);
	    	System.out.print("Nev:");
			String nev3 = in8.next();
			System.out.print("Kor:");
			int kor3= in8.nextInt();
			System.out.print("Nem:");
			String nem3 = in8.next();
			System.out.print("Elerhetoseg:");
			int elerhetoseg3= in8.nextInt();
			System.out.print("Biztositas:");
			String biztositas3 = in8.next();
			System.out.println("");
			Ugyfel Ugyfel4 = new Ugyfel(nev3,kor3,nem3,elerhetoseg3,biztositas3);
			Ugyfel4.kiirasugyfel();
			break;
	    case 5:
	    	Scanner in9 = new Scanner(System.in);
	    	System.out.print("Nev:");
			String nev4 = in9.next();
			System.out.print("Kor:");
			int kor4= in9.nextInt();
			System.out.print("Nem:");
			String nem4 = in9.next();
			System.out.print("Elerhetoseg:");
			int elerhetoseg4= in9.nextInt();
			System.out.print("Biztositas:");
			String biztositas4 = in9.next();
			System.out.println("");
			Ugyfel Ugyfel5 = new Ugyfel(nev4,kor4,nem4,elerhetoseg4,biztositas4);
			Ugyfel5.kiirasugyfel();
			break;
	   
	    }
	    }
	    
	   // System.out.println("Beolvasott autok:");
	    //System.out.println("Beolvasott ugyfelek:");
	    
		System.out.println("Berles1:");
		Berles Berles1 = new Berles(0, 2, null, 0);
		Berles1.kiirasberles();
		
		System.out.println("Berles2:");
		Berles Berles2 = new Berles(5, 0, "Nemetorszag", 0);
		Berles2.kiirasberles();
		
	}
		}

		
	//}



