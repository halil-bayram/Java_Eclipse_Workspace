package IsleclerStringler;
public class deneme {

	public static void main(String args[]) {
		
		//stringler objedir sonradan olu�turulmu�tur.integer double char logan gibi tiple varsay�lan olarak javan�n i�inde bulunmaktad�r.
		
		//System.out.println erkana ��kt� veriyor print'in sonundaki ln ise imlecin alt sat�ra ge�mesini sa�l�yor tek fark� bu dur.
		System.out.println("Ad�.");
		
		//String degi�ken a�ag�da oldu�u gibi tan�mlan�r.
		String isim;
		//istersek string de�i�keni tan�mlarken de�er atar�z istersek tan�mlad�ktan sonra de�er atar�z.
		isim="halil";
		//String de�i�kenler yazd�r�l�rken + i�areti ile birle�tirilerek yazd�r�la bilirler.
		System.out.println("Ad�."+isim);
		//soyad diye bir de�i�ken 
		String soyad;
		//�stersek stringleri de�i�ken tan�mlan�rken + i�areti ilede ba�layabiliriz.
		soyad=isim+"bayram";
		
		
		//integer say�lar i�in kullan�l� say� rakamlar� bellekte tutmak i�in de�i�ken tan�mlama tipidir.
		int sayi,deger;
		//�eklinde tan�mlana bilir.
		
		int rakam=2;
		//�eklinde de tan�mlana bilir.
		
		//de�er atamas�n� isteresek stringlerdeki de�i�ken tan�mland�ktan sonra de�er atanabilir.
		sayi=5;
		
		//Ekrana yazd�rmak i�in a�a��daki gibi kullan�labilir.
		System.out.println(sayi);
		
		//integer de�erlerde ekrana yazd�r�l�rken int de�erlerde toplama ��karma �arpma ve b�lme gibi i�lemler yap�labilir.
		System.out.println(sayi+rakam);
		
		//tabikide her programlama dilinde oldu�u gibi bir i�lem �nceli�i vard�r.��lemler her zaman �arpma ve b�lmeye �ncelik tan�yarak ve parantezlere �ncelik sa�layarak sa�dan sola do�ru ilerler.
		deger=(((sayi+2)*rakam)+(sayi*(rakam+3)))*2/2;
		
		System.out.println(deger);
		
		
		//byte ikilik say�s�=8 >> enk���k de�er=-2^7 >> en b�y�k de�er=2^7
		//short ikilik say�s�=16 >> enk���k de�er=-2^15 >> en b�y�k de�er=2^15
		//int ikilik say�s�=32 >> enk���k de�er=-2^31 >> en b�y�k de�er=2^31
		//long ikilik say�s�=64 >> enk���k de�er=-2^63 >> en b�y�k de�er=2^63
		//float ikilik say�s�=32 >> enk���k de�er=-3.4 x 10^38 7 hane >> en b�y�k de�er=3.4 x 10^38 ,7 hane
		//double ikilik say�s�=64 >> enk���k de�er=-1.7 x 10^308,15 hane >> en b�y�k de�er=1.7 x 10^308,15 hane
		//char ikilik say�s�=16 >> enk���k de�er= >> en b�y�k de�er=
		//boolean ikilik say�s�=1 >> enk���k de�er=false >> en b�y�k de�er=true
		
	}
	
	
}
