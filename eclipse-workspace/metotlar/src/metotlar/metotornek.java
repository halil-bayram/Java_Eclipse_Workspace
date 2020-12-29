package metotlar;

import java.util.*;
public class metotornek {

	
	public static void main(String args[]) {
		
		Scanner tara =new Scanner(System.in);
		System.out.print("isminizi giriniz: ");
		String disim=tara.nextLine();
		System.out.print("Soyisminizi giriniz: ");
		String dsoyisim=tara.nextLine();
		
		seslen(disim,dsoyisim);
		
		int carp=topla(4,6);
		System.out.print("Sayýlarýn Toplamý: " + (carp*2));
		
	}
	public static void seslen(String isim,String soyisim) {
		System.out.println("Merhaba "+isim+" "+soyisim);
	}
	
	public static int topla(int a,int b) {
		int c=a+b;
		
		return c;
		
	}
}
