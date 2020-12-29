package ClassAndObject;

public class dInsan {

	private int yas;
	private String isim;
	
	
	public dInsan() {
		setYas(-1);
		setIsim("isimgirilmedi");
	}
	
	public dInsan(int alinanYas,String alinanIsim) {
		setYas(alinanYas);
		setIsim(alinanIsim);
		
	}
	public void selamla(){
		System.out.println("Merhaba benim adým "+isim);
	}
	public void biriniSelamla(dInsan gelenInsan) {
		System.out.println("Merhaba, "+gelenInsan.getIsim() +" benim adým "+isim+". Nasýlsýn? ");
	}
	
	public void sayiSay(int baslangic,int son) {
		
		int sayi=baslangic;
		while(sayi <=son) {
			System.out.println(sayi);
			sayi++;
		}
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}
