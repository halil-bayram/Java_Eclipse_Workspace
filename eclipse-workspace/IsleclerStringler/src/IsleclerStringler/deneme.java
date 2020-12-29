package IsleclerStringler;
public class deneme {

	public static void main(String args[]) {
		
		//stringler objedir sonradan oluþturulmuþtur.integer double char logan gibi tiple varsayýlan olarak javanýn içinde bulunmaktadýr.
		
		//System.out.println erkana çýktý veriyor print'in sonundaki ln ise imlecin alt satýra geçmesini saðlýyor tek farký bu dur.
		System.out.println("Adý.");
		
		//String degiþken aþagýda olduðu gibi tanýmlanýr.
		String isim;
		//istersek string deðiþkeni tanýmlarken deðer atarýz istersek tanýmladýktan sonra deðer atarýz.
		isim="halil";
		//String deðiþkenler yazdýrýlýrken + iþareti ile birleþtirilerek yazdýrýla bilirler.
		System.out.println("Adý."+isim);
		//soyad diye bir deðiþken 
		String soyad;
		//Ýstersek stringleri deðiþken tanýmlanýrken + iþareti ilede baðlayabiliriz.
		soyad=isim+"bayram";
		
		
		//integer sayýlar için kullanýlý sayý rakamlarý bellekte tutmak için deðiþken tanýmlama tipidir.
		int sayi,deger;
		//þeklinde tanýmlana bilir.
		
		int rakam=2;
		//þeklinde de tanýmlana bilir.
		
		//deðer atamasýný isteresek stringlerdeki deðiþken tanýmlandýktan sonra deðer atanabilir.
		sayi=5;
		
		//Ekrana yazdýrmak için aþaðýdaki gibi kullanýlabilir.
		System.out.println(sayi);
		
		//integer deðerlerde ekrana yazdýrýlýrken int deðerlerde toplama çýkarma çarpma ve bölme gibi iþlemler yapýlabilir.
		System.out.println(sayi+rakam);
		
		//tabikide her programlama dilinde olduðu gibi bir iþlem önceliði vardýr.Ýþlemler her zaman çarpma ve bölmeye öncelik tanýyarak ve parantezlere öncelik saðlayarak saðdan sola doðru ilerler.
		deger=(((sayi+2)*rakam)+(sayi*(rakam+3)))*2/2;
		
		System.out.println(deger);
		
		
		//byte ikilik sayýsý=8 >> enküçük deðer=-2^7 >> en büyük deðer=2^7
		//short ikilik sayýsý=16 >> enküçük deðer=-2^15 >> en büyük deðer=2^15
		//int ikilik sayýsý=32 >> enküçük deðer=-2^31 >> en büyük deðer=2^31
		//long ikilik sayýsý=64 >> enküçük deðer=-2^63 >> en büyük deðer=2^63
		//float ikilik sayýsý=32 >> enküçük deðer=-3.4 x 10^38 7 hane >> en büyük deðer=3.4 x 10^38 ,7 hane
		//double ikilik sayýsý=64 >> enküçük deðer=-1.7 x 10^308,15 hane >> en büyük deðer=1.7 x 10^308,15 hane
		//char ikilik sayýsý=16 >> enküçük deðer= >> en büyük deðer=
		//boolean ikilik sayýsý=1 >> enküçük deðer=false >> en büyük deðer=true
		
	}
	
	
}
