package ClassAndObject;

public class Insan {

	int yas;
	String isim;
	
	/*Construck javada böyle oluþturulur.Construcklarda parametreler vererek nasýl oluþturulaçaðý deðiþr yani þöyle burda ikitane Insan adýnda construck var ama 
	  Construcklarýn aldýðý parametreler deðiþiyor bu yüzden ikisini çalýþmasý farklýdýr örneðin baþka bir sýnýftan Insan sýnýfý adýn da bir nesne oluþturursak ilk 
	  consturckdakinde parametre vermden yazarsak çalýþýr eðer parametre vererek nesne oluþturursak ikince construck yapýsýn da çalýþýr. */
	public Insan() {
		yas=0;
		isim="Ýsim girilmedi";
		
	}
	
	public Insan(int AlinanYas,String AlinanIsim) {
		 yas=AlinanYas;
		 isim=AlinanIsim;
	}
	
}
