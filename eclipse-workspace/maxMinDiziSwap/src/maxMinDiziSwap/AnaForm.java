package maxMinDiziSwap;

import java.util.Scanner;

public class AnaForm {

	public static void main(String[] args) {
		PazarListesi liste= new PazarListesi(10);
		Scanner tara=new Scanner(System.in);
		liste.listeyeEkle("Ekmek");
		liste.listeyeEkle("Su");
		liste.listeyeEkle("Gofret");
		liste.listeyeEkle("balik");
		liste.listeyeEkle("bal");
		liste.listeyeEkle("ezme");
		System.out.println("----------�lk Hali:----------");
		liste.yaz();
		System.out.println(liste.max());
		System.out.println("----------S�ralanmis hali----------");
		System.out.println(liste.min());
		
		
		/*System.out.println("Silinecek De�eri Giriniz:");
		int a=tara.nextInt();
		 liste.sil(a);
		
		 System.out.println("----------Son Hali:-----------");
		 liste.yaz();
			
		 System.out.println("Eklenecek index Giriniz:");
		 int b=tara.nextInt();
		 System.out.println("Eklenecek Eleman� Giriniz:");
		 String c=tara.next();
		 liste.ekle(c, b);
		 System.out.println("----------Son Hali:-----------");
		liste.yaz();*/
		

	}

}
