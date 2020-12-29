package KullanicidanGelenler;

import java.util.Scanner;
public class IlkOrnek {

	public static void main(String args[]) {
		  
		Scanner tara=new Scanner(System.in);
		System.out.println("Adýnýzý Giriniz:");
		String isim;
		
		isim=tara.nextLine();
		
		System.out.println("Hoþgeldin "+isim);
		/*Ýflerde integer char double boolean türünde deðiþken karþýlaþtýrýlýrken normal eþit veya eþit deðildir ifadeleri kullanýlýr
		  ama stringlerde öyle deðildir. stringlerde karþýlaþtýrma equals metodu ile karþýlaþtýrýlýr.equals boolean türünde bir geri dönüþ yapar. Büyük küçük ve ingilizce karakterlere dikkat edilmelidir.Kullanýmý aþagýdaki gibidir. */
	
		
		if(isim.equals("halil")) {
			System.out.println("if yapýsýna girdi...");
		}
	}
	
}
