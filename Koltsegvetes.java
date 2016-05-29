
public class Koltsegvetes {
	protected int egyenleg;
	protected int kiadasok;
	
	public Koltsegvetes(int egyenleg, int kiadasok) {
		this.egyenleg = egyenleg;
		this.kiadasok = kiadasok;
	}
	
	public void kotseg(int osszeg){
		egyenleg = egyenleg - osszeg;
	}
	
	public void bevetel(int osszeg){
		egyenleg = egyenleg + osszeg;
	}
}
