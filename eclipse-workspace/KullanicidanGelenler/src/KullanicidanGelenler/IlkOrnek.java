package KullanicidanGelenler;

import java.util.Scanner;
public class IlkOrnek {

	public static void main(String args[]) {
		  
		Scanner tara=new Scanner(System.in);
		System.out.println("Ad�n�z� Giriniz:");
		String isim;
		
		isim=tara.nextLine();
		
		System.out.println("Ho�geldin "+isim);
		/*�flerde integer char double boolean t�r�nde de�i�ken kar��la�t�r�l�rken normal e�it veya e�it de�ildir ifadeleri kullan�l�r
		  ama stringlerde �yle de�ildir. stringlerde kar��la�t�rma equals metodu ile kar��la�t�r�l�r.equals boolean t�r�nde bir geri d�n�� yapar. B�y�k k���k ve ingilizce karakterlere dikkat edilmelidir.Kullan�m� a�ag�daki gibidir. */
	
		
		if(isim.equals("halil")) {
			System.out.println("if yap�s�na girdi...");
		}
	}
	
}
