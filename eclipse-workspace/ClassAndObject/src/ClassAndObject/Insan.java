package ClassAndObject;

public class Insan {

	int yas;
	String isim;
	
	/*Construck javada b�yle olu�turulur.Construcklarda parametreler vererek nas�l olu�turula�a�� de�i�r yani ��yle burda ikitane Insan ad�nda construck var ama 
	  Construcklar�n ald��� parametreler de�i�iyor bu y�zden ikisini �al��mas� farkl�d�r �rne�in ba�ka bir s�n�ftan Insan s�n�f� ad�n da bir nesne olu�turursak ilk 
	  consturckdakinde parametre vermden yazarsak �al���r e�er parametre vererek nesne olu�turursak ikince construck yap�s�n da �al���r. */
	public Insan() {
		yas=0;
		isim="�sim girilmedi";
		
	}
	
	public Insan(int AlinanYas,String AlinanIsim) {
		 yas=AlinanYas;
		 isim=AlinanIsim;
	}
	
}
