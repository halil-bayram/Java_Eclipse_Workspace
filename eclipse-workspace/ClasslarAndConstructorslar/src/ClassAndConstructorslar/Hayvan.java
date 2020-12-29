package ClassAndConstructorslar;

public class Hayvan {
	int yas;
	String isim;
	
	public Hayvan(String isim,int yas) {
		this.isim=isim;
		this.yas=yas;
	} 
	
	public int islemYap(int a,int b) {
		
		return a*(b+3);
	}
	
	public void yuru() {
		
		System.out.println("yürüyor...");
	}
	public void yasSoyle() {
		
		System.out.println("Yasi : "+yas);
	}
	public void sesCikar() {
		System.out.println("ben bir hayvaným...");
	}
}
