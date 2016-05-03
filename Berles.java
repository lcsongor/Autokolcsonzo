


public class Berles {
	protected int napi;
	protected int heti;
	protected String nemzetkozi;
	protected int carsharing;
	

	
	public Berles(int nap, int het, String nemzet,int car){
		this.napi=nap;
		this.heti=het;
		this.nemzetkozi=nemzet;
		this.carsharing=car;
		
	}
	
   public void kiirasberles(){
	   if (napi > 0){
		    System.out.println("Napi:"+ napi);
	   System.out.println("");}
	   else
	   if (heti > 0){
		System.out.println("Heti:"+ heti);
	   System.out.println("");}
	   else
	   if (nemzetkozi != ""){
		System.out.println("Nemzetkozi:"+ nemzetkozi);
	   System.out.println("");}
	   else
	   if (carsharing > 0){
		System.out.println("Carshareing:"+ carsharing);
	   System.out.println("");}
	   }
   }
