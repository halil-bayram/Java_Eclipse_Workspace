package ClassAndConstructorslar;

public class Kopek extends Hayvan{
	
	
	int uykuSaati;
	int hiz;
	public Kopek(String isim,int  yas,int uykuSaati,int hiz) {
				super(isim,yas);
				this.uykuSaati=uykuSaati;
				this.hiz=hiz;
	}
	public void sesCikar() {
		System.out.println("havhav..., ben "+yas+" yasindayim");
	}
}
