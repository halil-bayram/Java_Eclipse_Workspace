package deneme;

import java.util.Scanner;
public class odev {

public static void main(String args[]) {
		
	Scanner scan =new Scanner(System.in);
	Scanner islem =new Scanner(System.in);
	System.out.print("L�tfen 1.say� giriniz");
	int sayi1=scan.nextInt();
	System.out.print("L�tfen 2.say� giriniz");
	int sayi2=scan.nextInt();
	System.out.print("L�tfen yap�lacak islemi seciniz\n 1-Toplama \n 2-��karma \n 3-�arpma \n 4-B�lme");
	int islemyap=islem.nextInt();
	
	if(islemyap==1) {
		System.out.print("Girdi�iniz Say�lar�n Toplam�");
		System.out.print(sayi1+sayi2);
	}
	else if(islemyap==2) {
		System.out.print("Girdi�iniz Say�lar�n Fark�");
		System.out.print(sayi1-sayi2);
	}
	else if(islemyap==3) {
		System.out.print("Girdi�iniz Say�lar�n B�l�m�");
		System.out.print(sayi1/sayi2);
	}
	else if(islemyap==4) {
		System.out.print("Girdi�iniz Say�lar�n �arp�m�");
		System.out.print(sayi1*sayi2);
	}
}
}