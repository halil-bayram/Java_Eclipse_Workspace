package ClassAndConstructorslar;

public class Kedi extends Hayvan {
	
	String mamaTuru;
	public Kedi(String isim,int  yas,String mamaTuru) {
		
		super(isim,yas);
		this.mamaTuru=mamaTuru;
	}
	public int islemYap(int sayi1,int sayi2) {
		
		int sonuc =super.islemYap(sayi1, sayi2);
		
		return sonuc +sayi1+sayi2;
	}
	public void sesCikar() {
		System.out.println("miyav..., ben "+yas+" yasindayim");
	}
}
