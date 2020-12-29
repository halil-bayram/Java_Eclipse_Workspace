package deneme;

import java.util.Scanner;
public class odev {

public static void main(String args[]) {
		
	Scanner scan =new Scanner(System.in);
	Scanner islem =new Scanner(System.in);
	System.out.print("Lütfen 1.sayý giriniz");
	int sayi1=scan.nextInt();
	System.out.print("Lütfen 2.sayý giriniz");
	int sayi2=scan.nextInt();
	System.out.print("Lütfen yapýlacak islemi seciniz\n 1-Toplama \n 2-Çýkarma \n 3-Çarpma \n 4-Bölme");
	int islemyap=islem.nextInt();
	
	if(islemyap==1) {
		System.out.print("Girdiðiniz Sayýlarýn Toplamý");
		System.out.print(sayi1+sayi2);
	}
	else if(islemyap==2) {
		System.out.print("Girdiðiniz Sayýlarýn Farký");
		System.out.print(sayi1-sayi2);
	}
	else if(islemyap==3) {
		System.out.print("Girdiðiniz Sayýlarýn Bölümü");
		System.out.print(sayi1/sayi2);
	}
	else if(islemyap==4) {
		System.out.print("Girdiðiniz Sayýlarýn Çarpýmý");
		System.out.print(sayi1*sayi2);
	}
}
}